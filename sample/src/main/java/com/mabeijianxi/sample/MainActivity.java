package com.mabeijianxi.sample;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.mabeijianxi.jianxiexpression.ExpressionGridFragment;
import com.mabeijianxi.jianxiexpression.ExpressionShowFragment;
import com.mabeijianxi.jianxiexpression.widget.ExpressionEditText;


/**
 * Created by jian on 2016/6/24 19:35
 * mabeijianxi@gmail.com
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener, ExpressionGridFragment.ExpressionClickListener {

    private ExpressionEditText et_send_content;
    private int supportSoftInputHeight;
    private RelativeLayout rl_root;
    private boolean keyboardShown;
    private LinearLayout ll_emogi;
    private FrameLayout fl_emogi;
    private boolean isEmogiShow;
    private ImageView iv_emogi;
    private ExpressionShowFragment expressionShowFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initEvent();
    }


    /**
     * @param rootView
     * @return b
     * 判断键盘弹出状态
     */
    private boolean isKeyboardShown(View rootView) {
        final int softKeyboardHeight = 100;
        Rect r = new Rect();
        rootView.getWindowVisibleDisplayFrame(r);
        DisplayMetrics dm = rootView.getResources().getDisplayMetrics();
        int heightDiff = rootView.getBottom() - r.bottom;
        return heightDiff > softKeyboardHeight * dm.density;
    }

    /**
     * 动态监听键盘状态
     */
    private void setListenerToRootView() {
        rl_root.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                keyboardShown = isKeyboardShown(rl_root);
                if (fl_emogi != null && ll_emogi != null) {
                    if (keyboardShown) {
                        if (ll_emogi.getVisibility() != View.VISIBLE || supportSoftInputHeight != getSupportSoftInputHeight()) {
                            iv_emogi.setImageResource(R.drawable.fabu_biaoqing_icon);
                            isEmogiShow = false;
                            rl_root.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                            supportSoftInputHeight = getSupportSoftInputHeight();
                            fl_emogi.getLayoutParams().height = supportSoftInputHeight;
                            fl_emogi.requestLayout();
                            fl_emogi.setVisibility(View.INVISIBLE);
                            ll_emogi.setVisibility(View.VISIBLE);
                            rl_root.getViewTreeObserver().addOnGlobalLayoutListener(this);
                        }
                    } else {
                        if (!isEmogiShow) {
                            fl_emogi.setVisibility(View.INVISIBLE);
                            ll_emogi.setVisibility(View.GONE);
                            iv_emogi.setImageResource(R.drawable.fabu_biaoqing_icon);
                        }
                    }
                }
            }
        });
    }

    private void initView() {
        et_send_content = (ExpressionEditText) findViewById(R.id.et_send_content);
        ll_emogi = (LinearLayout) findViewById(R.id.ll_emogi);
        rl_root = (RelativeLayout) findViewById(R.id.rl_root);
        fl_emogi = (FrameLayout) findViewById(R.id.fl_emogi);
        iv_emogi = (ImageView) findViewById(R.id.iv_emogi);
    }

    private void initEvent() {
        et_send_content.setOnClickListener(this);
        iv_emogi.setOnClickListener(this);
        setRootOnTouchListener();
        setListenerToRootView();

    }

    private void setRootOnTouchListener() {
        rl_root.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                hideKeyboard(MainActivity.this);
                return false;
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.et_send_content:
                isEmogiShow = false;
                iv_emogi.setImageResource(R.drawable.fabu_biaoqing_icon);
                break;
            case R.id.iv_emogi:
                if (isEmogiShow) {
                    isEmogiShow = false;
                    showKeyboard(this, et_send_content);
                    iv_emogi.setImageResource(R.drawable.fabu_biaoqing_icon);
                    return;
                } else {
                    iv_emogi.setImageResource(R.drawable.fabu_keyboard_icon);
                    replaceEmogi();
                    hideKeyboard(this);
                }
                break;
        }
    }

    /**
     * 表情显示
     */
    private void replaceEmogi() {
        isEmogiShow = true;
        fl_emogi.setVisibility(View.VISIBLE);
        if (expressionShowFragment == null) {
            expressionShowFragment = ExpressionShowFragment.newInstance();
            getSupportFragmentManager().beginTransaction().replace(R.id.fl_emogi, ExpressionShowFragment.newInstance()).commit();
        }
    }


    private int getSupportSoftInputHeight() {
        Rect r = new Rect();
        this.getWindow().getDecorView().getWindowVisibleDisplayFrame(r);
        int screenHeight = this.getWindow().getDecorView().getRootView().getHeight();
        int softInputHeight = screenHeight - r.bottom;
        if (Build.VERSION.SDK_INT >= 20) {
            // When SDK Level >= 20 (Android L), the softInputHeight will contain the height of softButtonsBar (if has)
            softInputHeight = softInputHeight - getSoftButtonsBarHeight();
        }
        return softInputHeight;
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    private int getSoftButtonsBarHeight() {
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        int usableHeight = metrics.heightPixels;
        getWindowManager().getDefaultDisplay().getRealMetrics(metrics);
        int realHeight = metrics.heightPixels;
        if (realHeight > usableHeight) {
            return realHeight - usableHeight;
        } else {
            return 0;
        }
    }

    @Override
    public void onBackPressed() {
        if (isEmogiShow || isKeyboardShown(rl_root)) {
            fl_emogi.setVisibility(View.INVISIBLE);
            ll_emogi.setVisibility(View.GONE);
            hideKeyboard(this);
        } else {
            finish();
        }
    }

    /**
     * 这里必须实现表情点击后才能把具体表情传入edittext
     * @param str
     */
    @Override
    public void expressionClick(String str) {
        ExpressionShowFragment.input(et_send_content, str);
    }

    @Override
    protected void onPause() {
        super.onPause();
        hideKeyboard(this);
        fl_emogi.setVisibility(View.INVISIBLE);
        ll_emogi.setVisibility(View.GONE);
    }

    private void hideKeyboard(Activity context) {
        if (context == null) return;
        final View v = context.getWindow().peekDecorView();
        if (v != null && v.getWindowToken() != null) {
            InputMethodManager imm = (InputMethodManager) context.getSystemService(context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
        }
    }


    private void showKeyboard(Activity context, View view) {
        InputMethodManager imm = (InputMethodManager) context.getSystemService(context.INPUT_METHOD_SERVICE);
        imm.showSoftInput(view, 0);

    }
}


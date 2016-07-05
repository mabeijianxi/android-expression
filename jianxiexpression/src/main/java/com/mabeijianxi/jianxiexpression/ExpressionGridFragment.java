package com.mabeijianxi.jianxiexpression;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.mabeijianxi.jianxiexpression.core.ExpressionTransformEngine;
import com.mabeijianxi.jianxiexpression.widget.CustomGridView;


/**
 * Created by jian on 2016/6/23.
 * mabeijianxi@gmail.com
 */
public class ExpressionGridFragment extends Fragment implements AdapterView.OnItemClickListener {
    private String[] mExpressionName;
    private ExpressionClickListener mExpressionClickListener;
    private ExpressionaddRecentListener mExpressionaddRecentListener;
    private ExpressionItemAdapter expressionItemAdapter;

    public static ExpressionGridFragment newInstance(String[] expressionName) {
        ExpressionGridFragment expressionGridFragment = new ExpressionGridFragment();
        expressionGridFragment.setData(expressionName);
        return expressionGridFragment;
    }

    private void setData(String[] expressionName) {
        mExpressionName = expressionName;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (getActivity() instanceof ExpressionClickListener) {
            mExpressionClickListener = (ExpressionClickListener) getActivity();
        } else if (getParentFragment() instanceof ExpressionClickListener) {
            mExpressionClickListener = (ExpressionClickListener) getParentFragment();
        } else {
            throw new IllegalArgumentException("需要实现ExpressionClickListener");
        }
        if (getActivity() instanceof ExpressionaddRecentListener) {
            mExpressionaddRecentListener = (ExpressionaddRecentListener) getActivity();
        } else if (getParentFragment().getParentFragment() instanceof ExpressionaddRecentListener) {
            mExpressionaddRecentListener = (ExpressionaddRecentListener) getParentFragment().getParentFragment();
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.my_expression_gridview, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        CustomGridView gv_expression = (CustomGridView) view.findViewById(R.id.gv_expression);
        expressionItemAdapter = new ExpressionItemAdapter(getActivity(), mExpressionName);
        gv_expression.setAdapter(expressionItemAdapter);
        gv_expression.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String itemAtPosition = (String) parent.getItemAtPosition(position);
        mExpressionClickListener.expressionClick(itemAtPosition);
        ExpressionTransformEngine.addRecentExpression(itemAtPosition);
        if(mExpressionaddRecentListener!=null){
            mExpressionaddRecentListener.expressionaddRecent(itemAtPosition);
        }
    }
    public void notifyData(){
        if(expressionItemAdapter!=null){
            expressionItemAdapter.notifyDataSetChanged();
        }
    }
    public interface ExpressionClickListener {
        void expressionClick(String str);
    }
    public interface ExpressionaddRecentListener {
        void expressionaddRecent(String str);
    }

}

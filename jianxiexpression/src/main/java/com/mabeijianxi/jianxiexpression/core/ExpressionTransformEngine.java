package com.mabeijianxi.jianxiexpression.core;

import android.content.Context;
import android.text.Spannable;
import android.widget.EditText;

import com.mabeijianxi.jianxiexpression.widget.ExpressionSpan;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Created by jian on 2016/6/24.
 * mabeijianxi@gmail.com
 */
public class ExpressionTransformEngine {

    public static Spannable transformExoression(Context context, Spannable text, int emojiSize, int emojiAlignment, int textSize) {
        int textLength = text.length();

        // remove spans throughout all text
        ExpressionSpan[] oldSpans = text.getSpans(0, textLength, ExpressionSpan.class);
        for (int i = 0; i < oldSpans.length; i++) {
            text.removeSpan(oldSpans[i]);
        }

        String PATTERN = "\\[soon](.*?)\\[/soon]";
        Pattern p = Pattern.compile(PATTERN);
        Matcher m = p.matcher(text);
        while (m.find()) {

            String beferGroup = m.group();
            Integer index = ExpressionCache.getAllExpressionTable().get(beferGroup);
            int id = -1;
            if (index!=null&&index>=0) {
                id = index;
            } else {
                String afterGroup = beferGroup.replace("[soon]", "").replace("[/soon]", "");
//            TODO 效率不高，等待进一步优化
                id = context.getResources()
                        .getIdentifier(afterGroup, "drawable",
                                context.getPackageName());
            }
            if (id <= 0) {
                continue;
            }
            text.setSpan(new ExpressionSpan(context, id, emojiSize, emojiAlignment, textSize), m.start(), m.end(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        }
        return text;

    }

    private static int getId2R(int index) {
        return 0;
    }

    public static void input(EditText editText, String str) {


        if (editText == null || str == null) {
            return;
        }
        String t = editText.getText().toString();
        int start = editText.getSelectionStart();
        int end = editText.getSelectionEnd();
        if (start < 0) {
            editText.append(str);
        } else {
            editText.getText().replace(Math.min(start, end), Math.max(start, end), str, 0, str.length());
        }
    }

    /**
     * 添加最近使用表情
     *
     * @param str
     */
    public static void addRecentExpression(String str) {
        int endIndex = getEndIndex();
        for (int i = 0; i < ExpressionCache.getRecentExpression().length; i++) {
//            防止重复
            if (ExpressionCache.getRecentExpression()[i] == str || i == ExpressionCache.getRecentExpression().length - 1) {
                //                    最多一页
                sort(i, str);
                return;
            }
        }

        sort(endIndex, str);

    }

    /**
     * 后移动一位
     *
     * @param endIndex
     * @param newStr
     */
    private static void sort(int endIndex, String newStr) {
        for (int i = endIndex; i > 0; i--) {
            ExpressionCache.getRecentExpression()[i] = ExpressionCache.getRecentExpression()[i - 1];
        }
        ExpressionCache.getRecentExpression()[0] = newStr;
    }

    /**
     * 得到最后一位有效位
     *
     * @return
     */
    private static int getEndIndex() {
        int lastStr = 0;
        for (int i = 0; i < ExpressionCache.getRecentExpression().length; i++) {
            if (ExpressionCache.getRecentExpression()[i] == null || i == ExpressionCache.getRecentExpression().length - 1) {
                lastStr = i;
                break;
            }
        }
        return lastStr;
    }
}

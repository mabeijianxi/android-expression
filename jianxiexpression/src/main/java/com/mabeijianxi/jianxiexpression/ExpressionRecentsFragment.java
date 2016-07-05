package com.mabeijianxi.jianxiexpression;

import com.mabeijianxi.jianxiexpression.core.ExpressionCache;

import java.util.ArrayList;

/**
 * Created by jian on 2016/6/23.
 * mabeijianxi@gmail.com
 */
public class ExpressionRecentsFragment extends BaseInsideFragment {

    @Override
    protected boolean isNeedCirclePageIndicator() {
        return false;
    }

    @Override
    protected ArrayList<ExpressionGridFragment> setupData() {
        ArrayList<ExpressionGridFragment> expressionGridFragments = new ArrayList<>();
        String[] recentExpression = ExpressionCache.getRecentExpression();
            expressionGridFragments.add(ExpressionGridFragment.newInstance(recentExpression));
        return expressionGridFragments;
    }

    /**
     * 跟新最近使用表情
     * @param str
     */
    public void expressionaddRecent(String str) {
        ArrayList<ExpressionGridFragment> data = getData();
        for(int i=0;i<data.size();i++){
            data.get(i).notifyData();
        }
    }
}

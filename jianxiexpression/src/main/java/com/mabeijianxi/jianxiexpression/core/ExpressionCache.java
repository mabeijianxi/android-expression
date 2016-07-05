package com.mabeijianxi.jianxiexpression.core;

import com.mabeijianxi.jianxiexpression.R;

import java.util.HashMap;

/**
 * Created by jian on 2016/6/23.
 * mabeijianxi@gmail.com
 */
public class ExpressionCache {
    //    TODO 每页数据资源，可自己定义，自己更改
    public static final String[] page_1 = new String[]{
            "[soon]d_aini[/soon]", "[soon]d_aoteman[/soon]", "[soon]d_baibai[/soon]",
            "[soon]d_beishang[/soon]", "[soon]d_bishi[/soon]", "[soon]d_bizui[/soon]",
            "[soon]d_chanzui[/soon]", "[soon]d_chijing[/soon]", "[soon]d_dahaqi[/soon]",
            "[soon]d_dalian[/soon]", "[soon]d_ding[/soon]", "[soon]d_doge[/soon]",
            "[soon]d_feizao[/soon]", "[soon]d_ganmao[/soon]", "[soon]d_guzhang[/soon]",
            "[soon]d_haha[/soon]", "[soon]d_haixiu[/soon]", "[soon]d_han[/soon]",
            "[soon]d_hehe[/soon]", "[soon]d_heixian[/soon]", "[soon]d_heng[/soon]"
    };
    public static final String[] page_2 = new String[]{
            "[soon]d_huaxin[/soon]", "[soon]d_jiyan[/soon]", "[soon]d_keai[/soon]",
            "[soon]d_kelian[/soon]", "[soon]d_ku[/soon]", "[soon]d_kun[/soon]",
            "[soon]d_landelini[/soon]", "[soon]d_lang[/soon]", "[soon]d_lei[/soon]",
            "[soon]d_miao[/soon]", "[soon]d_nanhaier[/soon]", "[soon]d_nu[/soon]",
            "[soon]d_numa[/soon]", "[soon]d_nvhaier[/soon]", "[soon]d_qian[/soon]",
            "[soon]d_qinqin[/soon]", "[soon]d_shayan[/soon]", "[soon]d_shengbing[/soon]",
            "[soon]d_shenshou[/soon]", "[soon]d_shiwang[/soon]", "[soon]d_shuai[/soon]"
    };
    public static final String[] page_3 = new String[]{
            "[soon]d_shuijiao[/soon]", "[soon]d_sikao[/soon]", "[soon]d_taikaixin[/soon]",
            "[soon]d_touxiao[/soon]", "[soon]d_tu[/soon]", "[soon]d_tuzi[/soon]",
            "[soon]d_wabishi[/soon]", "[soon]d_weiqu[/soon]", "[soon]d_xiaoku[/soon]",
            "[soon]d_xiongmao[/soon]", "[soon]d_xixi[/soon]", "[soon]d_xu[/soon]",
            "[soon]d_yinxian[/soon]", "[soon]d_yiwen[/soon]", "[soon]d_youhengheng[/soon]",
            "[soon]d_yun[/soon]", "[soon]d_zhuakuang[/soon]", "[soon]d_zhutou[/soon]",
            "[soon]d_zuohengheng[/soon]"
    };
    public static final String[] page_4 = new String[]{
            "[soon]emoji_0x1f319[/soon]", "[soon]emoji_0x1f31f[/soon]", "[soon]emoji_0x1f339[/soon]",
            "[soon]emoji_0x1f33b[/soon]", "[soon]emoji_0x1f341[/soon]", "[soon]emoji_0x1f343[/soon]",
            "[soon]emoji_0x1f37a[/soon]", "[soon]emoji_0x1f380[/soon]", "[soon]emoji_0x1f381[/soon]",
            "[soon]emoji_0x1f382[/soon]", "[soon]emoji_0x1f385[/soon]", "[soon]emoji_0x1f3e0[/soon]",
            "[soon]emoji_0x1f431[/soon]", "[soon]emoji_0x1f436[/soon]", "[soon]emoji_0x1f444[/soon]",
            "[soon]emoji_0x1f446[/soon]", "[soon]emoji_0x1f447[/soon]", "[soon]emoji_0x1f448[/soon]",
            "[soon]emoji_0x1f449[/soon]", "[soon]emoji_0x1f44a[/soon]", "[soon]emoji_0x1f44c[/soon]"
    };
    public static final String[] page_5 = new String[]{
            "[soon]emoji_0x1f44d[/soon]", "[soon]emoji_0x1f44e[/soon]", "[soon]emoji_0x1f44f[/soon]",
            "[soon]emoji_0x1f457[/soon]", "[soon]emoji_0x1f466[/soon]", "[soon]emoji_0x1f467[/soon]",
            "[soon]emoji_0x1f468[/soon]", "[soon]emoji_0x1f469[/soon]", "[soon]emoji_0x1f47b[/soon]",
            "[soon]emoji_0x1f47f[/soon]", "[soon]emoji_0x1f48e[/soon]", "[soon]emoji_0x1f494[/soon]",
            "[soon]emoji_0x1f4a3[/soon]", "[soon]emoji_0x1f4aa[/soon]", "[soon]emoji_0x1f4f1[/soon]",
            "[soon]emoji_0x1f50d[/soon]", "[soon]emoji_0x1f559[/soon]", "[soon]emoji_0x1f601[/soon]",
            "[soon]emoji_0x1f602[/soon]", "[soon]emoji_0x1f603[/soon]", "[soon]emoji_0x1f604[/soon]"
    };
    public static final String[] page_6 = new String[]{
            "[soon]emoji_0x1f609[/soon]", "[soon]emoji_0x1f60a[/soon]", "[soon]emoji_0x1f60c[/soon]",
            "[soon]emoji_0x1f60d[/soon]", "[soon]emoji_0x1f60f[/soon]", "[soon]emoji_0x1f612[/soon]",
            "[soon]emoji_0x1f613[/soon]", "[soon]emoji_0x1f614[/soon]", "[soon]emoji_0x1f616[/soon]",
            "[soon]emoji_0x1f618[/soon]", "[soon]emoji_0x1f61a[/soon]", "[soon]emoji_0x1f61c[/soon]",
            "[soon]emoji_0x1f61d[/soon]", "[soon]emoji_0x1f61e[/soon]", "[soon]emoji_0x1f620[/soon]",
            "[soon]emoji_0x1f621[/soon]", "[soon]emoji_0x1f622[/soon]", "[soon]emoji_0x1f623[/soon]",
            "[soon]emoji_0x1f625[/soon]", "[soon]emoji_0x1f628[/soon]", "[soon]emoji_0x1f62a[/soon]"
    };
    public static final String[] page_7 = new String[]{
            "[soon]emoji_0x1f62d[/soon]", "[soon]emoji_0x1f630[/soon]", "[soon]emoji_0x1f631[/soon]",
            "[soon]emoji_0x1f632[/soon]", "[soon]emoji_0x1f633[/soon]", "[soon]emoji_0x1f637[/soon]",
            "[soon]emoji_0x1f64f[/soon]", "[soon]emoji_0x1f697[/soon]", "[soon]emoji_0x2600[/soon]",
            "[soon]emoji_0x2601[/soon]", "[soon]emoji_0x2614[/soon]", "[soon]emoji_0x2615[/soon]",
            "[soon]emoji_0x26a1[/soon]", "[soon]emoji_0x26bd[/soon]", "[soon]emoji_0x270a[/soon]",
            "[soon]emoji_0x270c[/soon]", "[soon]emoji_0x2764[/soon]"
    };

    /**
     * 所有的表情资源id缓存，增加效率
     */
    private static HashMap<String, Integer> allExpressionTable = new HashMap<String, Integer>();

    static {

        allExpressionTable.put(page_1[0], R.drawable.d_aini);
        allExpressionTable.put(page_1[1], R.drawable.d_aoteman);
        allExpressionTable.put(page_1[2], R.drawable.d_baibai);
        allExpressionTable.put(page_1[3], R.drawable.d_beishang);
        allExpressionTable.put(page_1[4], R.drawable.d_bishi);
        allExpressionTable.put(page_1[5], R.drawable.d_bizui);
        allExpressionTable.put(page_1[6], R.drawable.d_chanzui);
        allExpressionTable.put(page_1[7], R.drawable.d_chijing);
        allExpressionTable.put(page_1[8], R.drawable.d_dahaqi);
        allExpressionTable.put(page_1[9], R.drawable.d_dalian);
        allExpressionTable.put(page_1[10], R.drawable.d_ding);
        allExpressionTable.put(page_1[11], R.drawable.d_doge);
        allExpressionTable.put(page_1[12], R.drawable.d_feizao);
        allExpressionTable.put(page_1[13], R.drawable.d_ganmao);
        allExpressionTable.put(page_1[14], R.drawable.d_guzhang);
        allExpressionTable.put(page_1[15], R.drawable.d_haha);
        allExpressionTable.put(page_1[16], R.drawable.d_haixiu);
        allExpressionTable.put(page_1[17], R.drawable.d_han);
        allExpressionTable.put(page_1[18], R.drawable.d_hehe);
        allExpressionTable.put(page_1[19], R.drawable.d_heixian);
        allExpressionTable.put(page_1[20], R.drawable.d_heng);

        allExpressionTable.put(page_2[0], R.drawable.d_huaxin);
        allExpressionTable.put(page_2[1], R.drawable.d_jiyan);
        allExpressionTable.put(page_2[2], R.drawable.d_keai);
        allExpressionTable.put(page_2[3], R.drawable.d_kelian);
        allExpressionTable.put(page_2[4], R.drawable.d_ku);
        allExpressionTable.put(page_2[5], R.drawable.d_kun);
        allExpressionTable.put(page_2[6], R.drawable.d_landelini);
        allExpressionTable.put(page_2[7], R.drawable.d_lang);
        allExpressionTable.put(page_2[8], R.drawable.d_lei);
        allExpressionTable.put(page_2[9], R.drawable.d_miao);
        allExpressionTable.put(page_2[10], R.drawable.d_nanhaier);
        allExpressionTable.put(page_2[11], R.drawable.d_nu);
        allExpressionTable.put(page_2[12], R.drawable.d_numa);
        allExpressionTable.put(page_2[13], R.drawable.d_nvhaier);
        allExpressionTable.put(page_2[14], R.drawable.d_qian);
        allExpressionTable.put(page_2[15], R.drawable.d_qinqin);
        allExpressionTable.put(page_2[16], R.drawable.d_shayan);
        allExpressionTable.put(page_2[17], R.drawable.d_shengbing);
        allExpressionTable.put(page_2[18], R.drawable.d_shenshou);
        allExpressionTable.put(page_2[19], R.drawable.d_shiwang);
        allExpressionTable.put(page_2[20], R.drawable.d_shuai);

        allExpressionTable.put(page_3[0], R.drawable.d_shuijiao);
        allExpressionTable.put(page_3[1], R.drawable.d_sikao);
        allExpressionTable.put(page_3[2], R.drawable.d_taikaixin);
        allExpressionTable.put(page_3[3], R.drawable.d_touxiao);
        allExpressionTable.put(page_3[4], R.drawable.d_tu);
        allExpressionTable.put(page_3[5], R.drawable.d_tuzi);
        allExpressionTable.put(page_3[6], R.drawable.d_wabishi);
        allExpressionTable.put(page_3[7], R.drawable.d_weiqu);
        allExpressionTable.put(page_3[8], R.drawable.d_xiaoku);
        allExpressionTable.put(page_3[9], R.drawable.d_xiongmao);
        allExpressionTable.put(page_3[10], R.drawable.d_xixi);
        allExpressionTable.put(page_3[11], R.drawable.d_xu);
        allExpressionTable.put(page_3[12], R.drawable.d_yinxian);
        allExpressionTable.put(page_3[13], R.drawable.d_yiwen);
        allExpressionTable.put(page_3[14], R.drawable.d_youhengheng);
        allExpressionTable.put(page_3[15], R.drawable.d_yun);
        allExpressionTable.put(page_3[16], R.drawable.d_zhuakuang);
        allExpressionTable.put(page_3[17], R.drawable.d_zhutou);
        allExpressionTable.put(page_3[18], R.drawable.d_zuohengheng);

        allExpressionTable.put(page_4[0], R.drawable.emoji_0x1f319);
        allExpressionTable.put(page_4[1], R.drawable.emoji_0x1f31f);
        allExpressionTable.put(page_4[2], R.drawable.emoji_0x1f339);
        allExpressionTable.put(page_4[3], R.drawable.emoji_0x1f33b);
        allExpressionTable.put(page_4[4], R.drawable.emoji_0x1f341);
        allExpressionTable.put(page_4[5], R.drawable.emoji_0x1f343);
        allExpressionTable.put(page_4[6], R.drawable.emoji_0x1f37a);
        allExpressionTable.put(page_4[7], R.drawable.emoji_0x1f380);
        allExpressionTable.put(page_4[8], R.drawable.emoji_0x1f381);
        allExpressionTable.put(page_4[9], R.drawable.emoji_0x1f382);
        allExpressionTable.put(page_4[10], R.drawable.emoji_0x1f385);
        allExpressionTable.put(page_4[11], R.drawable.emoji_0x1f3e0);
        allExpressionTable.put(page_4[12], R.drawable.emoji_0x1f431);
        allExpressionTable.put(page_4[13], R.drawable.emoji_0x1f436);
        allExpressionTable.put(page_4[14], R.drawable.emoji_0x1f444);
        allExpressionTable.put(page_4[15], R.drawable.emoji_0x1f446);
        allExpressionTable.put(page_4[16], R.drawable.emoji_0x1f447);
        allExpressionTable.put(page_4[17], R.drawable.emoji_0x1f448);
        allExpressionTable.put(page_4[18], R.drawable.emoji_0x1f449);
        allExpressionTable.put(page_4[19], R.drawable.emoji_0x1f44a);
        allExpressionTable.put(page_4[20], R.drawable.emoji_0x1f44c);

        allExpressionTable.put(page_5[0], R.drawable.emoji_0x1f44d);
        allExpressionTable.put(page_5[1], R.drawable.emoji_0x1f44e);
        allExpressionTable.put(page_5[2], R.drawable.emoji_0x1f44f);
        allExpressionTable.put(page_5[3], R.drawable.emoji_0x1f457);
        allExpressionTable.put(page_5[4], R.drawable.emoji_0x1f466);
        allExpressionTable.put(page_5[5], R.drawable.emoji_0x1f467);
        allExpressionTable.put(page_5[6], R.drawable.emoji_0x1f468);
        allExpressionTable.put(page_5[7], R.drawable.emoji_0x1f469);
        allExpressionTable.put(page_5[8], R.drawable.emoji_0x1f47b);
        allExpressionTable.put(page_5[9], R.drawable.emoji_0x1f47f);
        allExpressionTable.put(page_5[10], R.drawable.emoji_0x1f48e);
        allExpressionTable.put(page_5[11], R.drawable.emoji_0x1f494);
        allExpressionTable.put(page_5[12], R.drawable.emoji_0x1f4a3);
        allExpressionTable.put(page_5[13], R.drawable.emoji_0x1f4aa);
        allExpressionTable.put(page_5[14], R.drawable.emoji_0x1f4f1);
        allExpressionTable.put(page_5[15], R.drawable.emoji_0x1f50d);
        allExpressionTable.put(page_5[16], R.drawable.emoji_0x1f559);
        allExpressionTable.put(page_5[17], R.drawable.emoji_0x1f601);
        allExpressionTable.put(page_5[18], R.drawable.emoji_0x1f602);
        allExpressionTable.put(page_5[19], R.drawable.emoji_0x1f603);
        allExpressionTable.put(page_5[20], R.drawable.emoji_0x1f604);

        allExpressionTable.put(page_6[0], R.drawable.emoji_0x1f609);
        allExpressionTable.put(page_6[1], R.drawable.emoji_0x1f60a);
        allExpressionTable.put(page_6[2], R.drawable.emoji_0x1f60c);
        allExpressionTable.put(page_6[3], R.drawable.emoji_0x1f60d);
        allExpressionTable.put(page_6[4], R.drawable.emoji_0x1f60f);
        allExpressionTable.put(page_6[5], R.drawable.emoji_0x1f612);
        allExpressionTable.put(page_6[6], R.drawable.emoji_0x1f613);
        allExpressionTable.put(page_6[7], R.drawable.emoji_0x1f614);
        allExpressionTable.put(page_6[8], R.drawable.emoji_0x1f616);
        allExpressionTable.put(page_6[9], R.drawable.emoji_0x1f618);
        allExpressionTable.put(page_6[10], R.drawable.emoji_0x1f61a);
        allExpressionTable.put(page_6[11], R.drawable.emoji_0x1f61c);
        allExpressionTable.put(page_6[12], R.drawable.emoji_0x1f61d);
        allExpressionTable.put(page_6[13], R.drawable.emoji_0x1f61e);
        allExpressionTable.put(page_6[14], R.drawable.emoji_0x1f620);
        allExpressionTable.put(page_6[15], R.drawable.emoji_0x1f621);
        allExpressionTable.put(page_6[16], R.drawable.emoji_0x1f622);
        allExpressionTable.put(page_6[17], R.drawable.emoji_0x1f623);
        allExpressionTable.put(page_6[18], R.drawable.emoji_0x1f625);
        allExpressionTable.put(page_6[19], R.drawable.emoji_0x1f628);
        allExpressionTable.put(page_6[20], R.drawable.emoji_0x1f62a);

        allExpressionTable.put(page_7[0], R.drawable.emoji_0x1f62d);
        allExpressionTable.put(page_7[1], R.drawable.emoji_0x1f630);
        allExpressionTable.put(page_7[2], R.drawable.emoji_0x1f631);
        allExpressionTable.put(page_7[3], R.drawable.emoji_0x1f632);
        allExpressionTable.put(page_7[4], R.drawable.emoji_0x1f633);
        allExpressionTable.put(page_7[5], R.drawable.emoji_0x1f637);
        allExpressionTable.put(page_7[6], R.drawable.emoji_0x1f64f);
        allExpressionTable.put(page_7[7], R.drawable.emoji_0x1f697);
        allExpressionTable.put(page_7[8], R.drawable.emoji_0x2600);
        allExpressionTable.put(page_7[9], R.drawable.emoji_0x2601);
        allExpressionTable.put(page_7[10], R.drawable.emoji_0x2614);
        allExpressionTable.put(page_7[11], R.drawable.emoji_0x2615);
        allExpressionTable.put(page_7[12], R.drawable.emoji_0x26a1);
        allExpressionTable.put(page_7[13], R.drawable.emoji_0x26bd);
        allExpressionTable.put(page_7[14], R.drawable.emoji_0x270a);
        allExpressionTable.put(page_7[15], R.drawable.emoji_0x270c);
        allExpressionTable.put(page_7[16], R.drawable.emoji_0x2764);
    }

    /**
     * 最近使用表情缓存
     */
    private static String[] recentExpression = new String[21];
    /**
     * tab
     */
    private static String[] pageTitle;

    /**
     * 得到每类表情的标签，可拓展
     *
     * @return
     */
    public static String[] getPageTitle() {
        String category_1 = "最近";
        String category_2 = "默认";
        String category_3 = "Emoji";
        if (pageTitle == null) {
            pageTitle = new String[]{category_1, category_2, category_3};
        }
        return pageTitle;
    }

    public static String[] getRecentExpression() {
        return recentExpression;
    }

    public static HashMap<String, Integer> getAllExpressionTable() {
        return allExpressionTable;
    }
}
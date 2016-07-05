package com.mabeijianxi.jianxiexpression;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.mabeijianxi.jianxiexpression.widget.ExpressionTextView;

/**
 * Created by jian on 2016/6/23.
 * mabeijianxi@gmail.com
 */
public class ExpressionItemAdapter extends ArrayAdapter<String> {
    public ExpressionItemAdapter(Context context, String[] objects) {
        super(context, R.layout.expression_gv_item, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            v = LayoutInflater.from(getContext()).inflate(R.layout.expression_gv_item, parent, false);
            ViewHolder holder = new ViewHolder();
            holder.icon = (ExpressionTextView) v.findViewById(R.id.tv_expression);
            v.setTag(holder);
        }
        String str = getItem(position);
        ViewHolder holder = (ViewHolder) v.getTag();
        holder.icon.setText(str);
        return v;
    }

    static class ViewHolder {
        ExpressionTextView icon;
    }
}

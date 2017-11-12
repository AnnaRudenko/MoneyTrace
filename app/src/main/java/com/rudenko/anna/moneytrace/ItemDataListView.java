package com.rudenko.anna.moneytrace;

import android.content.Context;
import android.os.Build;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

public class ItemDataListView extends android.support.constraint.ConstraintLayout {
    private TextView textSum;
    private TextView textName;

    public ItemDataListView(Context context) {
        super(context);
    }

    public ItemDataListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ItemDataListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public static ItemDataListView Build(Context context){
        return (ItemDataListView) LayoutInflater.from(context).inflate(R.layout.item_data_list, null, true);


    }


    public void setText(String text) {
        getTextView().setText(text);
    }

    public void hideCircle() {
        ((ImageView)findViewById(R.id.im_color_icon)).setVisibility(INVISIBLE);
    }

    public void setValue(double i) {
        getValueTextView().setText(String.valueOf(i));
    }

    public TextView getTextView() {
        if(textName == null){
            textName = ((TextView)findViewById(R.id.tv_item_data_list_text));
        }
        return textName;
    }

    public TextView getValueTextView() {
        if (textSum == null){
            textSum = ((TextView)findViewById(R.id.tv_item_data_list_sum));
        }
        return textSum;
    }
}

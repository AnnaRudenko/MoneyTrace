package com.rudenko.anna.moneytrace;

import android.content.ClipData;
import android.support.v7.widget.RecyclerView;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class ItemDataListViewAdapter extends RecyclerView.Adapter<ItemDataListViewAdapter.MyViewHolder> {

    public ItemDataListViewAdapter(List<Pair<String, Double>> items) {
        this.items = items;
    }
    private List<Pair<String, Double>> items;

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(ItemDataListView.Build(parent.getContext()));
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Pair<String, Double> item = items.get(position);
        holder.text.setText(item.first);
        holder.value.setText(String.valueOf(item.second));

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView text;
        public TextView value;

        public MyViewHolder(ItemDataListView itemView) {
            super(itemView);
            text = itemView.getTextView();
            value = itemView.getValueTextView();

        }
    }
}

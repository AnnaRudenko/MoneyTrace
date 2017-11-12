package com.rudenko.anna.moneytrace;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout list_result = findViewById(R.id.list_result);
        ItemDataListView item_income = ItemDataListView.Build(this);
        item_income.setText("Income");
        item_income.hideCircle();
        item_income.setValue(100);
        list_result.addView(item_income);
        ItemDataListView item_expense = ItemDataListView.Build(this);
        item_expense.setText("Expense");
        item_expense.hideCircle();
        item_expense.setValue(200);
        list_result.addView(item_expense);

        final RecyclerView recyclerView = findViewById(R.id.rv_list_items);
        LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(manager);

        final ArrayList<Pair<String, Double>> items = new ArrayList<>();
        for (int i = 0; i < 20; i++){
            items.add(new Pair<String, Double>("Name", 15.5 + i));
        }

        final ItemDataListViewAdapter adapter = new ItemDataListViewAdapter(items);
        recyclerView.setAdapter(adapter);






    }
}

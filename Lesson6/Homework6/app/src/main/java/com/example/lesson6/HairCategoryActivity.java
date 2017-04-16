package com.example.lesson6;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HairCategoryActivity extends ListActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listHairs = getListView();
        ArrayAdapter<Hair> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Hair.hairs);
        listHairs.setAdapter(listAdapter);
    }

    @Override
    protected void onListItemClick(ListView listView, View view, int position, long id) {

        Intent intent = new Intent(HairCategoryActivity.this, HairActivity.class);
        intent.putExtra(HairActivity.EXTRA_HAIRNOM, (int) id);
        startActivity(intent);
    }
}

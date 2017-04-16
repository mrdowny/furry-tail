package com.example.lesson6;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class NailCategoryActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ListView listNails = getListView();
		ArrayAdapter<Nail> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Nail.nails);
		listNails.setAdapter(listAdapter);
	}

	@Override
	public void onListItemClick(ListView listView, View itemView, int position, long id) {
		Log.d("NailCategoryActivity", "listView " + listView);
		Log.d("NailCategoryActivity", "itemView " + itemView);
		Log.d("NailCategoryActivity", "position " + position);
		Log.d("NailCategoryActivity", "id " + id);
		Intent intent = new Intent(NailCategoryActivity.this, NailActivity.class);
		intent.putExtra(NailActivity.EXTRA_NAILNOM, (int) id);
		startActivity(intent);
	}

}

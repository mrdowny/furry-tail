package com.example.lesson6;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class TopActivity extends AppCompatActivity implements View.OnClickListener {
	
	private ImageView nailIv;
	private TextView nailTv;
	private ImageView hairIv;
	private TextView hairTv;
	private ImageView AdresIv;
	private TextView AdresTv;


	private View view;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_top);

		nailIv = (ImageView) findViewById(R.id.im_nail);
		nailTv = (TextView) findViewById(R.id.tv_nail);
		hairIv = (ImageView) findViewById(R.id.im_hair);
		hairTv = (TextView) findViewById(R.id.tv_hair);
		AdresIv = (ImageView) findViewById(R.id.im_map);
		AdresTv = (TextView) findViewById(R.id.tv_map);



		nailIv.setOnClickListener(this);
		nailTv.setOnClickListener(this);
		hairIv.setOnClickListener(this);
		hairTv.setOnClickListener(this);
		AdresIv.setOnClickListener(this);
		AdresTv.setOnClickListener(this);


	}

	@Override
	public void onClick(View view) {
		if (view.equals(nailTv) || view.equals(nailIv)) {
			Intent intent = new Intent(this, NailCategoryActivity.class);
			startActivity(intent);
		}

		if (view.equals(hairTv) || view.equals(hairIv)) {
			Intent intent = new Intent(this, HairCategoryActivity.class);
			startActivity(intent);
		}

		if (view.equals(AdresTv) || view.equals(AdresIv)) {
			Intent intent = new Intent(this, AdresActivity.class);
			startActivity(intent);
		}
	}

}

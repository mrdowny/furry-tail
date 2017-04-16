package com.example.lesson6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class HairActivity extends AppCompatActivity {

    public static final String EXTRA_HAIRNOM = "hairNom";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hair);

        Bundle bundle = getIntent().getExtras();
        if (bundle!=null){
            int hairNom = bundle.getInt(EXTRA_HAIRNOM);
            Hair hair = Hair.hairs[hairNom];

            ImageView photo = (ImageView) findViewById(R.id.photo);
            photo.setImageResource(hair.getImageResourceId());
            photo.setContentDescription(hair.getName());

            TextView name = (TextView) findViewById(R.id.name);
            name.setText(hair.getName());

            TextView description = (TextView) findViewById(R.id.description);
            description.setText(hair.getDescription());


        }


    }
}

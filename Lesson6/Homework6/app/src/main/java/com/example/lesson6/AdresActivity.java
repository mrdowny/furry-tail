package com.example.lesson6;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class AdresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adres);

        ImageView photo = (ImageView) findViewById(R.id.photo);
        //photo.setImageResource(R.drawable.adres);

        photo.setContentDescription("Адрес");

        TextView name = (TextView) findViewById(R.id.name);
        //name.setText("Адрес:");

        TextView description = (TextView) findViewById(R.id.description);
        //description.setText("г. Москва, ул. Усачева д.20 \n"тел. 8-800-900-0102");


    }

}

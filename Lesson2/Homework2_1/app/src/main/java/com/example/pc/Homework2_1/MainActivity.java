package com.example.pc.Homework2_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.pc.lesson2.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ColorSpec spec = new ColorSpec();
    private TextView textView = null;
    Spinner spinner = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView2);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
        spinner = (Spinner) findViewById(R.id.spinner_for_colors);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button) {
            int i = spinner.getSelectedItemPosition();
            textView.setText(spec.getEffect(i, this));
        }
    }
}

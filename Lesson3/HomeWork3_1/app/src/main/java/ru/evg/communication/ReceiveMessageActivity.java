package ru.evg.communication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ReceiveMessageActivity extends AppCompatActivity {


    public static final String EXTRA_MESSAGE = "ru.evg.communication.message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);
        TextView textView = (TextView) findViewById(R.id.rma_textView);
        Intent intent = getIntent();
        String strInMessage = intent.getStringExtra(EXTRA_MESSAGE) + "?";
        textView.setText(strInMessage);
    }

    public void onClick_rma_button(View view) {
        EditText rmaTextView = (EditText) findViewById(R.id.rma_editText);
        String strAnser = rmaTextView.getText().toString();
        Intent anserIntent = new Intent();
        anserIntent.putExtra(EXTRA_MESSAGE, strAnser);
        setResult(RESULT_OK, anserIntent);
        finish();
    }
}

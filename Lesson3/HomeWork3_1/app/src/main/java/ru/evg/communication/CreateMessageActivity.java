package ru.evg.communication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CreateMessageActivity extends AppCompatActivity {

    public static final int CREATE_MESSAGE_ACTIVITY_KEY = 0;
    EditText editText = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == CREATE_MESSAGE_ACTIVITY_KEY) {
            if (resultCode == RESULT_OK) {
                TextView acr_TextView = (TextView) findViewById(R.id.acr_textView);
                String str_Anser = "Ответ: " + data.getStringExtra(ReceiveMessageActivity.EXTRA_MESSAGE);
                acr_TextView.setText(str_Anser);
                editText.setText("");
            }
        }
    }

    public void onSendMessage(View view) {
        editText = (EditText) findViewById(R.id.acr_editText);
        String strMessage = editText.getText().toString();
        Intent intent = new Intent(this, ReceiveMessageActivity.class);
        intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE, strMessage);
        startActivityForResult(intent, CREATE_MESSAGE_ACTIVITY_KEY);
    }

    public void onSendMessage_mail(View view) {
        editText = (EditText) findViewById(R.id.acr_editText);
        String strMessage = editText.getText().toString();
        Intent intent_send = new Intent(Intent.ACTION_SEND);
        intent_send.setType("text/plain");
        intent_send.putExtra(Intent.EXTRA_TEXT, strMessage);
        startActivity(Intent.createChooser(intent_send, "Send message....."));
    }

}

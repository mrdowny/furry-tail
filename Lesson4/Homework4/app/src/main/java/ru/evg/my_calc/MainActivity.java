package ru.evg.my_calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private int i_A;
    private int i_B;
    private int i_result;

    private EditText et_A = null;
    private EditText et_B = null;

    private TextView tv_oper = null;

    private Button bt_sum = null;
    private Button bt_dif = null;
    private Button bt_mult = null;
    private Button bt_div = null;
    private Button bt_calc = null;

    private void on_Bt_Sum_Click(View view) {
        //i_result = et_A.getText()  + et_B.getText();
        i_result = 5;
        tv_oper.setText(i_result);

    }

    private void on_Bt_Dif_Click(View view) {

    }

    private void on_Bt_Mult_Click(View view) {

    }

    private void on_Bt_Div_Click(View view) {

    }

    private void on_Bt_Calc_Click(View view) {

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_A = (EditText) findViewById(R.id.et_A);
        et_B = (EditText) findViewById(R.id.et_B);

        tv_oper = (TextView) findViewById(R.id.tv_Oper);

        bt_sum = (Button) findViewById(R.id.bt_sum);
        bt_dif = (Button) findViewById(R.id.bt_difference);
        bt_mult = (Button) findViewById(R.id.bt_multiplication);
        bt_div = (Button) findViewById(R.id.bt_division);
        bt_calc = (Button) findViewById(R.id.bt_calculate);


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.bt_sum:
                Log.d("My calc", "Выбрал кнопку");
                this.on_Bt_Sum_Click(view);
                break;
            case R.id.bt_division:
                this.on_Bt_Div_Click(view);
                break;
            case R.id.bt_multiplication:
                this.on_Bt_Mult_Click(view);
                break;
            case R.id.bt_difference:
                this.on_Bt_Dif_Click(view);
                break;
            case R.id.bt_calculate:
                this.on_Bt_Calc_Click(view);
                break;
        }

    }
}

package ru.evg.my_calc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String I_A = "i_A";
    public static final String I_B = "i_B";
    public static final String I_RESULT = "i_Result";
    public static final String C_OPER = "c_oper";
    private Integer i_A = 0;
    private Integer i_B = 0;
    private Integer i_result = 0;
    private char c_oper = ' ';
    private EditText et_A = null;
    private EditText et_B = null;
    private TextView tv_oper = null;
    private TextView tv_result = null;
    private Button bt_sum = null;
    private Button bt_dif = null;
    private Button bt_mult = null;
    private Button bt_div = null;
    private Button bt_calc = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            i_A = savedInstanceState.getInt(I_A);
            i_B = savedInstanceState.getInt(I_B);
            i_result = savedInstanceState.getInt(I_RESULT);
            c_oper = savedInstanceState.getChar(C_OPER);
        }

        et_A = (EditText) findViewById(R.id.et_A);
        et_B = (EditText) findViewById(R.id.et_B);
        tv_oper = (TextView) findViewById(R.id.tv_Oper);
        tv_result = (TextView) findViewById(R.id.tv_Result);



        if (i_A !=0)  et_B.setText(i_A.toString());
        if (i_B !=0)  et_B.setText(i_B.toString());
        tv_result.setText(i_result.toString());
        tv_oper.setText(String.valueOf(c_oper));


        bt_sum = (Button) findViewById(R.id.bt_sum);
        bt_dif = (Button) findViewById(R.id.bt_difference);
        bt_mult = (Button) findViewById(R.id.bt_multiplication);
        bt_div = (Button) findViewById(R.id.bt_division);
        bt_calc = (Button) findViewById(R.id.bt_calculate);

        bt_sum.setOnClickListener(this);
        bt_dif.setOnClickListener(this);
        bt_mult.setOnClickListener(this);
        bt_div.setOnClickListener(this);
        bt_calc.setOnClickListener(this);
        et_A.setOnClickListener(this);
        et_B.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.bt_sum:

                c_oper = '+';
                tv_oper.setText("+");
                break;
            case R.id.bt_difference:

                c_oper = '-';
                tv_oper.setText("-");
                break;
            case R.id.bt_multiplication:

                c_oper = '*';
                tv_oper.setText("*");
                break;
            case R.id.bt_division:

                c_oper = '/';
                tv_oper.setText("/");
                break;


            case R.id.bt_calculate:
                i_A = Integer.parseInt(et_A.getText().toString());
                i_B = Integer.parseInt(et_B.getText().toString());

                switch (c_oper) {
                    case ' ':
                        break;
                    case '+':
                        i_result = i_A + i_B;
                        break;
                    case '-':
                        i_result = i_A - i_B;
                        break;
                    case '*':
                        i_result = i_A * i_B;
                        break;
                    case '/':
                        if (i_B != 0) i_result = i_A / i_B;
                        break;
                }
                tv_result.setText(i_result.toString());
                break;
        }

    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt(I_A, i_A);
        outState.putInt(I_B, i_B);
        outState.putInt(I_RESULT, i_result);
        outState.putChar(C_OPER,c_oper);
        super.onSaveInstanceState(outState);
    }




}

package com.example.pc.Homework2_1;

import android.content.Context;

import com.example.pc.lesson2.R;

import java.util.ArrayList;

import static com.example.pc.lesson2.R.array.color_selection_result;
import static com.example.pc.lesson2.R.string.effect;

public class ColorSpec {

    public String getEffect(int i, Context context) {
        String[] myText = context.getResources().getStringArray(R.array.color_selection_result);
        if ((i >=0) && (i < myText.length)) return myText[i];
        return "Ошибочка :)";
    }

}

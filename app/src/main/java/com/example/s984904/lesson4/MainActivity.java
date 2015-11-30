package com.example.s984904.lesson4;

import android.app.Activity;
import android.graphics.Point;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
    private TextView text3, text5;
    private EditText input1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout1 = new LinearLayout(this);
        LinearLayout layout2 = new LinearLayout(this);
        LinearLayout layout3 = new LinearLayout(this);
        LinearLayout layout4 = new LinearLayout(this);
        Point size = new Point();
        getWindowManager().getDefaultDisplay().getSize(size);
        int width = size.x;
        int height = size.y;
        layout1.setOrientation(LinearLayout.VERTICAL);
        input1 = new EditText(this);
        input1.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);
        input1.setWidth((int) (width * 0.15));
        TextView text1 = new TextView(this);
        text1.setText("cup(s) =");
        layout2.setFocusable(true);
        layout2.setFocusableInTouchMode(true);
        layout2.setMinimumHeight((int)(height*.1));
        layout2.addView(input1);
        layout2.addView(text1);
//        TextView text2 = new TextView(this);
//        text2.setText("is");
        text3 = new TextView(this);
        TextView text4 = new TextView(this);
        text5 = new TextView(this);
        TextView text6 = new TextView(this);
        text3.setWidth((int) (width * .15));
        text3.setBackgroundColor(0xFFA59263);
//        text3.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
        text4.setText(" tablespoon(s)       or");
        layout3.setMinimumHeight((int) (height * .03));
        layout3.addView(text3);
        layout3.addView(text4);
        text5.setWidth((int) (width * .15));
        text5.setBackgroundColor(0xFFA59263);
//        text5.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
        text6.setText(" teaspoon(s)");
        layout4.setMinimumHeight((int) (height * .2));
        layout4.addView(text5);
        layout4.addView(text6);
        Button btn = new Button(this);
        btn.setText("convert");
//        btn.setOnClickListener(convert);
        btn.setOnClickListener(this);
        layout1.addView(layout2);
        layout1.addView(layout3);
        layout1.addView(layout4);
        layout1.addView(btn);
        setContentView(layout1);
    }
    //    private OnClickListener convert = new OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            String inputString = input1.getText().toString();
//            double cup = Double.parseDouble(inputString);
//
//            double tbsp =(double)(Math.round(cup * 16*100))/100;
//            double tsp = (double)(Math.round(cup * 48*100))/100;
//
//            text3.setText(String.valueOf(tbsp));
//            text5.setText(String.valueOf(tsp));
//        }
//    };
    @Override
    public void onClick(View v) {
        String inputString = input1.getText().toString();
        double cup = Double.parseDouble(inputString);
        double tbsp =(double)(Math.round(cup * 16*100))/100;
        double tsp = (double)(Math.round(cup * 48*100))/100;
        text3.setText(String.valueOf(tbsp));
        text5.setText(String.valueOf(tsp));
    }
}

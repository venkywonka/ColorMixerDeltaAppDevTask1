package com.example.android.colormixer;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int red=0,blue=0,green=0;

    public void incRed(View view){
        if(red==9){red=0;}
        else {++red;}
        TextView t = (TextView) findViewById(R.id.r_value);
        t.setText(red);
        setBackground();

    }

    public void incGreen(View view){
        if(green==9){green=0;}
        else {++green;}
        TextView t = (TextView) findViewById(R.id.g_value);
        t.setText(green);
        setBackground();

    }

    public void incBlue(View view){
        if(blue==9){blue=0;}
        else {++blue;}
        TextView t = (TextView) findViewById(R.id.b_value);
        t.setText(blue);
        setBackground();

    }

    public void setBackground(){

        LinearLayout li=(LinearLayout)findViewById(R.id.myLayout);
        li.setBackgroundColor(Color.rgb(red,green,blue));


    }


}

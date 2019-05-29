package com.example.fadhilikhsann.tranpose;

import android.app.FragmentManager;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static java.sql.Types.NULL;

public class MainActivity extends AppCompatActivity {

    EditText id11;
    EditText id12;
    EditText id13;
    EditText id21;
    EditText id22;
    EditText id23;
    EditText id31;
    EditText id32;
    EditText id33;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.viewer, new MyFragment2());
        ft.commit();
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.button4).setBackgroundTintList(android.content.res.ColorStateList.valueOf(Color.parseColor("#e5e5e5")));
                findViewById(R.id.button3).setBackgroundTintList(android.content.res.ColorStateList.valueOf(Color.parseColor("#e5e5e5")));
                findViewById(R.id.button2).setBackgroundTintList(android.content.res.ColorStateList.valueOf(Color.parseColor("#01b2aa")));
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.viewer, new MyFragment2());
                ft.commit();
            }
        });
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.button4).setBackgroundTintList(android.content.res.ColorStateList.valueOf(Color.parseColor("#e5e5e5")));
                findViewById(R.id.button2).setBackgroundTintList(android.content.res.ColorStateList.valueOf(Color.parseColor("#e5e5e5")));
                findViewById(R.id.button3).setBackgroundTintList(android.content.res.ColorStateList.valueOf(Color.parseColor("#01b2aa")));
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.viewer, new MyFragment3());
                ft.commit();
            }
        });

        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.button3).setBackgroundTintList(android.content.res.ColorStateList.valueOf(Color.parseColor("#e5e5e5")));
                findViewById(R.id.button2).setBackgroundTintList(android.content.res.ColorStateList.valueOf(Color.parseColor("#e5e5e5")));
                findViewById(R.id.button4).setBackgroundTintList(android.content.res.ColorStateList.valueOf(Color.parseColor("#01b2aa")));
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.viewer, new MyFragment4());
                ft.commit();
            }
        });


    }
}

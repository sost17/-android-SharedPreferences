package com.col.commo.count;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp = getSharedPreferences("count",MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("count","count");
        editor.commit();
    }


}

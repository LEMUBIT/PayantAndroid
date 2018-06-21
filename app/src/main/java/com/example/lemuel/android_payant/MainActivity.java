package com.example.lemuel.android_payant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.lemuel.android_payant.utils.Validate;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
Payant.setPrivateKey("love");
    }
}

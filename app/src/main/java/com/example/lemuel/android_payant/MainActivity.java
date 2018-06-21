package com.example.lemuel.android_payant;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.lemuel.android_payant.annotation.PayantRequired;
import com.example.lemuel.android_payant.operations.PayantClient;

import java.lang.reflect.Field;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PayantClient payantClient = new PayantClient();

    }
}

package com.example.lemuel.android_payant;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.lemuel.android_payant.operations.clients.PayantClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PayantClient payantClient = new PayantClient();

    }
}

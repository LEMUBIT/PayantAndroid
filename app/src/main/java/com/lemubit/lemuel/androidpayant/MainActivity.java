package com.lemubit.lemuel.androidpayant;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.lemubit.lemuel.androidpayant.operations.clients.model.PayantClient;
import com.lemubit.lemuel.androidpayant.operations.invoices.PayantInvoiceManager;
import com.lemubit.lemuel.androidpayant.operations.invoices.networkResponse.SendPayantInvoice;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //PayantClient payantClient = new PayantClient();
        Payant.init(this);
        Payant.init(this);
        Payant.setPrivateKey(getString(R.string.pKey));

        PayantClient payantClient = new PayantClient();
        payantClient.setFirstName("Chibueze");
        payantClient.setLastName("OGBUNUDE");
        payantClient.setPhone("+23409094435323");
        payantClient.setEmail("lemuelcco@gmail.com.com");
        int id = 166;

        PayantInvoiceManager.sendPayantInvoice("RtmyviMcYWXIlJh3axQZ", new PayantInvoiceManager.OnSendInvoiceListener() {
            @Override
            public void onManagerResponse(SendPayantInvoice sendPayantInvoice) {
                Log.e("Payant Invoice", sendPayantInvoice.toString());
                Log.e("Payant Invoice", sendPayantInvoice.isSuccessful().toString());
            }


            @Override
            public void onFailure(Throwable t) {

                Log.e("Payant Invoice", t.getMessage());
            }
        });

    }


}

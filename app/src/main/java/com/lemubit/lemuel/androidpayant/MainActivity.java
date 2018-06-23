package com.lemubit.lemuel.androidpayant;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.lemubit.lemuel.androidpayant.operations.clients.PayantClientManager;
import com.lemubit.lemuel.androidpayant.operations.clients.PayantClientResponse.PayantClientResponse;
import com.lemubit.lemuel.androidpayant.operations.clients.model.PayantClient;

public class MainActivity extends AppCompatActivity implements PayantClientManager.OnPayantClientAddedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //PayantClient payantClient = new PayantClient();
        Payant.init(this);
        PayantClient payantClient = new PayantClient();

        payantClient.setCompany_name("Novateur");
        payantClient.setPhone("+23408023107324");
        payantClient.setEmail("charlesfree7@yahoo.com");
        payantClient.setAddress("Abuja");
        payantClient.setFirst_name("LemuelC");
        payantClient.setLast_name("Ogbunude");
        payantClient.setSettlement_bank("");
        payantClient.setAccount_number("");
        payantClient.setType("");

        PayantClientManager.addPayantClient(payantClient, this);
    }

    @Override
    public void onClientAdded(PayantClientResponse payantClientResponse) {
        Log.e("PAYANTCLIENT", payantClientResponse.toString());

    }

    @Override
    public void onFailure(Throwable t) {
        Log.e("PAYANTCLIENT", t.getMessage());
    }
}

package com.lemubit.lemuel.androidpayant;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.lemubit.lemuel.androidpayant.operations.clients.model.PayantClient;
import com.lemubit.lemuel.androidpayant.operations.payments.PayantPaymentManager;
import com.lemubit.lemuel.androidpayant.operations.payments.networkResponse.PayantPaymentInfo;

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

        String invoiceID = "tq1SuVodBWYJic2MArb0";

        PayantPaymentManager.getPayantPayment(invoiceID, new PayantPaymentManager.OnGetPayantPaymentListener() {
            @Override
            public void onManagerResponse(PayantPaymentInfo payantPaymentInfo) {
                Log.e("PAYANTINFO", payantPaymentInfo.toString());
            }

            @Override
            public void onFailure(Throwable t) {
                Log.e("PAYANTINFO", t.getMessage());
            }
        });
    }


}

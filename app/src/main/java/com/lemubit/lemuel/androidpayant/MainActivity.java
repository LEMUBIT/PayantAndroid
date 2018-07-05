package com.lemubit.lemuel.androidpayant;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.lemubit.lemuel.androidpayant.operations.clients.model.PayantClient;
import com.lemubit.lemuel.androidpayant.operations.invoices.PayantInvoiceManager;
import com.lemubit.lemuel.androidpayant.operations.invoices.networkResponse.DeletePayantInvoiceInfo;

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

        PayantInvoiceManager.deletePayantInvoice("sxemXolh3fdMKQNcJyv7", new PayantInvoiceManager.OnDeleteInvoiceListener() {
            @Override
            public void onManagerResponse(DeletePayantInvoiceInfo deletePayantInvoiceInfo) {
                Log.e("DELETE", deletePayantInvoiceInfo.toString());
            }

            @Override
            public void onFailure(Throwable t) {
                Log.e("DELETE ERROR", t.getMessage());
            }
        });

    }


}

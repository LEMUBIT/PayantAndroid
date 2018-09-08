package com.lemubit.lemuel.androidpayant;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.lemubit.lemuel.androidpayant.operations.clients.PayantClientManager;
import com.lemubit.lemuel.androidpayant.operations.clients.model.PayantClient;
import com.lemubit.lemuel.androidpayant.operations.clients.networkResponse.PayantClientInfo;
import com.lemubit.lemuel.androidpayant.operations.wallets.PayantWalletManager;
import com.lemubit.lemuel.androidpayant.operations.wallets.model.PayantWalletWithdraw;
import com.lemubit.lemuel.androidpayant.operations.wallets.networkResponse.PayantWalletWithdrawInfo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //PayantClient payantClient = new PayantClient();
        Payant.init(getApplicationContext(),false);
        Payant.setPrivateKey(getString(R.string.pKey));

        PayantClient payantClient = new PayantClient();
        payantClient.setFirstName("Chibueze");
        payantClient.setLastName("OGBUNUDE");
        payantClient.setPhone("+23409094435323");
        payantClient.setEmail("lemuelcco@gmail.com.com");
        int id = 166;

        String invoiceID = "tq1SuVodBWYJic2MArb0";
        String ref = "hRMmSCeTDB";
        PayantClientManager.getPayantClient(166, new PayantClientManager.OnGetPayantClientListener() {
            @Override
            public void onManagerResponse(PayantClientInfo payantClientInfo) {
                Toast.makeText(MainActivity.this, payantClientInfo.toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Throwable t) {
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }


}

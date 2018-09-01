package com.lemubit.lemuel.androidpayant;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.lemubit.lemuel.androidpayant.operations.clients.model.PayantClient;
import com.lemubit.lemuel.androidpayant.operations.wallets.PayantWalletManager;
import com.lemubit.lemuel.androidpayant.operations.wallets.model.PayantWalletWithdraw;
import com.lemubit.lemuel.androidpayant.operations.wallets.networkResponse.PayantWalletWithdrawInfo;

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
        String ref = "hRMmSCeTDB";
        PayantWalletManager.withdrawFromWallet(ref, new PayantWalletWithdraw("zenith", "2085232412", "10", "lovelove"), new PayantWalletManager.OnWithdrawFromWallet() {
            @Override
            public void onManagerResponse(PayantWalletWithdrawInfo payantWalletWithdrawInfo) {
                Toast.makeText(MainActivity.this, payantWalletWithdrawInfo.getMessage() + "--" + payantWalletWithdrawInfo.getStatus(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Throwable t) {
                Toast.makeText(MainActivity.this, "Error"+t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }


}

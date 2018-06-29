package com.lemubit.lemuel.androidpayant;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.lemubit.lemuel.androidpayant.operations.clients.model.PayantClient;
import com.lemubit.lemuel.androidpayant.operations.invoices.PayantInvoiceManager;
import com.lemubit.lemuel.androidpayant.operations.invoices.model.PayantInvoice;
import com.lemubit.lemuel.androidpayant.operations.invoices.model.PayantInvoiceItem;
import com.lemubit.lemuel.androidpayant.operations.invoices.networkResponse.PayantInvoiceInfo;

import java.util.ArrayList;
import java.util.List;

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
        payantClient.setFirstName("Lemubit");
        payantClient.setLastName("Ogbunude");
        payantClient.setPhone("+23409094435323");
        payantClient.setEmail("charlesfree7@yahoo.com");
        int id = 169;


        PayantInvoice payantInvoice = new PayantInvoice();
        payantInvoice.setclientId(String.valueOf(id));
        payantInvoice.setClient(payantClient);
        payantInvoice.setdueDate("30/06/2018");
        payantInvoice.setfeeBearer("client");
        payantInvoice.setmerchantRef("lol");
        List<PayantInvoiceItem> payantInvoiceItemList = new ArrayList<>();
        payantInvoiceItemList.add(new PayantInvoiceItem("football", "very nice stuff", "1000", "1"));
        payantInvoice.setItems(payantInvoiceItemList);

        PayantInvoiceManager.addPayantInvoice(payantInvoice, new PayantInvoiceManager.OnAddNewPayantInvoiceListener() {
            @Override
            public void onInvoiceAdded(PayantInvoiceInfo payantInvoiceInfo) {
                Log.i("Payant Invoice good!", payantInvoiceInfo.toString());
            }

            @Override
            public void onFailure(Throwable t) {
                Log.i("Payant Invoice Error!", t.getStackTrace().toString());
            }
        });


    }


}

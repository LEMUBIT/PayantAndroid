package com.lemubit.lemuel.androidpayant.operations.invoices;

import com.lemubit.lemuel.androidpayant.api.Headers;
import com.lemubit.lemuel.androidpayant.api.PayantApiService;
import com.lemubit.lemuel.androidpayant.api.PayantApiClient;
import com.lemubit.lemuel.androidpayant.operations.invoices.model.PayantInvoice;
import com.lemubit.lemuel.androidpayant.operations.invoices.networkResponse.PayantInvoiceInfo;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * @author lemuel
 */
public class PayantInvoiceManager {

    private static PayantApiService payantApiService = new PayantApiClient().getPayantApiService();


    /**
     * Save new Invoice information found in the PayantInvoice argument and
     * notify {@code OnAddNewPayantInvoiceListener} of its response or if an error
     * occurred.
     * @param payantInvoice
     * @param onAddNewPayantInvoiceListener
     */
    public static void addPayantInvoice(PayantInvoice payantInvoice, final OnAddNewPayantInvoiceListener onAddNewPayantInvoiceListener) {

        Call<PayantInvoiceInfo> payantInvoiceInfoCall = payantApiService.addInvoice(Headers.contentType(), Headers.authorization(), payantInvoice);

        payantInvoiceInfoCall.enqueue(new Callback<PayantInvoiceInfo>() {
            @Override
            public void onResponse(Call<PayantInvoiceInfo> call, Response<PayantInvoiceInfo> response) {
                onAddNewPayantInvoiceListener.onInvoiceAdded(response.body());
            }

            @Override
            public void onFailure(Call<PayantInvoiceInfo> call, Throwable t) {
                onAddNewPayantInvoiceListener.onFailure(t);
            }
        });
    }

    public interface OnAddNewPayantInvoiceListener {
        /**
         * Get response when an attempt to add an invoice is made.
         * Does not guarantee that the operation was successful, check the payantInvoiceInfo status and message to confirm.
         *
         * @param payantInvoiceInfo
         */
        void onInvoiceAdded(PayantInvoiceInfo payantInvoiceInfo);

        /**
         * Invoked when unexpected exceptions or network exception occurs
         *
         * @param t
         */
        void onFailure(Throwable t);
    }
}

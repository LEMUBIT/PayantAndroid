package com.lemubit.lemuel.androidpayant.operations.invoices;

import com.lemubit.lemuel.androidpayant.api.Headers;
import com.lemubit.lemuel.androidpayant.api.PayantApiClient;
import com.lemubit.lemuel.androidpayant.api.PayantApiService;
import com.lemubit.lemuel.androidpayant.exceptions.PayantServerException;
import com.lemubit.lemuel.androidpayant.operations.invoices.model.PayantInvoice;
import com.lemubit.lemuel.androidpayant.operations.invoices.networkResponse.PayantInvoiceInfo;
import com.lemubit.lemuel.androidpayant.operations.invoices.networkResponse.SendPayantInvoice;

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
     *
     * @param payantInvoice                 Payant invoice object containing information to be added
     * @param onAddNewPayantInvoiceListener Listens for network call response.
     */
    public static void addPayantInvoice(PayantInvoice payantInvoice, final OnAddNewPayantInvoiceListener onAddNewPayantInvoiceListener) {

        Call<PayantInvoiceInfo> payantInvoiceInfoCall = payantApiService.addInvoice(Headers.contentType(), Headers.authorization(), payantInvoice);

        payantInvoiceInfoCall.enqueue(new Callback<PayantInvoiceInfo>() {
            @Override
            public void onResponse(Call<PayantInvoiceInfo> call, Response<PayantInvoiceInfo> response) {
                if (response.isSuccessful()) {
                    onAddNewPayantInvoiceListener.onManagerResponse(response.body());
                } else {
                    /*For cases where the server responses but might give error 404 or 500*/
                    onAddNewPayantInvoiceListener.onFailure(new PayantServerException("Error: " + String.valueOf(response.code())));
                }
            }

            @Override
            public void onFailure(Call<PayantInvoiceInfo> call, Throwable t) {
                onAddNewPayantInvoiceListener.onFailure(t);
            }
        });
    }

    /**
     * Get invoice information using provided invoice reference code and
     * notify {@code OnGetPayantInvoiceListener} of its response or if an error
     * occurred.
     *
     * @param invoiceReferenceCode       Reference code of desired invoice
     * @param onGetPayantInvoiceListener Listens for network call response.
     */
    public static void getPayantInvoice(String invoiceReferenceCode, final OnGetPayantInvoiceListener onGetPayantInvoiceListener) {
        Call<PayantInvoiceInfo> payantInvoiceInfoCall = payantApiService.getInvoice(Headers.contentType(), Headers.authorization(), invoiceReferenceCode);

        payantInvoiceInfoCall.enqueue(new Callback<PayantInvoiceInfo>() {
            @Override
            public void onResponse(Call<PayantInvoiceInfo> call, Response<PayantInvoiceInfo> response) {
                if (response.isSuccessful()) {
                    onGetPayantInvoiceListener.onManagerResponse(response.body());
                } else {
                    onGetPayantInvoiceListener.onFailure(new PayantServerException("Error: " + String.valueOf(response.code())));
                }
            }

            @Override
            public void onFailure(Call<PayantInvoiceInfo> call, Throwable t) {
                onGetPayantInvoiceListener.onFailure(t);
            }
        });
    }


    public static void sendPayantInvoice(String invoiceReferenceCode, final OnSendInvoiceListener onSendInvoiceListener) {
        Call<SendPayantInvoice> sendPayantInvoiceCall = payantApiService.sendInvoice(Headers.contentType(), Headers.authorization(), invoiceReferenceCode);

        sendPayantInvoiceCall.enqueue(new Callback<SendPayantInvoice>() {
            @Override
            public void onResponse(Call<SendPayantInvoice> call, Response<SendPayantInvoice> response) {
                if (response.isSuccessful()) {
                    onSendInvoiceListener.onManagerResponse(response.body());
                } else {
                    onSendInvoiceListener.onFailure(new PayantServerException("Error: " + String.valueOf(response.code())));
                }
            }

            @Override
            public void onFailure(Call<SendPayantInvoice> call, Throwable t) {
                onSendInvoiceListener.onFailure(t);
            }
        });
    }


    public interface OnAddNewPayantInvoiceListener {
        /**
         * Invoked when a Payant response is received
         * Note: Does not guarantee that the operation was successful. Call {@code PayantInvoiceInfo.isSuccessful()} to confirm.
         *
         * @param payantInvoiceInfo Contains information of added invoice
         */
        void onManagerResponse(PayantInvoiceInfo payantInvoiceInfo);

        /**
         * Invoked when unexpected exceptions or network exception occurs
         *
         * @param t Throwable
         */
        void onFailure(Throwable t);
    }

    public interface OnGetPayantInvoiceListener {
        /**
         * Invoked when a Payant response is received
         * Note: Does not guarantee that the operation was successful. Call {@code PayantInvoiceInfo.isSuccessful()} to confirm.
         *
         * @param payantInvoiceInfo Contains information of requested invoice
         */
        void onManagerResponse(PayantInvoiceInfo payantInvoiceInfo);

        /**
         * Invoked when unexpected exceptions or network exception occurs
         *
         * @param t Throwable
         */
        void onFailure(Throwable t);
    }

    public interface OnSendInvoiceListener {

        /**
         * Invoked when a Payant response is received
         * Note: Does not guarantee that the operation was successful. Call {@code SendPayantInvoice.isSuccessful()} to confirm.
         *
         * @param sendPayantInvoice
         */
        void onManagerResponse(SendPayantInvoice sendPayantInvoice);

        /**
         * Invoked when unexpected exceptions or network exception occurs
         *
         * @param t Throwable
         */
        void onFailure(Throwable t);
    }


}

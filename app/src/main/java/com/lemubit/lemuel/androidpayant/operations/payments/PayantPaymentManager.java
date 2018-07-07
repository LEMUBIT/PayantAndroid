package com.lemubit.lemuel.androidpayant.operations.payments;

import com.lemubit.lemuel.androidpayant.api.Headers;
import com.lemubit.lemuel.androidpayant.api.PayantApiClient;
import com.lemubit.lemuel.androidpayant.api.PayantApiService;
import com.lemubit.lemuel.androidpayant.exceptions.PayantServerException;
import com.lemubit.lemuel.androidpayant.operations.payments.model.PayantPayment;
import com.lemubit.lemuel.androidpayant.operations.payments.networkResponse.PayantPaymentInfo;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PayantPaymentManager {

    private static PayantApiService payantApiService = new PayantApiClient().getPayantApiService();

    /**
     * Add new Invoice information found in the PayantInvoice argument and
     * notify {@code OnAddNewPayantInvoiceListener} of its response or if an error
     * occurred.
     *
     * @param payantPayment                 Payant payment object containing information to be added
     * @param onAddNewPayantPaymentListener Listens for network call response.
     */
    public static void addPayantPayment(PayantPayment payantPayment, final OnAddNewPayantPaymentListener onAddNewPayantPaymentListener) {
        Call<PayantPaymentInfo> payantPaymentInfoCall = payantApiService.addPayment(Headers.contentType(), Headers.authorization(), payantPayment);

        payantPaymentInfoCall.enqueue(new Callback<PayantPaymentInfo>() {
            @Override
            public void onResponse(Call<PayantPaymentInfo> call, Response<PayantPaymentInfo> response) {
                if (response.isSuccessful()) {
                    onAddNewPayantPaymentListener.onManagerResponse(response.body());
                } else {
                    onAddNewPayantPaymentListener.onFailure(new PayantServerException("Error: " + String.valueOf(response.code())));
                }
            }

            @Override
            public void onFailure(Call<PayantPaymentInfo> call, Throwable t) {
                onAddNewPayantPaymentListener.onFailure(t);
            }
        });
    }

    /**
     * Get payment information using provided payment reference code
     *
     * @param paymentReferenceCode       Reference code of desired payment
     * @param onGetPayantPaymentListener Listens for network call response.
     */
    public static void getPayantPayment(String paymentReferenceCode, final OnGetPayantPaymentListener onGetPayantPaymentListener) {
        Call<PayantPaymentInfo> payantPaymentInfoCall = payantApiService.getPayment(Headers.contentType(), Headers.authorization(), paymentReferenceCode);

        payantPaymentInfoCall.enqueue(new Callback<PayantPaymentInfo>() {
            @Override
            public void onResponse(Call<PayantPaymentInfo> call, Response<PayantPaymentInfo> response) {
                if (response.isSuccessful()) {
                    onGetPayantPaymentListener.onManagerResponse(response.body());
                } else {
                    onGetPayantPaymentListener.onFailure(new PayantServerException("Error: " + String.valueOf(response.code())));
                }
            }

            @Override
            public void onFailure(Call<PayantPaymentInfo> call, Throwable t) {
                onGetPayantPaymentListener.onFailure(t);
            }
        });
    }

    public interface OnAddNewPayantPaymentListener {
        /**
         * Invoked when a Payant response is received
         * Note: Does not guarantee that the operation was successful. Call {@code PayantPaymentInfo.isSuccessful()} to confirm.
         *
         * @param payantPaymentInfo Contains information of added payment
         */
        void onManagerResponse(PayantPaymentInfo payantPaymentInfo);

        /**
         * Invoked when unexpected exceptions or network exception occurs
         *
         * @param t Throwable
         */
        void onFailure(Throwable t);
    }

    public interface OnGetPayantPaymentListener {
        /**
         * Invoked when a Payant response is received
         * Note: Does not guarantee that the operation was successful. Call {@code PayantPaymentInfo.isSuccessful()} to confirm.
         *
         * @param payantPaymentInfo Contains information of requested payment
         */
        void onManagerResponse(PayantPaymentInfo payantPaymentInfo);

        /**
         * Invoked when unexpected exceptions or network exception occurs
         *
         * @param t Throwable
         */
        void onFailure(Throwable t);
    }

}

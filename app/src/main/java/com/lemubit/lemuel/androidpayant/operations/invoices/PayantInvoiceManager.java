package com.lemubit.lemuel.androidpayant.operations.invoices;

import com.lemubit.lemuel.androidpayant.api.Headers;
import com.lemubit.lemuel.androidpayant.api.PayantApiClient;
import com.lemubit.lemuel.androidpayant.api.PayantApiService;
import com.lemubit.lemuel.androidpayant.exceptions.PayantServerException;
import com.lemubit.lemuel.androidpayant.operations.OperationStatus;
import com.lemubit.lemuel.androidpayant.utils.PayantHistory;
import com.lemubit.lemuel.androidpayant.operations.invoices.model.PayantInvoice;
import com.lemubit.lemuel.androidpayant.operations.invoices.networkResponse.PayantInvoiceHistoryInfo;
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
     * Add new Invoice information found in the PayantInvoice argument and
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


    /**
     * Send invoice with reference code {@code invoiceReferenceCode} to client's email
     *
     * @param invoiceReferenceCode  Reference code of desired invoice
     * @param onSendInvoiceListener Listens for network call response.
     */
    public static void sendPayantInvoice(String invoiceReferenceCode, final OnSendInvoiceListener onSendInvoiceListener) {
        Call<OperationStatus> sendPayantInvoiceCall = payantApiService.sendInvoice(Headers.contentType(), Headers.authorization(), invoiceReferenceCode);

        sendPayantInvoiceCall.enqueue(new Callback<OperationStatus>() {
            @Override
            public void onResponse(Call<OperationStatus> call, Response<OperationStatus> response) {
                if (response.isSuccessful()) {
                    onSendInvoiceListener.onManagerResponse(response.body());
                } else {
                    onSendInvoiceListener.onFailure(new PayantServerException("Error: " + String.valueOf(response.code())));
                }
            }

            @Override
            public void onFailure(Call<OperationStatus> call, Throwable t) {
                onSendInvoiceListener.onFailure(t);
            }
        });
    }

    /**
     * Get payant invoice history using the parameters found in {@code PayantHistory}
     *
     * @param payantHistory        Contains information used to search for invoice history
     * @param onGetInvoiceHistoryListener Listens for network call response
     */
    public static void getPayantInvoiceHistory(PayantHistory payantHistory, final OnGetInvoiceHistoryListener onGetInvoiceHistoryListener) {
        Call<PayantInvoiceHistoryInfo> payantInvoiceHistoryInfoCall = payantApiService.getInvoiceHistory(Headers.contentType(), Headers.authorization(), payantHistory);
        payantInvoiceHistoryInfoCall.enqueue(new Callback<PayantInvoiceHistoryInfo>() {
            @Override
            public void onResponse(Call<PayantInvoiceHistoryInfo> call, Response<PayantInvoiceHistoryInfo> response) {
                if (response.isSuccessful()) {
                    onGetInvoiceHistoryListener.onManagerResponse(response.body());
                } else {
                    onGetInvoiceHistoryListener.onFailure(new PayantServerException("Error: " + String.valueOf(response.code())));
                }
            }

            @Override
            public void onFailure(Call<PayantInvoiceHistoryInfo> call, Throwable t) {
                onGetInvoiceHistoryListener.onFailure(t);
            }
        });
    }

    /**
     * Delete invoice with reference code {@code invoiceReferenceCode}
     *
     * @param invoiceReferenceCode    Reference code of desired invoice
     * @param onDeleteInvoiceListener Listens for network call response
     */
    public static void deletePayantInvoice(String invoiceReferenceCode, final OnDeleteInvoiceListener onDeleteInvoiceListener) {
        Call<OperationStatus> deletePayantInvoiceInfoCall = payantApiService.deleteInvoice(Headers.contentType(), Headers.authorization(), invoiceReferenceCode);

        deletePayantInvoiceInfoCall.enqueue(new Callback<OperationStatus>() {
            @Override
            public void onResponse(Call<OperationStatus> call, Response<OperationStatus> response) {
                if (response.isSuccessful()) {
                    onDeleteInvoiceListener.onManagerResponse(response.body());
                } else {
                    onDeleteInvoiceListener.onFailure(new PayantServerException("Error: " + String.valueOf(response.code())));
                }
            }

            @Override
            public void onFailure(Call<OperationStatus> call, Throwable t) {
                onDeleteInvoiceListener.onFailure(t);
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
         * Note: Does not guarantee that the operation was successful. Call {@code SendPayantInvoiceInfo.isSuccessful()} to confirm.
         *
         * @param sendPayantInvoiceInfo Contains message of operation status, success or failure
         */
        void onManagerResponse(OperationStatus sendPayantInvoiceInfo);

        /**
         * Invoked when unexpected exceptions or network exception occurs
         *
         * @param t Throwable
         */
        void onFailure(Throwable t);
    }

    public interface OnGetInvoiceHistoryListener {

        /**
         * Note: Does not guarantee that the operation was successful. Call {@code PayantInvoiceHistoryInfo.isSuccessful()} to confirm.
         *
         * @param payantInvoiceHistoryInfo Contains information of requested list of invoices
         */
        void onManagerResponse(PayantInvoiceHistoryInfo payantInvoiceHistoryInfo);


        /**
         * Invoked when unexpected exceptions or network exception occurs
         *
         * @param t Throwable
         */
        void onFailure(Throwable t);
    }


    public interface OnDeleteInvoiceListener {

        /**
         * Note: Does not guarantee that the operation was successful. Call {@code DeletePayantInvoiceInfo.isSuccessful()} to confirm.
         *
         * @param deletePayantInvoiceInfo Contains message of operation status, success or failure
         */
        void onManagerResponse(OperationStatus deletePayantInvoiceInfo);

        /**
         * Invoked when unexpected exceptions or network exception occurs
         *
         * @param t Throwable
         */
        void onFailure(Throwable t);
    }


}

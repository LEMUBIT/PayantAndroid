package com.lemubit.lemuel.androidpayant.operations.clients;

import com.lemubit.lemuel.androidpayant.api.Headers;
import com.lemubit.lemuel.androidpayant.api.PayantApiClient;
import com.lemubit.lemuel.androidpayant.api.PayantApiService;
import com.lemubit.lemuel.androidpayant.exceptions.PayantServerException;
import com.lemubit.lemuel.androidpayant.operations.clients.model.PayantClient;
import com.lemubit.lemuel.androidpayant.operations.OperationStatus;
import com.lemubit.lemuel.androidpayant.operations.clients.networkResponse.PayantClientInfo;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * This class is the manager of all Payant Client operations
 *
 * @author lemuel
 */
public class PayantClientManager {

    private static PayantApiService payantApiService = new PayantApiClient().getPayantApiService();

    /**
     * Save new Client information found in the PayantClient argument and
     * notify {@code OnAddNewPayantClientListener} of its response or if an error
     * occurred.
     *
     * @param payantClient                 PayantClient object.
     * @param onAddNewPayantClientListener Listens for network call response.
     */
    public static void addPayantClient(PayantClient payantClient, final OnAddNewPayantClientListener onAddNewPayantClientListener) {

        Call<PayantClientInfo> payantClientInfoCall = payantApiService.addClient(Headers.contentType(), Headers.authorization(), payantClient);

        payantClientInfoCall.enqueue(new Callback<PayantClientInfo>() {
            @Override
            public void onResponse(Call<PayantClientInfo> call, Response<PayantClientInfo> response) {
                if (response.isSuccessful()) {
                    onAddNewPayantClientListener.onManagerResponse(response.body());
                } else {
                    onAddNewPayantClientListener.onFailure(new PayantServerException("Error: " + String.valueOf(response.code())));
                }
            }

            @Override
            public void onFailure(Call<PayantClientInfo> call, Throwable t) {
                onAddNewPayantClientListener.onFailure(t);
            }
        });

    }

    /**
     * Get information of a particular Client using the Client's ID.
     * and notify {@code OnGetPayantClientListener} of its response or if an error
     * occurred.
     *
     * @param clientID                  The ID of the Client.
     * @param onGetPayantClientListener Listens for network call response.
     */
    public static void getPayantClient(int clientID, final OnGetPayantClientListener onGetPayantClientListener) {


        Call<PayantClientInfo> payantClientInfoCall = payantApiService.getClient(Headers.contentType(), Headers.authorization(), clientID);

        payantClientInfoCall.enqueue(new Callback<PayantClientInfo>() {
            @Override
            public void onResponse(Call<PayantClientInfo> call, Response<PayantClientInfo> response) {
                if (response.isSuccessful()) {
                    onGetPayantClientListener.onManagerResponse(response.body());
                } else {
                    onGetPayantClientListener.onFailure(new PayantServerException("Error: " + String.valueOf(response.code())));
                }
            }

            @Override
            public void onFailure(Call<PayantClientInfo> call, Throwable t) {
                onGetPayantClientListener.onFailure(t);
            }
        });

    }

    /**
     * Update client identified using clientID with information contained in PayantClient object
     * and notify {@code OnEditPayantClientListener} of its response or if an error
     * occurred.
     *
     * @param clientID                   The ID of the Client.
     * @param payantClient               PayantClient object containing updated information about client.
     * @param onEditPayantClientListener Listens for network call response.
     */
    public static void editPayantClient(int clientID, PayantClient payantClient, final OnEditPayantClientListener onEditPayantClientListener) {
        Call<PayantClientInfo> payantClientInfoCall = payantApiService.editClient(Headers.contentType(), Headers.authorization(), clientID, payantClient);

        payantClientInfoCall.enqueue(new Callback<PayantClientInfo>() {
            @Override
            public void onResponse(Call<PayantClientInfo> call, Response<PayantClientInfo> response) {
                if (response.isSuccessful()) {
                    onEditPayantClientListener.onManagerResponse(response.body());
                } else {
                    onEditPayantClientListener.onFailure(new PayantServerException("Error: " + String.valueOf(response.code())));
                }
            }

            @Override
            public void onFailure(Call<PayantClientInfo> call, Throwable t) {
                onEditPayantClientListener.onFailure(t);
            }
        });

    }

    /**
     * Delete a client identified using clientID and notify {@code OnDeletePayantClientListener} of its
     * response or if an error occurred.
     *
     * @param clientID                     The ID of the Client.
     * @param onDeletePayantClientListener Listens for network call response.
     */
    public static void deletePayantClient(int clientID, final OnDeletePayantClientListener onDeletePayantClientListener) {

        Call<OperationStatus> deletePayantClientCall = payantApiService.deleteClient(Headers.contentType(), Headers.authorization(), clientID);
        deletePayantClientCall.enqueue(new Callback<OperationStatus>() {
            @Override
            public void onResponse(Call<OperationStatus> call, Response<OperationStatus> response) {
                if (response.isSuccessful()) {
                    onDeletePayantClientListener.onManagerResponse(response.body());
                } else {
                    onDeletePayantClientListener.onFailure(new PayantServerException("Error: " + String.valueOf(response.code())));
                }
            }

            @Override
            public void onFailure(Call<OperationStatus> call, Throwable t) {
                onDeletePayantClientListener.onFailure(t);
            }
        });
    }

    public interface OnAddNewPayantClientListener {
        /**
         * Invoked when a Payant response is received
         * Note: Does not guarantee that the operation was successful. Call {@code PayantClientInfo.isSuccessful()} to confirm.
         *
         * @param payantClientInfo
         */
        void onManagerResponse(PayantClientInfo payantClientInfo);

        /**
         * Invoked when unexpected exceptions or network exception occurs
         *
         * @param t
         */
        void onFailure(Throwable t);
    }

    public interface OnGetPayantClientListener {
        /**
         * Invoked when a Payant response is received
         * Note: Does not guarantee that the operation was successful. Call {@code PayantClientInfo.isSuccessful()} to confirm.
         *
         * @param payantClientInfo
         */
        void onManagerResponse(PayantClientInfo payantClientInfo);

        /**
         * Invoked when unexpected exceptions or network exception occurs
         *
         * @param t
         */
        void onFailure(Throwable t);
    }

    public interface OnEditPayantClientListener {
        /**
         * Invoked when a Payant response is received
         * Note: Does not guarantee that the operation was successful. Call {@code PayantClientInfo.isSuccessful()} to confirm.
         *
         * @param payantClientInfo
         */
        void onManagerResponse(PayantClientInfo payantClientInfo);

        /**
         * Invoked when unexpected exceptions or network exception occurs
         *
         * @param t
         */
        void onFailure(Throwable t);
    }

    public interface OnDeletePayantClientListener {
        /**
         * Invoked when a Payant response is received
         * Note: Does not guarantee that the operation was successful. Call {@code DeletePayantClient.isSuccessful()} to confirm.
         *
         * @param operationStatus
         */
        void onManagerResponse(OperationStatus operationStatus);

        /**
         * Invoked when unexpected exceptions or network exception occurs
         *
         * @param t
         */
        void onFailure(Throwable t);
    }
}

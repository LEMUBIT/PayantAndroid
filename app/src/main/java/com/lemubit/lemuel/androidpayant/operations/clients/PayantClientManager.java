package com.lemubit.lemuel.androidpayant.operations.clients;

import com.lemubit.lemuel.androidpayant.api.Headers;
import com.lemubit.lemuel.androidpayant.api.PayantApiService;
import com.lemubit.lemuel.androidpayant.api.PayantApiClient;
import com.lemubit.lemuel.androidpayant.operations.clients.model.PayantClient;
import com.lemubit.lemuel.androidpayant.operations.clients.networkResponse.DeletePayantClient;
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
                onAddNewPayantClientListener.onClientAdded(response.body());
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
                onGetPayantClientListener.onGetClient(response.body());
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
                onEditPayantClientListener.onClientEdited(response.body());
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

        Call<DeletePayantClient> deletePayantClientCall = payantApiService.deleteClient(Headers.contentType(), Headers.authorization(), clientID);
        deletePayantClientCall.enqueue(new Callback<DeletePayantClient>() {
            @Override
            public void onResponse(Call<DeletePayantClient> call, Response<DeletePayantClient> response) {
                onDeletePayantClientListener.onClientDeleted(response.body());
            }

            @Override
            public void onFailure(Call<DeletePayantClient> call, Throwable t) {
                onDeletePayantClientListener.onFailure(t);
            }
        });
    }

    public interface OnAddNewPayantClientListener {
        /**
         * Get response when an attempt to add a Client is made.
         * Does not guarantee that the operation was successful, check the payantClientInfo status and message to confirm.
         *
         * @param payantClientInfo
         */
        void onClientAdded(PayantClientInfo payantClientInfo);


        /**
         * Invoked when unexpected exceptions or network exception occurs
         *
         * @param t
         */
        void onFailure(Throwable t);
    }

    public interface OnGetPayantClientListener {
        /**
         * Get response when an attempt to get a Client's info is made.
         * Does not guarantee that the operation was successful, check the payantClientInfo status and message to confirm.
         *
         * @param payantClientInfo
         */
        void onGetClient(PayantClientInfo payantClientInfo);

        /**
         * Invoked when unexpected exceptions or network exception occurs
         *
         * @param t
         */
        void onFailure(Throwable t);
    }

    public interface OnEditPayantClientListener {
        /**
         * Get response when an attempt to edit a Client's info is made.
         * Does not guarantee that the operation was successful, check the payantClientInfo status and message to confirm.
         *
         * @param payantClientInfo
         */
        void onClientEdited(PayantClientInfo payantClientInfo);

        /**
         * Invoked when unexpected exceptions or network exception occurs
         *
         * @param t
         */
        void onFailure(Throwable t);
    }

    public interface OnDeletePayantClientListener {
        /**
         * Get response when an attempt to delete a Client's info is made.
         * Does not guarantee that the operation was successful, check the payantClientInfo status and message to confirm.
         *
         * @param deletePayantClient
         */
        void onClientDeleted(DeletePayantClient deletePayantClient);

        /**
         * Invoked when unexpected exceptions or network exception occurs
         *
         * @param t
         */
        void onFailure(Throwable t);
    }
}

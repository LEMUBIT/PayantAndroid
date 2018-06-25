package com.lemubit.lemuel.androidpayant.operations.clients;

import android.support.annotation.NonNull;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.lemubit.lemuel.androidpayant.Payant;
import com.lemubit.lemuel.androidpayant.api.PayantAPI;
import com.lemubit.lemuel.androidpayant.operations.clients.model.PayantClient;
import com.lemubit.lemuel.androidpayant.operations.clients.networkResponse.PayantClientInfo;
import com.lemubit.lemuel.androidpayant.utils.GlobalStrings;

import org.jetbrains.annotations.Contract;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * This class is the manager of all Payant Client operations
 *
 * @author lemuel
 */
public class PayantClientManager {

    private static Gson gson = new GsonBuilder()
            .setLenient()
            .create();

    private static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(GlobalStrings.DEMO_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build();

    private static PayantAPI payantAPI = retrofit.create(PayantAPI.class);


    /**
     * Save new Client information found in the PayantClient argument and
     * notify {@code onPayantClientAddedListener} of its response or if an error
     * occurred.
     *
     * @param payantClient                PayantClient object.
     * @param onPayantClientAddedListener Listens for network call response.
     */
    public static void addPayantClient(PayantClient payantClient, final OnPayantClientAddedListener onPayantClientAddedListener) {

        Call<PayantClientInfo> payantClientInfoCall = payantAPI.addClient(contentType(), authorization(), payantClient);

        payantClientInfoCall.enqueue(new Callback<PayantClientInfo>() {
            @Override
            public void onResponse(Call<PayantClientInfo> call, Response<PayantClientInfo> response) {
                onPayantClientAddedListener.onClientAdded(response.body());
            }

            @Override
            public void onFailure(Call<PayantClientInfo> call, Throwable t) {
                onPayantClientAddedListener.onFailure(t);
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


        Call<PayantClientInfo> payantClientInfoCall = payantAPI.getClient(contentType(), authorization(), clientID);

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
     * and notify {@code onPayantClientEditedListener} of its response or if an error
     * occurred.
     *
     * @param clientID                     The ID of the Client.
     * @param payantClient                 PayantClient object containing updated information about client.
     * @param onPayantClientEditedListener Listens for network call response.
     */
    public static void editPayantClient(int clientID, PayantClient payantClient, final OnPayantClientEditedListener onPayantClientEditedListener) {
        Call<PayantClientInfo> payantClientInfoCall = payantAPI.editClient(contentType(), authorization(), clientID, payantClient);

        payantClientInfoCall.enqueue(new Callback<PayantClientInfo>() {
            @Override
            public void onResponse(Call<PayantClientInfo> call, Response<PayantClientInfo> response) {
                onPayantClientEditedListener.onClientEdited(response.body());
            }

            @Override
            public void onFailure(Call<PayantClientInfo> call, Throwable t) {
                onPayantClientEditedListener.onFailure(t);
            }
        });

    }

    @NonNull
    @Contract(pure = true)
    private static String contentType() {
        return "application/json";
    }

    @NonNull
    private static String authorization() {
        return "Bearer " + Payant.getPrivateKey();
    }

    public interface OnPayantClientAddedListener {
        void onClientAdded(PayantClientInfo payantClientInfo);

        void onFailure(Throwable t);
    }

    public interface OnGetPayantClientListener {
        void onGetClient(PayantClientInfo payantClientInfo);

        void onFailure(Throwable t);
    }


    public interface OnPayantClientEditedListener {
        void onClientEdited(PayantClientInfo payantClientInfo);

        void onFailure(Throwable t);
    }
}

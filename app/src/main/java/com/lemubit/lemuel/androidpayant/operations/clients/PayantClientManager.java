package com.lemubit.lemuel.androidpayant.operations.clients;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.lemubit.lemuel.androidpayant.Payant;
import com.lemubit.lemuel.androidpayant.api.PayantAPI;
import com.lemubit.lemuel.androidpayant.operations.clients.PayantClientResponse.PayantClientResponse;
import com.lemubit.lemuel.androidpayant.operations.clients.model.PayantClient;
import com.lemubit.lemuel.androidpayant.utils.GlobalStrings;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author lemuel
 */
public class PayantClientManager {

    public static void addPayantClient(PayantClient payantClient, final OnPayantClientAddedListener onPayantClientAddedListener) {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(GlobalStrings.DEMO_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        PayantAPI payantAPI = retrofit.create(PayantAPI.class);

        Call<PayantClientResponse> payantClientResponseCall = payantAPI.addClient("application/json", "Bearer " + Payant.getPrivateKey(), payantClient);

        payantClientResponseCall.enqueue(new Callback<PayantClientResponse>() {
            @Override
            public void onResponse(Call<PayantClientResponse> call, Response<PayantClientResponse> response) {
                onPayantClientAddedListener.onClientAdded(response.body());
            }

            @Override
            public void onFailure(Call<PayantClientResponse> call, Throwable t) {
                onPayantClientAddedListener.onFailure(t);
            }
        });

    }

    public static void getPayantClient(int clientID, final OnGetPayantClientListener onGetPayantClientListener) {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(GlobalStrings.DEMO_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        PayantAPI payantAPI = retrofit.create(PayantAPI.class);

        Call<PayantClientResponse> payantClientResponseCall = payantAPI.getClient("application/json", "Bearer " + Payant.getPrivateKey(), clientID);

        payantClientResponseCall.enqueue(new Callback<PayantClientResponse>() {
            @Override
            public void onResponse(Call<PayantClientResponse> call, Response<PayantClientResponse> response) {
                onGetPayantClientListener.onGetClient(response.body());
            }

            @Override
            public void onFailure(Call<PayantClientResponse> call, Throwable t) {
                onGetPayantClientListener.onFailure(t);
            }
        });

    }


    public interface OnPayantClientAddedListener {
        void onClientAdded(PayantClientResponse payantClientResponse);

        void onFailure(Throwable t);
    }


    public interface OnGetPayantClientListener {
        void onGetClient(PayantClientResponse payantClientResponse);

        void onFailure(Throwable t);
    }


}

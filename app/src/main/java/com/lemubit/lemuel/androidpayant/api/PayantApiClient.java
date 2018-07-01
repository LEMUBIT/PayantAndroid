package com.lemubit.lemuel.androidpayant.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.lemubit.lemuel.androidpayant.utils.Url;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author lemuel
 */
public class PayantApiClient {
    private PayantApiService payantApiService;

    public PayantApiClient() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Url.DEMO_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        payantApiService = retrofit.create(PayantApiService.class);
    }

    public PayantApiService getPayantApiService() {
        return payantApiService;
    }
}

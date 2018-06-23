package com.lemubit.lemuel.androidpayant.api;

import com.lemubit.lemuel.androidpayant.operations.clients.PayantClientResponse.PayantClientResponse;
import com.lemubit.lemuel.androidpayant.operations.clients.model.PayantClient;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

/**
 * @author lemuel
 */
public interface PayantAPI {

    @POST("clients")
    Call<PayantClientResponse> addClient(@Header("Content-Type") String contentType, @Header("Authorization") String authorization, @Body PayantClient payantClient);

}

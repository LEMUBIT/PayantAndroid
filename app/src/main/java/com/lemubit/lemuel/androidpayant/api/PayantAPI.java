package com.lemubit.lemuel.androidpayant.api;

import com.lemubit.lemuel.androidpayant.operations.clients.PayantClientResponse.PayantClientResponse;
import com.lemubit.lemuel.androidpayant.operations.clients.model.PayantClient;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * @author lemuel
 */
public interface PayantAPI {

    @POST("clients")
    Call<PayantClientResponse> addClient(@Header("Content-Type") String contentType, @Header("Authorization") String authorization, @Body PayantClient payantClient);

    @GET("clients/{id}")
    Call<PayantClientResponse> getClient(@Header("Content-Type") String contentType, @Header("Authorization") String authorization, @Path("id") int clientID);
}

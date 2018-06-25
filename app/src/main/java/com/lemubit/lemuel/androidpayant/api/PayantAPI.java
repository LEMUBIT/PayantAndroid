package com.lemubit.lemuel.androidpayant.api;

import com.lemubit.lemuel.androidpayant.operations.clients.networkResponse.PayantClientResponse;
import com.lemubit.lemuel.androidpayant.operations.clients.model.PayantClient;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * @author lemuel
 */
public interface PayantAPI {

    /**
     * Save new Client information found in the PayantClient object.
     * @param contentType
     * @param authorization
     * @param payantClient
     * @return
     */
    @POST("clients")
    Call<PayantClientResponse> addClient(@Header("Content-Type") String contentType, @Header("Authorization") String authorization, @Body PayantClient payantClient);

    /**
     * Gets information about client using Client ID.
     * @param contentType
     * @param authorization
     * @param clientID
     * @return
     */
    @GET("clients/{id}")
    Call<PayantClientResponse> getClient(@Header("Content-Type") String contentType, @Header("Authorization") String authorization, @Path("id") int clientID);

    /**
     * Update client identified using clientID with information contained in PayantClient object.
     * @param contentType
     * @param authorization
     * @param clientID
     * @param payantClient
     * @return
     */
    @PUT("clients/{id}")
    Call<PayantClientResponse> editClient(@Header("Content-Type") String contentType, @Header("Authorization") String authorization, @Path("id") int clientID, @Body PayantClient payantClient);
}

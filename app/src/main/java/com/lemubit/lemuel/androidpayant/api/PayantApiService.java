package com.lemubit.lemuel.androidpayant.api;

import com.lemubit.lemuel.androidpayant.operations.clients.model.PayantClient;
import com.lemubit.lemuel.androidpayant.operations.clients.networkResponse.DeletePayantClient;
import com.lemubit.lemuel.androidpayant.operations.clients.networkResponse.PayantClientInfo;
import com.lemubit.lemuel.androidpayant.operations.invoices.model.PayantInvoice;
import com.lemubit.lemuel.androidpayant.operations.invoices.networkResponse.PayantInvoiceInfo;
import com.lemubit.lemuel.androidpayant.operations.invoices.networkResponse.SendPayantInvoice;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * @author lemuel
 */
public interface PayantApiService {

    /**
     * Save new Client information found in the PayantClient object.
     *
     * @param contentType
     * @param authorization
     * @param payantClient
     */
    @POST("clients")
    Call<PayantClientInfo> addClient(@Header("Content-Type") String contentType, @Header("Authorization") String authorization, @Body PayantClient payantClient);

    /**
     * Gets information about client using Client ID.
     *
     * @param contentType
     * @param authorization
     * @param clientID
     */
    @GET("clients/{id}")
    Call<PayantClientInfo> getClient(@Header("Content-Type") String contentType, @Header("Authorization") String authorization, @Path("id") int clientID);

    /**
     * Update client identified using clientID with information contained in PayantClient object.
     *
     * @param contentType
     * @param authorization
     * @param clientID
     * @param payantClient
     */
    @PUT("clients/{id}")
    Call<PayantClientInfo> editClient(@Header("Content-Type") String contentType, @Header("Authorization") String authorization, @Path("id") int clientID, @Body PayantClient payantClient);


    /**
     * Delete a client identified using clientID.
     *
     * @param contentType
     * @param authorization
     * @param clientID
     */
    @DELETE("clients/{id}")
    Call<DeletePayantClient> deleteClient(@Header("Content-Type") String contentType, @Header("Authorization") String authorization, @Path("id") int clientID);


    /**
     * Save new Invoice information found in the PayantInvoice argument.
     *
     * @param contentType
     * @param authorization
     * @param payantInvoice
     */
    @POST("invoices")
    Call<PayantInvoiceInfo> addInvoice(@Header("Content-Type") String contentType, @Header("Authorization") String authorization, @Body PayantInvoice payantInvoice);

    /**
     * Get invoice information using the invoice Reference Code.
     * @param contentType
     * @param authorization
     * @param invoiceReferenceCode
     */
    @GET("invoices/{reference_code}")
    Call<PayantInvoiceInfo> getInvoice(@Header("Content-Type") String contentType, @Header("Authorization") String authorization, @Path("reference_code") String invoiceReferenceCode);


    /**
     * Send invoice with Reference Code: {@code invoiceReferenceCode}.
     * @param contentType
     * @param authorization
     * @param invoiceReferenceCode
     * @return
     */
    @GET("invoices/send/{reference_code}")
    Call<SendPayantInvoice> sendInvoice(@Header("Content-Type") String contentType, @Header("Authorization") String authorization, @Path("reference_code") String invoiceReferenceCode);


}

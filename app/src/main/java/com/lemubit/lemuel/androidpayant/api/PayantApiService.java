package com.lemubit.lemuel.androidpayant.api;

import com.lemubit.lemuel.androidpayant.operations.clients.model.PayantClient;
import com.lemubit.lemuel.androidpayant.operations.clients.networkResponse.DeletePayantClientInfo;
import com.lemubit.lemuel.androidpayant.operations.clients.networkResponse.PayantClientInfo;
import com.lemubit.lemuel.androidpayant.operations.invoices.model.PayantInvoice;
import com.lemubit.lemuel.androidpayant.operations.invoices.model.PayantInvoiceHistory;
import com.lemubit.lemuel.androidpayant.operations.invoices.networkResponse.DeletePayantInvoiceInfo;
import com.lemubit.lemuel.androidpayant.operations.invoices.networkResponse.PayantInvoiceHistoryInfo;
import com.lemubit.lemuel.androidpayant.operations.invoices.networkResponse.PayantInvoiceInfo;
import com.lemubit.lemuel.androidpayant.operations.invoices.networkResponse.SendPayantInvoiceInfo;
import com.lemubit.lemuel.androidpayant.operations.payments.model.PayantPayment;
import com.lemubit.lemuel.androidpayant.operations.payments.networkResponse.PayantPaymentInfo;

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
     * Save new Client information found in {@code PayantClient}.
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
    Call<DeletePayantClientInfo> deleteClient(@Header("Content-Type") String contentType, @Header("Authorization") String authorization, @Path("id") int clientID);


    /**
     * Save new Invoice information found in {@code PayantInvoice}.
     *
     * @param contentType
     * @param authorization
     * @param payantInvoice
     */
    @POST("invoices")
    Call<PayantInvoiceInfo> addInvoice(@Header("Content-Type") String contentType, @Header("Authorization") String authorization, @Body PayantInvoice payantInvoice);

    /**
     * Get invoice information using the invoice Reference Code.
     *
     * @param contentType
     * @param authorization
     * @param invoiceReferenceCode
     */
    @GET("invoices/{reference_code}")
    Call<PayantInvoiceInfo> getInvoice(@Header("Content-Type") String contentType, @Header("Authorization") String authorization, @Path("reference_code") String invoiceReferenceCode);


    /**
     * Send invoice with Reference Code: {@code invoiceReferenceCode}.
     *
     * @param contentType
     * @param authorization
     * @param invoiceReferenceCode
     */
    @GET("invoices/send/{reference_code}")
    Call<SendPayantInvoiceInfo> sendInvoice(@Header("Content-Type") String contentType, @Header("Authorization") String authorization, @Path("reference_code") String invoiceReferenceCode);


    /**
     * Get payant invoice history using the parameters found in {@code PayantInvoiceHistory}
     *
     * @param contentType
     * @param authorization
     * @param payantInvoiceHistory
     */
    @POST("/invoices/history")
    Call<PayantInvoiceHistoryInfo> getInvoiceHistory(@Header("Content-Type") String contentType, @Header("Authorization") String authorization, @Body PayantInvoiceHistory payantInvoiceHistory);

    /**
     * Delete invoice with reference code {@code referenceCode}
     *
     * @param contentType
     * @param authorization
     * @param referenceCode
     */
    @DELETE("invoices/{reference_code}")
    Call<DeletePayantInvoiceInfo> deleteInvoice(@Header("Content-Type") String contentType, @Header("Authorization") String authorization, @Path("reference_code") String referenceCode);


    /**
     * Add new Payment with information found in {@code PayantPayment}
     *
     * @param contentType
     * @param authorization
     * @param payantPayment
     */
    @POST("payments")
    Call<PayantPaymentInfo> addPayment(@Header("Content-Type") String contentType, @Header("Authorization") String authorization, @Body PayantPayment payantPayment);


    /**
     * Get payment information using the payment Reference Code {@code paymentReferenceCode}.
     *
     * @param contentType
     * @param authorization
     * @param paymentReferenceCode
     */
    @GET("payments/{reference_code}")
    Call<PayantPaymentInfo> getPayment(@Header("Content-Type") String contentType, @Header("Authorization") String authorization, @Path("reference_code") String paymentReferenceCode);

}

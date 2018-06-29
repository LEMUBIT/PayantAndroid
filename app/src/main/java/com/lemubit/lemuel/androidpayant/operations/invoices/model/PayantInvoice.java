package com.lemubit.lemuel.androidpayant.operations.invoices.model;

import com.lemubit.lemuel.androidpayant.annotation.PayantRequired;
import com.lemubit.lemuel.androidpayant.operations.clients.model.PayantClient;

import java.util.List;

/**
 * Create new Invoice with PayantInvoice class. Invoice's Client, Client ID, Due date, Items and Fee bearer are required.
 *
 * @author lemuel
 */
public class PayantInvoice {

    @PayantRequired
    private PayantClient client;

    @PayantRequired
    private String client_id;

    @PayantRequired
    private String due_date;

    @PayantRequired
    private String fee_bearer;

    private String tokenize;

    private String card_token;

    @PayantRequired
    private List<PayantInvoiceItem> items;

    private String recipient;

    private String recipient_id;

    private String merchant_ref;

    private String metadata;

    public PayantInvoice() {
    }

    public PayantInvoice(PayantClient client, String clientId, String dueDate, String feeBearer, List<PayantInvoiceItem> items) {
        this.client = client;
        this.client_id = clientId;
        this.due_date = dueDate;
        this.fee_bearer = feeBearer;
        this.items = items;
    }


    public PayantClient getClient() {
        return client;
    }

    /**
     * Set invoice Client Data
     *
     * @param client
     */
    public void setClient(PayantClient client) {
        this.client = client;
    }

    public String getclientId() {
        return client_id;
    }

    /**
     * Set invoice Client ID
     *
     * @param clientId
     */
    public void setclientId(String clientId) {
        this.client_id = clientId;
    }

    public String getdueDate() {
        return due_date;
    }

    /**
     * Set invoice due date (MM/DD/YYYY).
     *
     * @param dueDate
     */
    public void setdueDate(String dueDate) {
        this.due_date = dueDate;
    }

    public String getfeeBearer() {
        return fee_bearer;
    }

    /**
     * Set invoice fee bearer (account or client)
     *
     * @param feeBearer
     */
    public void setfeeBearer(String feeBearer) {
        this.fee_bearer = feeBearer;
    }

    public String getTokenize() {
        return tokenize;
    }

    /**
     * Tokenize card used to make payment for this invoice (true or false). Defaults to (false).
     *
     * @param tokenize
     */
    public void setTokenize(String tokenize) {
        this.tokenize = tokenize;
    }

    public String getcardToken() {
        return card_token;
    }

    /**
     * Card token generated from a tokenized transaction to automatically make payment for this invoice.
     *
     * @param cardToken
     */
    public void setcardToken(String cardToken) {
        this.card_token = cardToken;
    }

    public List<PayantInvoiceItem> getItems() {
        return items;
    }

    /**
     * Set invoice items
     *
     * @param items
     */
    public void setItems(List<PayantInvoiceItem> items) {
        this.items = items;
    }

    public String getRecipient() {
        return recipient;
    }

    /**
     * Invoice payment recipient (account or wallet) Defaults to (account).
     *
     * @param recipient
     */
    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getrecipientId() {
        return recipient_id;
    }

    /**
     * Invoice payment recipient id (Wallet Ref.) Required if recipient is wallet
     *
     * @param recipientId
     */
    public void setrecipientId(String recipientId) {
        this.recipient_id = recipientId;
    }

    public String getmerchantRef() {
        return merchant_ref;
    }

    /**
     * Merchant's unique invoice reference code
     *
     * @param merchantRef
     */
    public void setmerchantRef(String merchantRef) {
        this.merchant_ref = merchantRef;
    }

    public String getMetadata() {
        return metadata;
    }

    /**
     * Key-value pairs object
     *
     * @param metadata
     */
    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }
}

package com.lemubit.lemuel.androidpayant.operations.invoices.model;

import com.lemubit.lemuel.androidpayant.annotation.PayantRequired;
import com.lemubit.lemuel.androidpayant.operations.clients.model.PayantClient;

import java.util.List;

public class PayantInvoice {

    @PayantRequired
    PayantClient client;

    @PayantRequired
    String client_id;

    @PayantRequired
    String due_date;

    @PayantRequired
    String fee_bearer;

    String tokenize;

    String card_token;

    @PayantRequired
    List<PayantInvoiceItem> items;

    String recipient;

    String recipient_id;

    String merchant_ref;

    String metadata;

    public PayantInvoice(PayantClient client, String client_id, String due_date, String fee_bearer, String tokenize, String card_token, List<PayantInvoiceItem> items, String recipient, String recipient_id, String merchant_ref, String metadata) {
        this.client = client;
        this.client_id = client_id;
        this.due_date = due_date;
        this.fee_bearer = fee_bearer;
        this.tokenize = tokenize;
        this.card_token = card_token;
        this.items = items;
        this.recipient = recipient;
        this.recipient_id = recipient_id;
        this.merchant_ref = merchant_ref;
        this.metadata = metadata;
    }

    public PayantInvoice(PayantClient client, String client_id, String due_date, String fee_bearer, List<PayantInvoiceItem> items, String recipient, String recipient_id) {
        this.client = client;
        this.client_id = client_id;
        this.due_date = due_date;
        this.fee_bearer = fee_bearer;
        this.items = items;
        this.recipient = recipient;
        this.recipient_id = recipient_id;
    }

    public PayantInvoice(PayantClient client, String client_id, String due_date, String fee_bearer, List<PayantInvoiceItem> items) {
        this.client = client;
        this.client_id = client_id;
        this.due_date = due_date;
        this.fee_bearer = fee_bearer;
        this.items = items;
    }



    public PayantClient getClient() {
        return client;
    }

    public void setClient(PayantClient client) {
        this.client = client;
    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getDue_date() {
        return due_date;
    }

    public void setDue_date(String due_date) {
        this.due_date = due_date;
    }

    public String getFee_bearer() {
        return fee_bearer;
    }

    public void setFee_bearer(String fee_bearer) {
        this.fee_bearer = fee_bearer;
    }

    public String getTokenize() {
        return tokenize;
    }

    public void setTokenize(String tokenize) {
        this.tokenize = tokenize;
    }

    public String getCard_token() {
        return card_token;
    }

    public void setCard_token(String card_token) {
        this.card_token = card_token;
    }

    public List<PayantInvoiceItem> getItems() {
        return items;
    }

    public void setItems(List<PayantInvoiceItem> items) {
        this.items = items;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getRecipient_id() {
        return recipient_id;
    }

    public void setRecipient_id(String recipient_id) {
        this.recipient_id = recipient_id;
    }

    public String getMerchant_ref() {
        return merchant_ref;
    }

    public void setMerchant_ref(String merchant_ref) {
        this.merchant_ref = merchant_ref;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }
}

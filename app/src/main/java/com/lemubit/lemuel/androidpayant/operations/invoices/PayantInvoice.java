package com.lemubit.lemuel.androidpayant.operations.invoices;

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
    List<Item> items;

    String recipient;

    String recipient_id;

    String merchant_ref;

    String metadata;

}

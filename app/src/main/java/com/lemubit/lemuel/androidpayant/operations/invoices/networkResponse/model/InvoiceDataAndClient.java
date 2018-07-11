package com.lemubit.lemuel.androidpayant.operations.invoices.networkResponse.model;

/**
 * @author lemuel
 */
public class InvoiceDataAndClient extends InvoiceData {

    private Client client;

    public Client getClient() {
        return client;
    }

    @Override
    public String toString() {
        return super.toString() + " InvoiceClient{" +
                "client=" + client +
                '}';
    }
}

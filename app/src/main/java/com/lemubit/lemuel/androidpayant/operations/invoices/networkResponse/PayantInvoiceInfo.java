package com.lemubit.lemuel.androidpayant.operations.invoices.networkResponse;

public class PayantInvoiceInfo {
    String status;
    Data data;

    public String getStatus() {
        return status;
    }

    public Data getData() {
        return data;
    }

    @Override
    public String toString() {
        return "PayantInvoiceInfo{" +
                "status='" + status + '\'' +
                ", data=" + data +
                '}';
    }
}

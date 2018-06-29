package com.lemubit.lemuel.androidpayant.operations.invoices.networkResponse;

public class PayantInvoiceInfo {
    private String status;
    private String message;
    private Data data;

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public Data getData() {
        return data;
    }

    @Override
    public String toString() {
        return "PayantInvoiceInfo{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}

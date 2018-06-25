package com.lemubit.lemuel.androidpayant.operations.clients.networkResponse;

/**
 * @author lemuel
 */
public class PayantClientInfo {
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
        return "PayantClientResponse{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}

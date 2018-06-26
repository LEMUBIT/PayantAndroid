package com.lemubit.lemuel.androidpayant.operations.clients.networkResponse;

/**
 * Contains the status and message of a delete operation using PayantClientManager
 * @author lemuel
 */
public class DeletePayantClient {
    private String status;
    private String message;

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "DeletePayantClient{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}

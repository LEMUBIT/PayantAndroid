package com.lemubit.lemuel.androidpayant.operations.clients.networkResponse;

import com.lemubit.lemuel.androidpayant.utils.StatusString;

/**
 * Contains the status and message of a delete operation using PayantClientManager
 *
 * @author lemuel
 */
public class DeletePayantClientInfo {
    private String status;
    private String message;

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public Boolean isSuccessful()
    {
        return status.equals(StatusString.PASSED);
    }

    @Override
    public String toString() {
        return "DeletePayantClient{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}

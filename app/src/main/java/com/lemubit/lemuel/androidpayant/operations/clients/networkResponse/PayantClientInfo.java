package com.lemubit.lemuel.androidpayant.operations.clients.networkResponse;

import com.lemubit.lemuel.androidpayant.utils.StatusString;

/**
 * Contains the Payant client information, used when performing operations with PayantClientManager
 *
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

    public Boolean isSuccessful()
    {
        return status.equals(StatusString.PASSED);
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

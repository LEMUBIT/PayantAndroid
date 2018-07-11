package com.lemubit.lemuel.androidpayant.operations;

import com.lemubit.lemuel.androidpayant.utils.StatusString;

/**
 * Contains the status and message of payant operations that just respond with the status
 * and a message that might contain more information about the operation in case there is an error
 *
 * @author lemuel
 */
public class OperationStatus {
    private String status;
    private String message;

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public Boolean isSuccessful() {
        return status.equals(StatusString.PASSED);
    }

    @Override
    public String toString() {
        return "OperationStatus{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}

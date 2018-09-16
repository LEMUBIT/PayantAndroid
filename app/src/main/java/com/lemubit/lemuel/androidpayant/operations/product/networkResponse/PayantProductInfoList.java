package com.lemubit.lemuel.androidpayant.operations.product.networkResponse;

import com.lemubit.lemuel.androidpayant.operations.product.networkResponse.model.ProductDataWithDeleteDate;
import com.lemubit.lemuel.androidpayant.utils.StatusString;

import java.util.List;

/**
 * @author lemuel
 */
public class PayantProductInfoList {
    private String status;
    private String message;
    private List<ProductDataWithDeleteDate> data;

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public List<ProductDataWithDeleteDate> getData() {
        return data;
    }

    public Boolean isSuccessful() {
        return status.equals(StatusString.PASSED);
    }

    @Override
    public String toString() {
        return "PayantProductInfoList{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}

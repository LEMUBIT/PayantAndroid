package com.lemubit.lemuel.androidpayant.operations.wallets.networkResponse;

import com.lemubit.lemuel.androidpayant.operations.wallets.networkResponse.model.WalletData;
import com.lemubit.lemuel.androidpayant.utils.StatusString;

import java.util.List;

/**
 * @author lemuel
 */
public class PayantWalletInfoList {
    private String status;
    private String message;
    private List<WalletData> data;

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public List<WalletData> getData() {
        return data;
    }

    public Boolean isSuccessful() {
        return status.equals(StatusString.PASSED);
    }

    @Override
    public String toString() {
        return "PayantWalletInfoList{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}

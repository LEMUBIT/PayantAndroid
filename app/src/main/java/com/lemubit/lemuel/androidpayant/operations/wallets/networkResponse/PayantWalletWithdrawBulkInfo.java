package com.lemubit.lemuel.androidpayant.operations.wallets.networkResponse;

import com.lemubit.lemuel.androidpayant.operations.wallets.networkResponse.model.WalletWithdrawBuklData;
import com.lemubit.lemuel.androidpayant.utils.StatusString;

public class PayantWalletWithdrawBulkInfo {
    private String status;
    private String message;
    private WalletWithdrawBuklData data;

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public WalletWithdrawBuklData getData() {
        return data;
    }

    public Boolean isSuccessful() {
        return status.equals(StatusString.PASSED);
    }

    @Override
    public String toString() {
        return "PayantWalletWithdrawBulkInfo{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}

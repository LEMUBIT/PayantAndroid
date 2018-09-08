package com.lemubit.lemuel.androidpayant.operations.wallets.networkResponse.model;

import java.util.List;

/**
 * @author lemuel
 */
public class WalletTransactionData {
    private String period;
    private String start;
    private String end;
    private List<WalletTransaction> transactions;

    public String getPeriod() {
        return period;
    }

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }

    public List<WalletTransaction> getTransactions() {
        return transactions;
    }

    @Override
    public String toString() {
        return "WalletTransactionData{" +
                "period='" + period + '\'' +
                ", start='" + start + '\'' +
                ", end='" + end + '\'' +
                ", transactions=" + transactions +
                '}';
    }
}

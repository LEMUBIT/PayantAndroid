package com.lemubit.lemuel.androidpayant.operations.payments.networkResponse.model;

import java.util.List;

/**
 * @author lemuel
 */
public class HistoryData {
    private String period;
    private String start;
    private String end;
    private List<PaymentData> payments;

    public String getPeriod() {
        return period;
    }

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }

    public List<PaymentData> getPayments() {
        return payments;
    }

    @Override
    public String toString() {
        return "HistoryData{" +
                "period='" + period + '\'' +
                ", start='" + start + '\'' +
                ", end='" + end + '\'' +
                ", payments=" + payments +
                '}';
    }
}

package com.lemubit.lemuel.androidpayant.operations.invoices.networkResponse.model;

import com.lemubit.lemuel.androidpayant.operations.invoices.networkResponse.model.Data;

import java.util.List;

/**
 * @author lemuel
 */
public class HistoryData {
    String period;
    String start;
    String end;
    List<Data> invoices;

    public String getPeriod() {
        return period;
    }

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }

    public List<Data> getInvoices() {
        return invoices;
    }

    @Override
    public String toString() {
        return "HistoryData{" +
                "period='" + period + '\'' +
                ", start='" + start + '\'' +
                ", end='" + end + '\'' +
                ", invoices=" + invoices +
                '}';
    }
}

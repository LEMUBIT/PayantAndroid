package com.lemubit.lemuel.androidpayant.operations.invoices.networkResponse.model;


import java.util.List;

/**
 * @author lemuel
 */
public class HistoryData {
    private String period;
    private String start;
    private String end;
    private List<InvoiceData> invoices;

    public String getPeriod() {
        return period;
    }

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }

    public List<InvoiceData> getInvoices() {
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

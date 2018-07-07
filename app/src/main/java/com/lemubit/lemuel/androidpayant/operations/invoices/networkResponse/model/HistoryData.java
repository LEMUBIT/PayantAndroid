package com.lemubit.lemuel.androidpayant.operations.invoices.networkResponse.model;


import java.util.List;

/**
 * @author lemuel
 */
public class HistoryData {
    private String period;
    private String start;
    private String end;
    private List<InvoiceDataAndClient> invoices;

    public String getPeriod() {
        return period;
    }

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }

    public List<InvoiceDataAndClient> getInvoices() {
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

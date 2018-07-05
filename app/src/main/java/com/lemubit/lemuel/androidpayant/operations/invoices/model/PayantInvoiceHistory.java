package com.lemubit.lemuel.androidpayant.operations.invoices.model;

import com.lemubit.lemuel.androidpayant.annotation.PayantRequired;

/**
 * @author lemuel
 */
public class PayantInvoiceHistory {
    @PayantRequired
    private String period;
    private String start;
    private String end;

    public String getPeriod() {
        return period;
    }

    /**
     * @param period History period today, week, month, 30, 90, year or custom
     */
    public void setPeriod(String period) {
        this.period = period;
    }

    public String getStart() {
        return start;
    }

    /**
     * @param start Starting date DD/MM/YYYY
     */
    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    /**
     * @param end End date DD/MM/YYYY
     */
    public void setEnd(String end) {
        this.end = end;
    }
}

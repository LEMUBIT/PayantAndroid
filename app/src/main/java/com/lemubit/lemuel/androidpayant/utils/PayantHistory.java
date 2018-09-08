package com.lemubit.lemuel.androidpayant.utils;

import com.lemubit.lemuel.androidpayant.annotation.PayantRequired;

/**
 * @author lemuel
 */
public class PayantHistory {

    public static String TODAY = "today";
    public static String PAST_WEEK = "week";
    public static String PAST_MONTH = "month";
    public static String PAST_30_DAYS = "30";
    public static String PAST_90_DAYS = "90";
    public static String PAST_YEAR = "year";
    public static String CUSTOM = "custom";

    @PayantRequired
    private String period;

    private String start;

    private String end;

    /**
     * @param period History period today, week, month, 30, 90, year or custom
     */
    public PayantHistory(String period) {
        this.period = period;
    }

    /**
     * @param period History period today, week, month, 30, 90, year or custom
     * @param start  Starting date DD/MM/YYYY for custom
     * @param end    End date DD/MM/YYYY for custom
     */
    public PayantHistory(String period, String start, String end) {
        this.period = period;
        this.start = start;
        this.end = end;
    }

    public String getPeriod() {
        return period;
    }

    /**
     * Note: If you set the period to be custom, then you need to set the time period fo the start and end date
     *
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

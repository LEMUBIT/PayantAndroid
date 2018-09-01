package com.lemubit.lemuel.androidpayant.operations.payments.model;

import com.lemubit.lemuel.androidpayant.annotation.PayantRequired;

/**
 * @author lemuel
 */
public class PayantPayment {

    @PayantRequired
    private
    String reference_code;

    @PayantRequired
    private
    String date;

    @PayantRequired
    private
    String amount;

    @PayantRequired
    private
    String channel;

    public PayantPayment() {
    }

    /**
     * @param referenceCode Invoice reference code
     * @param date          Payment date (MM/DD/YYYY)
     * @param amount        Payment amount
     * @param channel       Payment channel (Cash, BankTransfer, POS or Cheque
     */
    public PayantPayment(String referenceCode, String date, String amount, String channel) {
        this.reference_code = referenceCode;
        this.date = date;
        this.amount = amount;
        this.channel = channel;
    }

    public String getreferenceCode() {
        return reference_code;
    }

    /**
     * @param referenceCode Invoice reference code
     */
    public void setreferenceCode(String referenceCode) {
        this.reference_code = referenceCode;
    }

    public String getDate() {
        return date;
    }

    /**
     * @param date Payment date (MM/DD/YYYY)
     */
    public void setDate(String date) {
        this.date = date;
    }

    public String getAmount() {
        return amount;
    }

    /**
     * @param amount Payment amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getChannel() {
        return channel;
    }

    /**
     * @param channel Payment channel (Cash, BankTransfer, POS or Cheque)
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }
}

package com.lemubit.lemuel.androidpayant.operations.wallets.model;

import com.lemubit.lemuel.androidpayant.annotation.PayantRequired;

import java.util.List;

/**
 * @author lemuel
 */
public class PayantWalletWithdrawBulk {

    @PayantRequired
    private List<Recipient> recipients;
    @PayantRequired
    private String passcode;

    public PayantWalletWithdrawBulk() {
    }

    public PayantWalletWithdrawBulk(List<Recipient> recipients, String passcode) {
        this.recipients = recipients;
        this.passcode = passcode;
    }

    public List<Recipient> getRecipients() {
        return recipients;
    }

    /**
     * @param recipients Recipients Data
     */
    public void setRecipients(List<Recipient> recipients) {
        this.recipients = recipients;
    }

    public String getPasscode() {
        return passcode;
    }

    /**
     * @param passcode Wallets's passcode
     */
    public void setPasscode(String passcode) {
        this.passcode = passcode;
    }
}

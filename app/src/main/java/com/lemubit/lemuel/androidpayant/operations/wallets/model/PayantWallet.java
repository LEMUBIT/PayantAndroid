package com.lemubit.lemuel.androidpayant.operations.wallets.model;

import com.lemubit.lemuel.androidpayant.annotation.PayantRequired;

/**
 * @author lemuel
 */
public class PayantWallet {
    @PayantRequired
    private String name;

    @PayantRequired
    private String passcode;

    public PayantWallet() {
    }

    /**
     * @param name     Wallets's name
     * @param passcode Wallets's passcode (min of 6 char)
     */
    public PayantWallet(String name, String passcode) {
        this.name = name;
        this.passcode = passcode;
    }

    public String getName() {
        return name;
    }

    /**
     * @param name Wallets's name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getPasscode() {
        return passcode;
    }

    /**
     * @param passcode Wallets's passcode (min of 6 char)
     */
    public void setPasscode(String passcode) {
        this.passcode = passcode;
    }
}

package com.lemubit.lemuel.androidpayant.operations.wallets.model;

import com.lemubit.lemuel.androidpayant.annotation.PayantRequired;

/**
 * @author lemuel
 */
public class PayantWalletWithdraw {
    @PayantRequired
    private String settlement_bank;

    @PayantRequired
    private String account_number;

    @PayantRequired
    private String amount;

    @PayantRequired
    private String passcode;



    /**
     * @param settlementBank Client's settlement bank
     * @param accountNumber Client's account number
     * @param amount Amount to send
     * @param passcode Wallets's passcode
     */
    public PayantWalletWithdraw(String settlementBank, String accountNumber, String amount, String passcode) {
        this.settlement_bank = settlementBank;
        this.account_number = accountNumber;
        this.amount = amount;
        this.passcode = passcode;
    }

    public PayantWalletWithdraw() {
    }

    public String getSettlementBank() {
        return settlement_bank;
    }

    /**
     * @param settlementBank Client's settlement bank
     */
    public void setSettlementBank(String settlementBank) {
        this.settlement_bank = settlementBank;
    }

    public String getAccountNumber() {
        return account_number;
    }

    /**
     * @param accountNumber Client's account number
     */
    public void setAccountNumber(String accountNumber) {
        this.account_number = accountNumber;
    }

    public String getAmount() {
        return amount;
    }

    /**
     * @param amount Amount to send in data format Double
     */
    public void setAmount(Double amount) {
        this.amount = String.valueOf(amount);
    }

    /**
     * @param amount Amount to send in data format String
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * @param amount Amount to send in data format Int
     */
    public void setAmount(int amount) {
        this.amount = String.valueOf(amount);
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

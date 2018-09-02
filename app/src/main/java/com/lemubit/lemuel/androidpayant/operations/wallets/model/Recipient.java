package com.lemubit.lemuel.androidpayant.operations.wallets.model;

import com.lemubit.lemuel.androidpayant.annotation.PayantRequired;

/**
 * @author lemuel
 */
public class Recipient {
    @PayantRequired
    private String settlement_bank;

    @PayantRequired
    private String account_number;

    @PayantRequired
    private String amount;

    public Recipient() {
    }

    /**
     * @param settlementBank Client's settlement bank
     * @param accountNumber  Client's account number
     * @param amount         Amount to send
     */
    public Recipient(String settlementBank, String accountNumber, String amount) {
        this.settlement_bank = settlementBank;
        this.account_number = accountNumber;
        this.amount = amount;
    }

    public String getSettlementBank() {
        return settlement_bank;
    }

    /**
     * @param settlementBank Client's settlement ban
     */
    public void setSettlementBank(String settlementBank) {
        this.settlement_bank = settlementBank;
    }

    public String getAccountNumber() {
        return account_number;
    }

    /**
     * @param accountNumber Client's account numbe
     */
    public void setAccountNumber(String accountNumber) {
        this.account_number = accountNumber;
    }

    public String getAmount() {
        return amount;
    }

    /**
     * @param amount Amount to send in data format Int
     */
    public void setAmount(int amount) {
        this.amount = String.valueOf(amount);
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
}

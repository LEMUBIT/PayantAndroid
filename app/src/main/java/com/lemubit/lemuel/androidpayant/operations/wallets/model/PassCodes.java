package com.lemubit.lemuel.androidpayant.operations.wallets.model;

/**
 * @author lemuel
 */
public class PassCodes {
    private String old_passcode;
    private String passcode;

    /**
     * @param oldPasscode Old Wallets's passcode
     * @param passcode    New Wallets's passcode (min of 6 char)
     */
    public PassCodes(String oldPasscode, String passcode) {
        this.old_passcode = oldPasscode;
        this.passcode = passcode;
    }

    public String getoldPasscode() {
        return old_passcode;
    }

    /**
     * @param oldPasscode Old Wallets's passcode
     */
    public void setoldPasscode(String oldPasscode) {
        this.old_passcode = oldPasscode;
    }

    public String getPasscode() {
        return passcode;
    }

    /**
     * @param passcode New Wallets's passcode (min of 6 char)
     */
    public void setPasscode(String passcode) {
        this.passcode = passcode;
    }
}

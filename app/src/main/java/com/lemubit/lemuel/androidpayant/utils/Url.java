package com.lemubit.lemuel.androidpayant.utils;

import com.lemubit.lemuel.androidpayant.Payant;

/**
 * @author lemuel
 */
public class Url {

    public static String getURL() {
        if (Payant.isLiveMode()) {
            return "https://api.payant.ng/";
        } else {
            return "https://api.demo.payant.ng/";
        }
    }
}

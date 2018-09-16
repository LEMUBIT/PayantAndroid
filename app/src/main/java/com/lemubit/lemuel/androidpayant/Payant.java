package com.lemubit.lemuel.androidpayant;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import com.lemubit.lemuel.androidpayant.exceptions.PayantNotInitializedException;
import com.lemubit.lemuel.androidpayant.exceptions.PayantPrivateKeyNotSetException;
import com.lemubit.lemuel.androidpayant.utils.Validate;

import org.jetbrains.annotations.Contract;

/**
 * @author lemuel
 */
public final class Payant {
    private static Context applicationContext;

    private static boolean payantInitialized = false;

    private static String PRIVATE_KEY;

    private static boolean privateKeySet = false;

    private static boolean LiveMode = false;


    /**
     * Initializes the Payant library, this only has to be done once. It is required to call
     * this method before interacting with any other of the Payant API's.
     *
     * @param applicationContext app Context
     * @param live               set to true when in live mode, set to false when using a demo account to test
     */
    public static void init(Context applicationContext, Boolean live) {
        LiveMode = live;

        if (payantInitialized) {
            Log.w(applicationContext.getString(R.string.payantInitializedWarningTitle), applicationContext.getString(R.string.payantInitializedWarningDescription));
            Log.w(applicationContext.getString(R.string.payantInitializedWarningTitle), "Live Mode Updated = " + String.valueOf(LiveMode));
        } else {
            Validate.valueNotNull(applicationContext, applicationContext.getString(R.string.applicationContext));

            Validate.internetPermissionAvailable(applicationContext);

            Payant.applicationContext = applicationContext;

            payantInitialized = true;

        }

    }


    /**
     * Returns true if Payant has been initialized
     */
    @Contract(pure = true)
    public static boolean isPayantInitialized() {
        return payantInitialized;
    }

    public static String getPrivateKey() throws PayantPrivateKeyNotSetException {
        if (!privateKeySet) {
            throw new PayantPrivateKeyNotSetException(applicationContext.getString(R.string.payantKeyNotSet));
        }

        return PRIVATE_KEY;
    }

    /**
     * Sets the private key
     *
     * @param privateKey
     */
    public static void setPrivateKey(String privateKey) throws PayantNotInitializedException {
        Validate.payantInitialized();
        PRIVATE_KEY = privateKey;
        privateKeySet = true;
    }

    public static Boolean isLiveMode() {
        return LiveMode;
    }


}

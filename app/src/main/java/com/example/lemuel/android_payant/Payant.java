package com.example.lemuel.android_payant;

import android.content.Context;
import android.text.TextUtils;

import com.example.lemuel.android_payant.exceptions.PayantNotInitializedException;
import com.example.lemuel.android_payant.utils.Validate;

import org.jetbrains.annotations.Contract;

import java.nio.charset.StandardCharsets;

/**
 * @author lemuel
 */
public final class Payant {
    public static Context applicationContext;


    private static boolean payantInitialized;


    private static String PRIVATE_KEY;

    private static boolean privateKeySet;

    /**
     * Initializes the Payant library, this only has to be done once. It is required to call
     * this method before interacting with any other of the Payant API's.
     *
     * @param applicationContext
     */
    public static synchronized void init(Context applicationContext) {

        Validate.valueNotNull(applicationContext, "applicationContext");

        Validate.internetPermissionAvailable(applicationContext);

        Payant.applicationContext = applicationContext;

        payantInitialized = true;
    }


    /**Returns true if Payant has been initialized
     *
     */
    @Contract(pure = true)
    public static boolean isPayantInitialized() {
        return payantInitialized;
    }

    /**
     * Sets the private key
     * @param privateKey
     */
    public static void setPrivateKey(String privateKey) throws PayantNotInitializedException {
        Validate.payantInitialized();
        PRIVATE_KEY = privateKey;
    }

    public static boolean isPrivateKeySet() {
        return privateKeySet;
    }
}

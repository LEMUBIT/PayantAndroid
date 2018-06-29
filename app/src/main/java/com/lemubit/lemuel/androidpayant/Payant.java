package com.lemubit.lemuel.androidpayant;

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


    /**
     * Initializes the Payant library, this only has to be done once. It is required to call
     * this method before interacting with any other of the Payant API's.
     *
     * @param applicationContext
     */
    public static void init(Context applicationContext) {


        if (payantInitialized) {
            Log.w("Payant Warning","Payant has already been initialized, you need to initialize just once!");
        } else {
            Validate.valueNotNull(applicationContext, "applicationContext");

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
            throw new PayantPrivateKeyNotSetException("Private key has not been set, please set private key after initializing the Payant SDK");
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


}

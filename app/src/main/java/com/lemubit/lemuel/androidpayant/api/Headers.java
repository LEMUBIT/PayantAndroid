package com.lemubit.lemuel.androidpayant.api;

import android.support.annotation.NonNull;

import com.lemubit.lemuel.androidpayant.Payant;

import org.jetbrains.annotations.Contract;

public class Headers {

    @NonNull
    @Contract(pure = true)
    public static String contentType() {
        return "application/json";
    }

    @NonNull
    public static String authorization() {
        return "Bearer " + Payant.getPrivateKey();
    }
}

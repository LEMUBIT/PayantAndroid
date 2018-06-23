package com.example.lemuel.android_payant.utils;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;

import com.example.lemuel.android_payant.Payant;
import com.example.lemuel.android_payant.annotation.PayantRequired;
import com.example.lemuel.android_payant.exceptions.PayantNotInitializedException;

import org.jetbrains.annotations.Contract;

import java.lang.reflect.Field;
import java.util.Objects;

/**
 * @author lemuel
 */
public class Validate {


    public static void payantInitialized() throws PayantNotInitializedException {
        if (!Payant.isPayantInitialized()) {
            throw new PayantNotInitializedException("Payant SDK has not been initialized. Use 'Payant.init()' to initialize.");
        }
    }

    /**
     * To check if internet permission has been granted in the Android Manifest
     *
     * @param context - Application context for current run
     */
    public static void internetPermissionAvailable(Context context) {
        valueNotNull(context, "context");
        PackageManager packageManager = context.getPackageManager();
        int hasPermission = packageManager.checkPermission(Manifest.permission.INTERNET, context.getPackageName());
        if (hasPermission ==
                PackageManager.PERMISSION_DENIED) {
            throw new IllegalStateException("It seems you do not want us to access the internet :( . " +
                    "Please add the intenet permission to your AndroidManifest.xml");
        }
    }


    /**
     * Check if a field in a Payant operations object is required
     * @param classRef
     * @param declaredField
     * @return True if Field is required
     * @throws NoSuchFieldException
     */
    @NonNull
    public static Boolean isRequired(Class<?> classRef, String declaredField ) throws NoSuchFieldException
    {
        Field field = null;
        try {
            field = classRef.getDeclaredField(declaredField);
        } catch (NoSuchFieldException e) {
            throw new NoSuchFieldException();
        }
        PayantRequired annotation = field.getAnnotation(PayantRequired.class);

        return Objects.equals(annotation.required(), PayantRequired.isRequired.Yes);

    }

    @Contract("null, _ -> fail")
    public static void valueNotNull(Object arg, String name) {
        if (arg == null) {
            throw new NullPointerException("Argument '" + name + "' cannot be null");
        }
    }


}

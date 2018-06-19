package com.example.lemuel.android_payant.utils;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;

public class Validate {
    public static class That {

        /**
         * To check if internet permission has been granted in the Android Manifest
         *
         * @param context - Application context for current run
         */
        public static void internetPermissionAvailable(Context context) {
            //todo -write test for method
            valueNotNull(context, "context");
            PackageManager packageManager = context.getPackageManager();
            int hasPermission = packageManager.checkPermission(Manifest.permission.INTERNET, context.getPackageName());
            if (hasPermission ==
                    PackageManager.PERMISSION_DENIED) {
                throw new IllegalStateException("It seems you do not want us to access the internet :( . " +
                        "Please add the intenet permission to your AndroidManifest.xml");
            }
        }


        public static void valueNotNull(Object arg, String name) {
            if (arg == null) {
                throw new NullPointerException("Argument '" + name + "' cannot be null");
            }
        }
    }

}

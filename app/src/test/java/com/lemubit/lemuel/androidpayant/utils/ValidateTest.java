package com.lemubit.lemuel.androidpayant.utils;

import android.Manifest;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;

import com.lemubit.lemuel.androidpayant.Payant;
import com.lemubit.lemuel.androidpayant.exceptions.PayantNotInitializedException;
import com.lemubit.lemuel.androidpayant.exceptions.PayantPrivateKeyNotSetException;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class ValidateTest {

    @Mock
    private
    Context mockContext;

    @Mock
    private
    PackageManager mockPackageManager;

    @Mock
    private Package mockPackage;


    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test(expected = NullPointerException.class)
    public void validateWhenNull() {
        Validate.valueNotNull(null, "context");
    }

    /*Payant is not initialized at this point so expected exception should be PayantNotInitializedException*/
    @Test(expected = PayantNotInitializedException.class)
    public void validateWhenPayantNotInitialized() {
        Validate.payantInitialized();
    }

    @Test(expected = PayantPrivateKeyNotSetException.class)
    public void checkPrivateKeySet() {
        when(mockPackageManager.checkPermission(Manifest.permission.INTERNET, mockPackage.getName()))
                .thenReturn(PackageManager.PERMISSION_GRANTED);

        when(mockContext.getPackageManager()).thenReturn(mockPackageManager);

        Payant.init(mockContext,false);
        assertEquals(Url.getURL(), "https://api.demo.payant.ng/");

        Payant.init(mockContext,true);
        assertEquals(Url.getURL(), "https://api.payant.ng/");

        Payant.getPrivateKey();
    }

    @Test(expected = IllegalStateException.class)
    public void checkNoInternetPermission() {
        when(mockPackageManager.checkPermission(Manifest.permission.INTERNET, mockPackage.getName()))
                .thenReturn(PackageManager.PERMISSION_DENIED);

        when(mockContext.getPackageManager()).thenReturn(mockPackageManager);

        Payant.init(mockContext,false);

    }


}

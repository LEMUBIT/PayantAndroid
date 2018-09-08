package com.lemubit.lemuel.androidpayant;

import android.Manifest;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;

import com.lemubit.lemuel.androidpayant.utils.Url;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class urlTest {
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

    @Test
    public void liveURl() {
        when(mockPackageManager.checkPermission(Manifest.permission.INTERNET, mockPackage.getName()))
                .thenReturn(PackageManager.PERMISSION_GRANTED);

        when(mockContext.getPackageManager()).thenReturn(mockPackageManager);

        Payant.init(mockContext,false);
        assertEquals(Url.getURL(), "https://api.demo.payant.ng/");

        Payant.init(mockContext,true);
        assertEquals(Url.getURL(), "https://api.payant.ng/");

    }
}

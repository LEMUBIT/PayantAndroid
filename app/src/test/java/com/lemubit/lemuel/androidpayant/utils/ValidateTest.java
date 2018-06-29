package com.lemubit.lemuel.androidpayant.utils;

import android.content.Context;

import com.lemubit.lemuel.androidpayant.Payant;
import com.lemubit.lemuel.androidpayant.exceptions.PayantNotInitializedException;
import com.lemubit.lemuel.androidpayant.exceptions.PayantPrivateKeyNotSetException;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class ValidateTest {

    @Mock
    Context application;

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
        Payant.getPrivateKey();
    }

    @Test
    public void attemptSetPrivateKey() {
        Payant.setPrivateKey("0000");
    }

}

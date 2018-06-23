package com.example.lemuel.android_payant.utils;

import android.content.Context;

import com.example.lemuel.android_payant.Payant;
import com.example.lemuel.android_payant.exceptions.PayantNotInitializedException;
import static org.junit.Assert.*;
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


    @Test
    public void validateWhenNonNull() {
        Validate.valueNotNull("testing", "context");
    }

    /*Payant is not initialized at this point so expected exception should be PayantNotInitializedException*/
    @Test(expected = PayantNotInitializedException.class)
    public void validateWhenPayantNotInitialized() {
        Validate.payantInitialized();
    }

    @Test
    public void checkPrivateKeySet()
    {
        Boolean keySet= Payant.isPrivateKeySet();
        assertEquals(false, keySet);
    }

    @Test(expected = PayantNotInitializedException.class)
    public void attemptSetPrivateKey()
    {
        Payant.setPrivateKey("0000");
    }

}

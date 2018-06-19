package com.example.lemuel.android_payant.utils;

import android.app.Application;
import android.content.Context;

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
        Validate.That.valueNotNull(null, "context");
    }

    @Test
    public void validateWhenNonNull() {
        Validate.That.valueNotNull("testing", "context");
    }
}

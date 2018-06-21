package com.example.lemuel.android_payant.annotation;

import com.example.lemuel.android_payant.operations.PayantClient;

import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.assertEquals;

public class PayantRequiredTest {

    @Test
    public void ClientFirstNameIsRequired()
    {
        Field field = null;
        try {
            field = PayantClient.class.getDeclaredField("first_name");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        PayantRequired annotation = field.getAnnotation(PayantRequired.class);

        assertEquals(PayantRequired.Required.Yes, annotation.required());
    }

    @Test
    public void CompanyNameIsNotRequired()
    {
        Field field = null;
        try {
            field = PayantClient.class.getDeclaredField("company_name");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        PayantRequired annotation = field.getAnnotation(PayantRequired.class);

        assertEquals(PayantRequired.Required.No, annotation.required());
    }

}

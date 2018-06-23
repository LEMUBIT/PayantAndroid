package com.example.lemuel.android_payant.annotation;

import com.example.lemuel.android_payant.operations.clients.PayantClient;
import com.example.lemuel.android_payant.utils.Validate;

import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.assertEquals;

public class PayantIsRequiredTest {

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

        assertEquals(PayantRequired.isRequired.Yes, annotation.required());
    }

    @Test
    public void CompanyNameIsNotRequired() throws NoSuchFieldException {
       Boolean required= Validate.isRequired(PayantClient.class,"company_name");
        assertEquals(false, required);
    }

    @Test
    public void FirstNameIsRequired() throws NoSuchFieldException {
        Boolean required= Validate.isRequired(PayantClient.class,"first_name");
        assertEquals(true, required);
    }

}

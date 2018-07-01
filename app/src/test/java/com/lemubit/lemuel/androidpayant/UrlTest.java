package com.lemubit.lemuel.androidpayant;

import com.lemubit.lemuel.androidpayant.utils.Url;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UrlTest {
    @Test
    public void UrlIntact() {
        assertEquals(Url.BASE_URL, "https://api.payant.ng/");
        assertEquals(Url.DEMO_BASE_URL, "https://api.demo.payant.ng/");
    }
}

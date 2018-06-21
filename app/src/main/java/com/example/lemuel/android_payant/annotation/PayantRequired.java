package com.example.lemuel.android_payant.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface PayantRequired {
    enum Required {Yes, No}
    Required required() default Required.No;
}

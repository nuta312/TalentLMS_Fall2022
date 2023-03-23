package com.talentLMS.API.utils;

import com.github.javafaker.Faker;

import java.util.Locale;

public class MockDataUtils {
    private final static Faker faker = new Faker(new Locale("EN"));

    private MockDataUtils() {

    }

    public static String generateName() {
        return faker.name().firstName();
    }

    public static String generateEmail() {
        return faker.internet().emailAddress();
    }

    public static String generatePassword() {
        return faker.internet().password(10, 20, true, true, true);
    }
}

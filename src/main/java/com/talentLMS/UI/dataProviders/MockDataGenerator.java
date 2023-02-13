package com.talentLMS.UI.dataProviders;

import com.github.javafaker.Faker;

import java.util.Random;

public class MockDataGenerator {

    Faker faker = new Faker();

    private static final String LOWERCASE_CHARS = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String SYMBOLS = "!@#$%^&*()_+-=[]{}|;':\",.<>/?\\";
    private static final String NUMBERS = "0123456789";

    public String generateMockFirstname() {
        return faker.name().firstName();
    }

    public String generateMockLastName() {
        return faker.name().lastName();
    }

    public String generateMockEmail() {
        return faker.internet().emailAddress();
    }

    public String generateMockUsername() {
        return faker.name().username();
    }
    public  String generateMockBioDescription(){return faker.lorem().paragraph();}
    public String generateMockAnimalName(){return  faker.animal().name();}

    public  String generatePassword(int length) {
        Random random = new Random();
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(4);
            switch (index) {
                case 0:
                    password.append(LOWERCASE_CHARS.charAt(random.nextInt(LOWERCASE_CHARS.length())));
                    break;
                case 1:
                    password.append(UPPERCASE_CHARS.charAt(random.nextInt(UPPERCASE_CHARS.length())));
                    break;
                case 2:
                    password.append(SYMBOLS.charAt(random.nextInt(SYMBOLS.length())));
                    break;
                case 3:
                    password.append(NUMBERS.charAt(random.nextInt(NUMBERS.length())));
                    break;
            }
        }
        return password.toString();
    }



}

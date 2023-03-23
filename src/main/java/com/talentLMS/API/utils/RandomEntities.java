package com.talentLMS.API.utils;

import com.talentLMS.API.pojo.User;

import static com.talentLMS.API.utils.MockDataUtils.*;

public class RandomEntities {
    private RandomEntities() {
        // utils class
    }

    public static User generateUser() {
        return User.builder()
                .firstName(generateName())
                .lastName(generateName())
                .login(generateName())
                .email(generateEmail())
                .password(generatePassword())
                .build();
    }

    public static void main(String[] args) {
        System.out.println(generateUser());
    }
}

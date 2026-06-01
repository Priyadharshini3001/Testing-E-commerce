package com.autoqa.utils;

import java.util.UUID;

public class TestDataUtil {

    // Generate Random Email
    public static String generateRandomEmail() {

        return "user"
                + UUID.randomUUID()
                .toString()
                .substring(0, 5)
                + "@gmail.com";
    }
}
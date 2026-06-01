package com.autoqa;

import com.autoqa.utils.ConfigReader;

public class Main {

    public static void main(String[] args) {

        System.out.println("AutoQA Pro Framework");

        System.out.println(
                "Browser : "
                        + ConfigReader.getProperty("browser"));

        System.out.println(
                "Base URL : "
                        + ConfigReader.getProperty("baseUrl"));

        System.out.println(
                "Timeout : "
                        + ConfigReader.getProperty("timeout"));
    }
}
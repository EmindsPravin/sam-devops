package com.example;

public class Calculator {
    private int unusedVariable = 42; // Code smell: unused variable

    public int add(int a, int b) {
        // Bug: potential null pointer dereference
        String result = null;
        if (a > 0) {
            result = "Positive";
        }
        System.out.println(result.toString()); // Will throw NullPointerException if a <= 0

        return a + b;
    }

    public int divide(int a, int b) {
        // Bug: division by zero not handled
        return a / b;
    }

    // Code smell: overly complex method
    public String complexMethod(int input) {
        String output = "";
        for (int i = 0; i < input; i++) {
            if (i % 2 == 0) {
                output += "Even";
            } else {
                output += "Odd";
            }
        }
        return output;
    }

    // Security hotspot: hardcoded sensitive data
    private String apiKey = "12345-ABCDE-SECRET";
}

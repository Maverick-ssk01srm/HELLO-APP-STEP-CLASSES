package org.example;

public class uc7 {

    public static void main(String[] args) {

        // Determine the name(s) or default value
        String names = (args.length == 0) ? "World" : String.join(", ", args);

        // Print greeting
        System.out.println("Hello, " + names + "!");
    }
}



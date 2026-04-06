package org.example;

public class uc6  {

    public static void main(String[] args) {

        // Check if no arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        }
        else {

            StringBuilder nameBuilder = new StringBuilder();

            // Enhanced for loop to append names
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Remove the trailing ", "
            String names = nameBuilder.substring(0, nameBuilder.length() - 2);

            // Print greeting
            System.out.println("Hello, " + names + "!");
        }
    }
}



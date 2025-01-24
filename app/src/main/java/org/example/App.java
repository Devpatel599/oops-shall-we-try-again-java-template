package org.example;

import java.util.Scanner;

public class App {
    public int getInput(String prompt, String errorMessage, int lowerBound, int upperBound) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.println(prompt);
            try {
                input = Integer.parseInt(scanner.nextLine());
                if (input >= lowerBound && input <= upperBound) {
                    isValid = true;
                } else {
                    System.out.println(errorMessage);
                }
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
            }
        }
        return input;
    }

    public static void main(String[] args) {
        App app = new App();
        int userValue = app.getInput("Please enter a value between 1 and 100:", 
                                     "Invalid input! Please enter a valid integer between 1 and 100.", 
                                     1, 100);
        System.out.println("The value chosen by the user is: " + userValue);
    }
}

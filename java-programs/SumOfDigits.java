// Sample Program 1 - Create a program to find the sum of all the digits of a number given by a user
//  using an array and display the sum.

import java.util.Scanner;

class SumOfDigits {

    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        // Take input for a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // Validate the user input number, if negative state invalid and exit 
        if (number < 0) {
            System.err.println("Invalid Number.");
            System.exit(0);
        }
        int count = 0;
        int temp = number;
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }
        System.out.println("count is : " + count);
        int[] digits = new int[count];
        for (int i = 0; i < count; i++) {
            digits[i] = number % 10;
            number = number / 10;
        }
        int digits_sum = 0;
        for (int i = 0; i < digits.length; i++) {
            digits_sum += digits[i];

        }

        System.out.println("Sum of Digits:" + digits_sum);

    }

}

// // Program to create a 2D array, display the elements and calculate the sum of 
// the elements of the array


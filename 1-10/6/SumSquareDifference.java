// Project Euler | Question 6

// The sum of the squares of the first ten natural numbers is,
// 1^2 + 2^2 + ... + 10^2 = 385

// The square of the sum of the first ten natural numbers is,
// (1 + 2 + ... + 10)^2 = 552 = 3025

// Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
// Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

import java.util.*;

public class SumSquareDifference {
    public static void main(String[] args) {
        Scanner cin = null;

        try {
            cin = new Scanner(System.in);
            System.out.println("Enter the largest number to find out the smallest positive number upto which all the numbers from 1 are a factor: ");
            int input;
            input = cin.nextInt();
            System.out.println("Number: " + input);
            
            int difference = getSquareSum(input) - getSumSquare(input);

            System.out.println("Smallest Multiple: " + difference);
        }finally {
            if (cin != null) {
                cin.close();
            }
        }
    }

    public static int getSumSquare(int limit) {
        int sum = 0;
        for(int i = 1; i <= limit; i++) {
            sum += i * i;
        }
        return sum;
    }

    public static int getSquareSum(int limit) {
        int sum = 0;
        for(int i = 0; i <= limit; i++) {
            sum += i;
        }
        return sum * sum;
    }
}

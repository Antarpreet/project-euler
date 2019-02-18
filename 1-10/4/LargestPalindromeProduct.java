// Project Euler | Question 4

// A palindromic number reads the same both ways. 
// The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
// Find the largest palindrome made from the product of two 3-digit numbers.

import java.util.*;

public class LargestPalindromeProduct {
    public static void main(String[] args) {
        Scanner cin = null;

        try {
            cin = new Scanner(System.in);
            System.out.println("Enter the number of digits that you want to find the largest palindrome of their product: ");
            int input;
            input = cin.nextInt();
            System.out.println("Number: " + input);
            
            int palindromeProduct = getLargestPalindromeProduct(input);

            System.out.println("Largest Product: " + palindromeProduct);
        }finally {
            if (cin != null) {
                cin.close();
            }
        }
    }

    public static int getLargestPalindromeProduct(int number) {
        int first = (int)Math.pow(10, number) - 1;
        int second = first;
        int product = 0;
        int largest = -1;
        int i = 0;

        for(; second >= 100; second--) {
            for(; first >= 100; first--) {
                product = first * second;
                String largestString = "" + product;
                for(i = 0; i < largestString.length()/2; i++) {
                    if(largestString.charAt(i) != largestString.charAt(largestString.length() - 1 - i)) {
                        break;
                    }
                }
                if(i == largestString.length()/2 && product > largest) {
                    largest = product;
                }
                i = 0;
            }
            first = (int)Math.pow(10, number) - 1;
        }

        return largest;
    }
}
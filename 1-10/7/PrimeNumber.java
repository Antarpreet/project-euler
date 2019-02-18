// Project Euler | Question 7

// By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
// What is the 10 001st prime number?

import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner cin = null;

        try {
            cin = new Scanner(System.in);
            System.out.println("Enter the index of the prime number: ");
            int input;
            input = cin.nextInt();
            System.out.println("Index: " + input);
            
            int prime = getPrime(input);

            System.out.println("Prime: " + prime);
        }finally {
            if (cin != null) {
                cin.close();
            }
        }
    }

    public static int getPrime(int index) {
        int prime = 2;
        int counter = 0;
        for(int i = 2; i > 0; i++) {
            Boolean flag = true;
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                   flag = false;
                }
            }
            if(flag) {
                prime = i;
                counter++;
                if(counter == index) {
                    break;
                }
            }
        }
        return prime;
    }
}
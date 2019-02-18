// Project Euler | Question 3

// The prime factors of 13195 are 5, 7, 13 and 29.
// What is the largest prime factor of the number 600851475143 ?

import java.util.*;
import java.math.BigInteger;

public class LargestPrimeFactor {
    public static void main(String[] args) {
        Scanner cin = null;

        try {
            cin = new Scanner(System.in);
            System.out.println("Enter the prime number of any length: ");
            String input;
            input = cin.nextLine();
            System.out.println("Number: " + input);
            
            String prime = getLargestPrime(input);

            System.out.println("Largest Factor: " + prime);
        }finally {
            if (cin != null) {
                cin.close();
            }
        }
    }

    public static String getLargestPrime(String input) {
        BigInteger number = new BigInteger(input);
        BigInteger prime = new BigInteger("2");

        System.out.print("Prime factors:");
        // (;prime < (input/2) + 1); prime++)
        for(;prime.compareTo(number) < 0; prime = prime.add(new BigInteger("1"))) {
            while(number.divideAndRemainder(prime)[1].compareTo(new BigInteger("0")) == 0) {
                System.out.print(" " + prime.toString());
                number = number.divide(prime);
            }
        }
        if(number.compareTo(new BigInteger("1")) != 0) {
            System.out.println(" " + number.toString());
        }
        number = number.compareTo(prime.subtract(new BigInteger("1"))) < 0 ? prime.subtract(new BigInteger("1")) : number;
        System.out.println("");
        return number.toString();
    }
}
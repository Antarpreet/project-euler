// Project Euler | Question 10

// The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
// Find the sum of all the primes below two million.

import java.util.*;
import java.time.*;

public class SummationPrimesWithoutThread {
    public static void main(String[] args) {
        Scanner cin = null;

        try {
            cin = new Scanner(System.in);
            System.out.println("Enter the number below which you want the sum of prime numbers: ");
            int input;
            input = cin.nextInt();
            System.out.println("Index: " + input);
            
            Instant start = Instant.now();
            long sum = getSum(input);
            Instant end = Instant.now();
            Duration timeElapsed = Duration.between(start, end);
            
            System.out.println("Sum: " + sum);
            System.out.println("Time taken: " + timeElapsed.toMillis()/1000 + " seconds");
        }finally {
            if (cin != null) {
                cin.close();
            }
        }
    }

    public static long getSum(int index) {
        long sum = 0;
        int counter = 0;
        for(int i = 2; i > 0; i++) {
            Boolean flag = true;
            for(int j = 2; j <= Math.sqrt(i); j++) {
                if(i % j == 0) {
                   flag = false;
                }
            }
            if(flag) {
                sum += i;
                counter++;
                if(counter > index || i > index) {
                    sum -= i;
                    break;
                }
                // System.out.println(counter + " " + i + " " + sum);
            }
        }
        return sum;
    }
}
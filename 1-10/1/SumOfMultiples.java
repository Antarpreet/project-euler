// Project Euler | Question 1

// If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
// The sum of these multiples is 23.
// Find the sum of all the multiples of 3 or 5 below 1000.

import java.util.*;
import java.time.*;

public class SumOfMultiples {
    public static void main(String[] args) {
        Scanner cin = null;

        try {
            cin = new Scanner(System.in);
            System.out.println("Enter the number below which you want the sum of 3 or 5 multiples: ");
            int input;
            input = cin.nextInt();
            System.out.println("Limit: " + input);
            
            Instant start = Instant.now();
            int sum = getSum(input);
            Instant end = Instant.now();
            Duration timeElapsed = Duration.between(start, end);

            Instant startAlt = Instant.now();
            int sumAlt = getSumAlt(input);
            Instant endAlt = Instant.now();
            Duration timeElapsedAlt = Duration.between(startAlt, endAlt);
            
            System.out.println("Time taken: "+ timeElapsed.toMillis() +" milliseconds");
            System.out.println("Time taken (Alternate Method): "+ timeElapsedAlt.toMillis() +" milliseconds");
            System.out.println("Sum: " + sum);
            System.out.println("Sum (Alternate method): " + sumAlt);
        }finally {
            if (cin != null) {
                cin.close();
            }
        }
    }

    public static int getSum(int limit) {
        int sum = 0;

        for(int i = 3; i < limit; i+=3) {
            sum += i;
        }
        for(int i = 5; i < limit; i+=5) {
            if(i%(3*5) != 0) {
                sum += i;
            }
        }

        return sum;
    }

    public static int getSumAlt(int limit) {
        int sum = 0;
        for(int i = 0; i < limit; i++) {
            if(i%3 == 0 || i%5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

}
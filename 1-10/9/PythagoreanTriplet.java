// Project Euler | Question 9

// A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

// a^2 + b^2 = c^2
// For example, 32 + 42 = 9 + 16 = 25 = 52.

// There exists exactly one Pythagorean triplet for which a + b + c = 1000.
// Find the product abc.

import java.util.*;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner cin = null;

        try {
            cin = new Scanner(System.in);
            System.out.println("Enter the sum of the triplets: ");
            int input;
            input = cin.nextInt();
            System.out.println("Sum: " + input);
            
            int[] triplets = getTriplet(input);
            int product = triplets[0] * triplets[1] * triplets[2];
            
            System.out.println("Triplets: " + triplets[0] + " " + triplets[1] + " " + triplets[2]);
            System.out.println("Product: " + product);
        }finally {
            if (cin != null) {
                cin.close();
            }
        }
    }

    public static int[] getTriplet(int sum) {
        int[] arr = new int[3];

        for(int i = 1; i < sum; i++) {
            for(int j = 1; j < sum; j++) {
                if(Math.sqrt(i*i + j*j) % 1 == 0 && i < j){
                    if((int)Math.sqrt(i*i + j*j) + i + j == sum) {
                        arr[0] = i;
                        arr[1] = j;
                        arr[2] = sum - (i + j);
                    }
                }
            }
        }

        return arr;
    }
}
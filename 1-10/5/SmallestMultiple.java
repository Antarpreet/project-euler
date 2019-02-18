// Project Euler | Question 5

// 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
// What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

import java.util.*;

import javax.swing.plaf.synth.SynthSliderUI;

public class SmallestMultiple {
    public static void main(String[] args) {
        Scanner cin = null;

        try {
            cin = new Scanner(System.in);
            System.out.println("Enter the largest number to find out the smallest positive number upto which all the numbers from 1 are a factor: ");
            int input;
            input = cin.nextInt();
            System.out.println("Number: " + input);
            
            int smallest = getSmallestMultiple(input);

            System.out.println("Smallest Multiple: " + smallest);
        }finally {
            if (cin != null) {
                cin.close();
            }
        }
    }

    public static int getSmallestMultiple(int limit) {
        int number = 1;
        int i = 1;
        for(; i > 0; i++) {
            number = 1;
            for(int j = 1; j <= limit; j++) {
                if(i % j == 0) {
                    number++;
                }
            }
            if(number > limit) {
                break;
            }
        }
        return i;
    }
}
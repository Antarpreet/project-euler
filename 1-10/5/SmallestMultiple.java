import java.util.*;

import javax.swing.plaf.synth.SynthSliderUI;

public class SmallestMultiple {
    public static void main(String[] args) {
        Scanner cin = null;

        try {
            cin = new Scanner(System.in);
            System.out.println("Enter the number of digits that you want to find the largest palindrome of their product: ");
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
import java.util.*;

public class SumOfEvenFibonacci {
    public static void main(String[] args) {
        Scanner cin = null;

        try {
            cin = new Scanner(System.in);
            System.out.println("Enter the number of fibonacci numbers you want to add: ");
            int input;
            input = cin.nextInt();
            System.out.println("Limit: " + input);
            
            int sum = getSum(input);

            System.out.println("Sum: " + sum);
        }finally {
            if (cin != null) {
                cin.close();
            }
        }
    }

    public static int getSum(int limit) {
        int prev = 0;
        int next = 1;
        int temp = 0;
        int sum = prev;

        System.out.print("Elements:");
        for(int i = 0; i < limit; i++) {
            temp = next;
            next += prev;
            prev = temp;
            if(next%2 == 0) {
                sum += next;
            }
            System.out.print(" " + next);
        }
        System.out.println("");
        
        return sum;
    }
}
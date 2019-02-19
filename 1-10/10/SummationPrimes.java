// Project Euler | Question 10

// The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
// Find the sum of all the primes below two million.

import java.util.*;

public class SummationPrimes {
    public static void main(String[] args) {
        Scanner cin = null;

        try {
            cin = new Scanner(System.in);
            System.out.println("Enter the number below which you want the sum of prime numbers: ");
            int input;
            input = cin.nextInt();
            System.out.println("Index: " + input);
            
            RunnableThread R1 = new RunnableThread( "Thread-1", 2, input/16);
            RunnableThread R2 = new RunnableThread( "Thread-2", input/16, (2*input)/16);
            RunnableThread R3 = new RunnableThread( "Thread-3", (2*input/16), (3*input)/16);
            RunnableThread R4 = new RunnableThread( "Thread-4", (3*input/16), (4*input)/16);
            RunnableThread R5 = new RunnableThread( "Thread-5", (4*input/16), (5*input)/16);
            RunnableThread R6 = new RunnableThread( "Thread-6", (5*input/16), (6*input)/16);
            RunnableThread R7 = new RunnableThread( "Thread-7", (6*input/16), (7*input)/16);
            RunnableThread R8 = new RunnableThread( "Thread-8", (7*input/16), (8*input)/16);
            RunnableThread R9 = new RunnableThread( "Thread-9", (8*input/16), (9*input)/16);
            RunnableThread R10 = new RunnableThread( "Thread-10", (9*input/16), (10*input)/16);
            RunnableThread R11 = new RunnableThread( "Thread-11", (10*input/16), (11*input)/16);
            RunnableThread R12 = new RunnableThread( "Thread-12", (11*input/16), (12*input)/16);
            RunnableThread R13 = new RunnableThread( "Thread-13", (12*input/16), (13*input)/16);
            RunnableThread R14 = new RunnableThread( "Thread-14", (13*input/16), (14*input)/16);
            RunnableThread R15 = new RunnableThread( "Thread-15", (14*input/16), (15*input)/16);
            RunnableThread R16 = new RunnableThread( "Thread-16", (15*input/16), input);
            R1.start();
            R2.start();
            R3.start();
            R4.start();
            R5.start();
            R6.start();
            R7.start();
            R8.start();
            R9.start();
            R10.start();
            R11.start();
            R12.start();
            R13.start();
            R14.start();
            R15.start();
            R16.start();

            // System.out.println("Sum: " + sum);
        } finally {
            if (cin != null) {
                cin.close();
            }
        }
    }
}
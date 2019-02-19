import java.time.*;

public class RunnableThread implements Runnable {
    private Thread t;
    private String threadName;
    private int start;
    private int end;
    
    RunnableThread(String name, int start, int end) {
        this.threadName = name;
        this.start = start;
        this.end = end;
        // System.out.println("Creating " +  threadName );
    }

    public void run() {
        long sum = 0;
        // System.out.println("Running " +  threadName );
        try {
            Instant start = Instant.now();
            sum = getSum();
            Instant end = Instant.now();
            Duration timeElapsed = Duration.between(start, end);
            
            System.out.println(threadName + " sum: " + sum);
            System.out.println("Time taken (" + threadName + "): " + timeElapsed.toMillis()/1000 +" seconds");
        }
        finally {}
        // System.out.println("Thread " +  threadName + " exiting.");

     }
     
     public void start () {
        // System.out.println("Starting " +  threadName );
        if (t == null) {
           t = new Thread (this, threadName);
           t.start ();
        }
     }

     public long getSum() {
        long sum = 0;
        int counter = 0;
        for(int i = start; i > 0; i++) {
            Boolean flag = true;
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                   flag = false;
                }
            }
            if(flag) {
                sum += i;
                counter++;
                if(counter > this.end || i > this.end) {
                    sum -= i;
                    break;
                }
                // System.out.println(counter + " " + i + " " + sum);
            }
        }
        return sum;
    }
}
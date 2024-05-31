package CallableImpl;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Main {

    public static void main(String[] args) {
        Callable<Integer> t1 = new MyThread();
        FutureTask futureTask = new FutureTask(t1);

        Thread thread = new Thread(
                
        );
        thread.start();
        System.out.println("is cancelled "+futureTask.isCancelled());
        System.out.println("cancelled: "+futureTask.cancel(true));


    }
}

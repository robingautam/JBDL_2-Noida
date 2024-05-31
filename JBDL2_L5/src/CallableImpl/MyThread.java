package CallableImpl;

import java.util.concurrent.Callable;

public class MyThread implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("Inside callabale thread");
        return 1;
    }
}

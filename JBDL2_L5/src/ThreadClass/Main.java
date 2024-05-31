package ThreadClass;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        MyThread t1 =new MyThread();
        t1.start();
        t1.join();


        try{
            Thread.sleep(1); // used to sleep the current thread
        }
        catch (Exception ex){

        }

    }
}

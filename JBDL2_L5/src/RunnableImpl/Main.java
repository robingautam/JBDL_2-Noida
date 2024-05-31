package RunnableImpl;


public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        Thread thread = new Thread(t1);
        thread.start();

    }
}

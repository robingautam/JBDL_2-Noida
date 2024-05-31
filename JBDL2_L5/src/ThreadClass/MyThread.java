package ThreadClass;

public class MyThread extends Thread {


    @Override
    public void run(){
        try {
            this.join();
        }
        catch (Exception ex){

        }
        for (int i=0;i<=10;i++){
            System.out.println(i+" "+Thread.currentThread().getName());
       }
    }
}

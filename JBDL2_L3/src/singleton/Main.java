package singleton;

public class Main {

    public static void main(String[] args) {
       // property file reading, db connection
        singletonExample obj1 = singletonExample.getInstance();

        System.out.println(obj1);

        singletonExample obj2 = singletonExample.getInstance();

        System.out.println(obj2);

    }
}

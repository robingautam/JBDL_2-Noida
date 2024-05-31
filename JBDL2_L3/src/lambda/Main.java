package lambda;

public class Main {


    public static void main(String[] args) {
       A obj = a ->
           System.out.println("Inside M method "+a);
       obj.m(2);



    }
}

interface A {
    void m(int a);
}



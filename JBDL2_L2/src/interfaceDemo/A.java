package interfaceDemo;

public interface A {

    public default void m(){
        System.out.println("Inside interface A");
    }

    public static int add(int a, int b){
        return a+b;
    }
}

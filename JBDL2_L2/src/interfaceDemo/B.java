package interfaceDemo;

public interface B {

    public default void m(){
        System.out.println("Inside interface B");
    }

}

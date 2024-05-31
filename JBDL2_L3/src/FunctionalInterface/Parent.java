package FunctionalInterface;

@FunctionalInterface
public interface Parent {
    void m();
    default void m2(){
        System.out.println("Hi");
    }
}

@FunctionalInterface
interface Child extends Parent{
   void m();
}

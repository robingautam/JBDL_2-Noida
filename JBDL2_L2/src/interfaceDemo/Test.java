package interfaceDemo;

public class Test implements A{

    public static void main(String[] args) {
        A a = new Test();
        A.add(2,3);
        a.m();
    }

}

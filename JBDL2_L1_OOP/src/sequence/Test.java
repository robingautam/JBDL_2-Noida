package sequence;

public class Test {
    Test(){
        System.out.println("Inside Constructor");
    }


    static {
        System.out.println("Inside static block");
    }
    {
        System.out.println("Inside non static block");
    }

    public void doSomeCalculation(calc c){
        c.add(2,3);
    }

    public void doSomeCalculation(int a, calc c){
        c.add(2,3);
    }

    public static void main(String[] args) {

        Test t1 = new Test();
        t1.doSomeCalculation(new actauLimpl2());
        try {
            System.exit(0);
        }
        catch (Exception ec){

        }
        finally {

        }
    }
}
class Person{
    int age;
    String name;

    Person(int age, String name){
        this(age);
        this.age = age;
        this.name = name;
    }

    Person(int a){
        this.age = a;
    }
    @Override
    public String toString(){
        return "age: "+age+" : Name: "+name;
    }

    @Override
    public boolean equals(Object o){
        Person p = (Person) o;
       return this == p;
    }
}

abstract class calc{
    public abstract void add(int a, int b);
}
class actauLimpl extends calc{

    @Override
    public void add(int a, int b) {
        System.out.println(a+b);
    }
}

class actauLimpl2 extends calc{

    @Override
    public void add(int a, int b) {
        System.out.println(a+b+2);
    }
}

class Parent {
    public void print(){
        System.out.println("inside parent class");
    }
}
class Child extends Parent {
    public void print(){
        System.out.println("Inside child class");
    }
}
package org.gfg.spring.ci;

public class Employee {

    String name;
    String email;
    int num1;
    int  num2;
    int sum;

    Employee(){

    }
    /*Employee(String name, String email){
        this.name = name;
        this.email = email;
        System.out.println("inside the constructor");
    }*/

    Employee(int num1, int num2 ){
        this.num1 = num1;
        this.num2 = num2;
        System.out.println("value is num1="+num1+" and value of num2="+num2);
        System.out.println("inside the constructor of int and int");
    }

    Employee(double num1, double num2 ){
        this.num1 = (int)num1;
        this.num2 = (int)num2;
        System.out.println("inside the constructor of double and double");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

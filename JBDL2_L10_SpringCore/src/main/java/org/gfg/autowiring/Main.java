package org.gfg.autowiring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("org/gfg/autowiring/config.xml");

        Student st = context.getBean("student", Student.class);

        System.out.println(st);

    }
}

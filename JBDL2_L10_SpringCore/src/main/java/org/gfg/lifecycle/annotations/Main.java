package org.gfg.lifecycle.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("org/gfg/lifecycle/annotations/config.xml");
        context.registerShutdownHook();
        Student st = context.getBean("student", Student.class);

        System.out.println(st);

    }
}

package org.gfg.spring.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Employee e  = applicationContext.getBean("employee", Employee.class);
        System.out.println(e);
    }
}

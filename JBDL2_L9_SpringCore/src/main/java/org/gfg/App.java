package org.gfg;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
      //  Student st = (Student) applicationContext.getBean("st");
        //System.out.println(st);

        Child child = applicationContext.getBean("sop", Child.class);
        System.out.println(child);
    }
}

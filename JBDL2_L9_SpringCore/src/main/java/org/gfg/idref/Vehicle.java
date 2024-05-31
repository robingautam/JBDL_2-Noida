package org.gfg.idref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Vehicle {
    String name;

    Engine engine;

    String engineBeanId;
    public void runVehicle(){
        System.out.println("Going to start the vehicle");
        ApplicationContext context = new ClassPathXmlApplicationContext("org/gfg/idref/config.xml");

         engine = context.getBean(engineBeanId, Engine.class);

        System.out.println("Running the "+name+" With Engine "+engine.getName()+" and Power "+engine.getPower());

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getEngineBeanId() {
        return engineBeanId;
    }

    public void setEngineBeanId(String engineBeanId) {
        this.engineBeanId = engineBeanId;
    }
}

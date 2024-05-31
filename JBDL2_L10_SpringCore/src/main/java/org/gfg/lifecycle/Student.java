package org.gfg.lifecycle;

public class Student {
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @java.lang.Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void initStudent(){
        System.out.println("Initializing the student properties");
    }

    public void destroyStudent(){
        System.out.println("Writing up the cleanup code");
    }
}

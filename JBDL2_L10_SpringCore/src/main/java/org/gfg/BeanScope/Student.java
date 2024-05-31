package org.gfg.BeanScope;

import org.springframework.context.annotation.Scope;

import java.util.List;
import java.util.Map;
import java.util.Set;


public class Student {
    int id;
    String name;

    List<String> list;
    Set<String> subjects;

    Map<String,Integer> marks;
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

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<String> subjects) {
        this.subjects = subjects;
    }

    public Map<String, Integer> getMarks() {
        return marks;
    }

    public void setMarks(Map<String, Integer> marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", list=" + list +
                ", subjects=" + subjects +
                ", marks=" + marks +
                '}';
    }
}

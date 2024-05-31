package org.gfg;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
    int id;
    String name;
    String email;

    List<String> list;

    Set<String> subject;

    Map<String,Integer> map;

    Address address;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        System.out.println("Setting the value of Id: "+id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Setting the value of Name: "+name);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        System.out.println("Setting the value of email: "+email);
    }


    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<String> getSubject() {
        return subject;
    }

    public void setSubject(Set<String> subject) {
        this.subject = subject;
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", list=" + list +
                ", subject=" + subject +
                ", map=" + map +
                ", address=" + address +
                '}';
    }
}

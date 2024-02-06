package com.demo.java;

public class Student {
    //Has a rs
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
// null
class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAddress(new Address());
        System.out.println(student.getAddress().getName());
    }
}

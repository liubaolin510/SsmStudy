package com.liubaolin.ioc;

public class Student extends Person {

    public int height;

    public Student(String name,int height){
        this.name = name;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Student{" + "height=" + height+",name="+name +'}';
    }
}

package com.javase.io.bean;

import java.io.Serial;
import java.io.Serializable;

public class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = -5400608108918084529L;
    //public  static  final long serialVersionUID=1L;

    private int no;
    private  String name;
    private  String address;
    public Student() {
    }
    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }
    public int getNo() {
        return no;
    }
    public String getName() {
        return name;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}

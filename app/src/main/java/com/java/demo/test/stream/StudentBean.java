package com.java.demo.test.stream;

import java.io.Serializable;

public class StudentBean implements Serializable {
    private String name;
    private int number;
    private int grades;

    public StudentBean(String name, int number, int grades) {
        this.name = name;
        this.number = number;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getGrades() {
        return grades;
    }

    public void setGrades(int grades) {
        this.grades = grades;
    }

    public String toString() {
        return "Student name : " + name + ", number : " + number + ", grades : " + grades;
    }
}

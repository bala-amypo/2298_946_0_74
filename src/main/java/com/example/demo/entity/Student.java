package com.example.demo.entity;

// import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// import jakarta.persistence.Table;

@Entity //for using with db we must include this
// @Table(name="StudentDetails")// used to rename the database name
public class Student {
    @Id // used to indicate the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)// beacuse we must insert at the next id of the last present id in the DB
    private int id;
    private String name;
    // @Column(name = "Reg.No") // used to rename column names
    
    private int age;
    private float cgpa;
    
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
    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public float getCgpa() {
        return cgpa;
    }
    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }
    public Student(int id, String name, int age, float cgpa) {
        this.id = id;
        this.name = name;
       
        this.age = age;
        this.cgpa = cgpa;
    }
    public Student() {
    }
    
}
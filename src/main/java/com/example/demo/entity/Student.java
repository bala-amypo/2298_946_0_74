package com.example.demo.entity;
import jakarta.persistence.*;

@Entity
public class Student{
    @Id
    private int id;
    private String name;
    private String email;
    private float cgpa;

    public int getID(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    
}

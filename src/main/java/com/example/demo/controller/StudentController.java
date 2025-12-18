package com.example.demo.controller;
import java.util.*;
import org.springframework.beans.factory.anotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
@RestController
public class StudentController{
    @Autowired
    StudentService ser;

    @PostMapping(".adddata")
    public Student createData(@RequestBody Student ser){
        return ser.createData(stu);
    }

}

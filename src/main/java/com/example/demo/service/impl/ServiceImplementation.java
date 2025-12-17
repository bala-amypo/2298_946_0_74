package com.example.demo.service.implementation;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

@Service
public class ServiceImplementation implements StudentService {
    @Autowired
    StudentRepository repo;

    @Override

    public Student createData(Student stu) {
        return repo.save(stu);
    }

    public List<Student> fetchRecord() {
        return repo.findAll();
    }

    public Optional<Student> fetchDataById(int id) {
        return repo.findById(id);
    }
}
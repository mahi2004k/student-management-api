package com.mahesh.studentapi.service;

import com.mahesh.studentapi.entity.Student;

import java.util.List;

public interface StudentService {

    Student save(Student student);

    List<Student> getAll();

    Student getById(Long id);

    Student update(Long id, Student student);

    void delete(Long id);
}
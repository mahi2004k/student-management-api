package com.mahesh.studentapi.controller;

import com.mahesh.studentapi.entity.Student;
import com.mahesh.studentapi.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    //1 Create Student

    @PostMapping
    public ResponseEntity<Student> create(@RequestBody Student student) {
        return new ResponseEntity<>(service.save(student), HttpStatus.CREATED);
    }

    //2 Get All

    @GetMapping
    public ResponseEntity<List<Student>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    //3 Get By Id

    @GetMapping("/{id}")
    public ResponseEntity<Student> getById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getById(id));
    }

    //4 Update

    @PutMapping("/{id}")
    public ResponseEntity<Student> update(@PathVariable Long id,
                                          @RequestBody Student student) {

        return ResponseEntity.ok(service.update(id, student));
    }

    //5 Delete

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {

        service.delete(id);

        return ResponseEntity.noContent().build();
    }

}
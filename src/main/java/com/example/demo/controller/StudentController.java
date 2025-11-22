package com.example.demo.controller;

import com.example.demo.model.enitiy.Student;
import com.example.demo.repository.StudentRepo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentRepo repo;

    public StudentController(StudentRepo repo) {
        this.repo = repo;
    }

    //save student
    @PostMapping("/add")
    public Student addStudent(Student student) {
        return repo.save(student);
    }
    //get all students
    public List<Student> getAllStudents() {
        return repo.findAll();
    }
    //get student by id
    public Student getStudentById(Long id) {
        return repo.findById(id).orElse(null);
    }

    //delete student by id
    public void deleteStudentById(Long id) {
        repo.deleteById(id);
    }

}

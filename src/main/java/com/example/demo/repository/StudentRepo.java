package com.example.demo.repository;

import com.example.demo.model.enitiy.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Long> {
}

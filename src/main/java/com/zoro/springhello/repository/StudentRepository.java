package com.zoro.springhello.repository;
import org.springframework.data.jpa.repository.JpaRepository;


import com.zoro.springhello.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {}

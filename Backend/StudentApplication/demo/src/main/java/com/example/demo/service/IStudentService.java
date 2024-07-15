package com.example.demo.service;

import com.example.demo.modal.Student;

import java.util.List;

public interface IStudentService {

    Student addStudent(Student student);

    List<Student> getAllStudents();

    Student updateStudent(Student student, Long id);

    Student getStudentById(Long id);

    void deleteStudent(Long id);
}

package edu.miu.cs.cs425.eregistrar.service;

import edu.miu.cs.cs425.eregistrar.model.entity.Student;

import java.util.List;

/**
 * Author: Yoseph masresha
 * Date: 9/17/2023
 */
public interface StudentService {

    Student addStudent(Student student);

    Student updateStudent(Student student);

    void delete(Long id);

    List<Student> getAllStudent();

    Student getStudentById(Long id);
}

package com.genie.JPADemo.controller;

import com.genie.JPADemo.entity.Student;
import com.genie.JPADemo.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/std")
public class StudentController {


    @Autowired
    StudentRepo studentRepo;


    @GetMapping("/save")
    public void saveStudent(){
        Student student = new Student();
        student.setId(1);
        student.setName("Akash");
        student.setCourse("JAVA");
        student.setAddress("Delhi");



        studentRepo.save(student);

    }
}

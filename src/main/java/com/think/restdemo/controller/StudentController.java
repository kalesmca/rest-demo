package com.think.restdemo.controller;

import com.think.restdemo.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")

public class StudentController {
    @GetMapping
    public Student getStudent() {
        return new Student("Kaleeswaran",21, "Male", "Rajapalayam");
    }
}

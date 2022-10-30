package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.service.StudentService;
import com.example.demo.data.StudentInfo;

@RestController
public class Controller {

    @Autowired
    StudentService studentService;

    @GetMapping
    public String hello (){
        return "Hello";
    }

    @GetMapping("/students")
    public ResponseEntity<StudentService> getStudents (){
        return new ResponseEntity<>(new StudentService(), HttpStatus.OK);
    }

    @PostMapping ("addinfo")
    public String addData (@RequestBody StudentInfo myDataClass){
        studentService.addData(myDataClass);
        return "";
    }
    
}
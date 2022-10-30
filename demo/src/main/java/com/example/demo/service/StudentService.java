package com.example.demo.service;

import com.example.demo.data.StudentInfo;
import com.example.demo.service.FileService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private List<StudentInfo> myData  = new ArrayList<>();
    
    public void addData (StudentInfo myDataClass){
        myData.add(myDataClass);
    }
     
    public List<StudentInfo> getData() {
        return new ArrayList<>(myData);
    }

    
}

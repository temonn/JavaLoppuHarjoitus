package com.example.demo.service;

import java.io.*;
import java.util.Scanner;

import org.springframework.stereotype.Service;

@Service
public class FileService {

    public void writeFile() throws IOException{
    File file = new File("Student-Info.txt");
    FileWriter fw = new FileWriter(file, true);
    fw.write("" + System.lineSeparator());
    
    fw.close();
    }
    
    public void readFile() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("Student-Info.txt"));
        while (sc.hasNext()){
            String row = sc.nextLine();
            System.out.println(row);
        }
        sc.close();
    }
}

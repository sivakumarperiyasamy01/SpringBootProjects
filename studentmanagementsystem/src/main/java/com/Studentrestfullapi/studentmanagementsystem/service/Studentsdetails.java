package com.Studentrestfullapi.studentmanagementsystem.service;

import com.Studentrestfullapi.studentmanagementsystem.dto.Studentdata;
import com.Studentrestfullapi.studentmanagementsystem.entity.Student;
import com.Studentrestfullapi.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Studentsdetails {

    @Autowired
    StudentRepository studentRepository;

    public String poststudentinfo(Studentdata student){

        // dto mapping - convert plain object to entity object then entity object passed to database
        Student sdata= new Student();
        sdata.setName(student.getName());
        sdata.setAge(student.getAge());
        sdata.setEmail(student.getEmail());
        studentRepository.save(sdata);
        // passing entity object
        return "record successfully";
    }


    public String deleterecord(int id){
        studentRepository.deleteById(id);
        return "record deleted successfully";

    }


    public List<Student> findallrecords(){
        return  studentRepository.findAll();
    }


    public Optional<Student> findsinlglerecord(int id){
        Optional<Student> s = studentRepository.findById(id);
        return s;
    }

    public String updaterecords(Studentdata student, int id){
        Student s1=studentRepository.findById(id).get();

        s1.setName(student.getName());
        s1.setAge(student.getAge());
        s1.setEmail(student.getEmail());
        studentRepository.save(s1);

        return "updated sucessfully";
    }


}

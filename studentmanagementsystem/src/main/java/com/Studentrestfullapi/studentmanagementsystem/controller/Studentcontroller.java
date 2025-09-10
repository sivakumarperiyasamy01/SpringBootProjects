package com.Studentrestfullapi.studentmanagementsystem.controller;

import com.Studentrestfullapi.studentmanagementsystem.dto.Studentdata;
import com.Studentrestfullapi.studentmanagementsystem.entity.Student;
import com.Studentrestfullapi.studentmanagementsystem.repository.StudentRepository;
import com.Studentrestfullapi.studentmanagementsystem.service.Studentsdetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/studentinfo")
public class Studentcontroller {

    @Autowired
   Studentsdetails stu;  // service layer object

    // create a record in database- create

    @PostMapping
    // jackson liberaroy convert json to object by using entity class
    public String studentrecord(@RequestBody Studentdata student) {
        return stu.poststudentinfo(student); // called method in service layer
    }

    // delete a record based on criteria - delete
    @DeleteMapping("/{id}")
    public String deletestudentinfo(@PathVariable int id) {
       return  stu.deleterecord(id);
    }

    // to get all record - read
    @GetMapping
    public List<Student> getallstudentinfo() {
       return stu. findallrecords();
    }

    // to get single record based on criteria - read
    @GetMapping("/{id}")
    public Optional<Student> getallstudentinfo(@PathVariable int id) {
        return stu.findsinlglerecord(id);
    }

    // to update particular  data
    @PutMapping("/{id}")
    public String updatestudentrecord(@RequestBody Studentdata student, @PathVariable int id){
        return stu.updaterecords(student,id);
    }


}
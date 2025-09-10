package com.Studentrestfullapi.studentmanagementsystem.repository;

import com.Studentrestfullapi.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface StudentRepository extends JpaRepository<Student,Integer > {

}

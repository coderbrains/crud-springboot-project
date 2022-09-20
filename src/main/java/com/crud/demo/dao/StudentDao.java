package com.crud.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.demo.model.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {

}

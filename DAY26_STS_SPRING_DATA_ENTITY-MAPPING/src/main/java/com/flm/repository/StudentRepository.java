package com.flm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flm.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}

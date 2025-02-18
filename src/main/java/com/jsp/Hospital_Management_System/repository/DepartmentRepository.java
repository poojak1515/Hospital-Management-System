package com.jsp.Hospital_Management_System.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.Hospital_Management_System.Entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}

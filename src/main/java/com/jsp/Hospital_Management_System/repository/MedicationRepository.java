package com.jsp.Hospital_Management_System.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.Hospital_Management_System.Entity.Medications;

@Repository
public interface MedicationRepository extends JpaRepository<Medications, Integer>{

}

package com.jsp.Hospital_Management_System.Dao;

import org.springframework.stereotype.Service;

import com.jsp.Hospital_Management_System.Entity.Department;
import com.jsp.Hospital_Management_System.Entity.Doctor;
import com.jsp.Hospital_Management_System.repository.DepartmentRepository;
import com.jsp.Hospital_Management_System.repository.DoctorRepository;

@Service
public class HospitalDao {
	
	private DoctorRepository doctorsRepo;
	private DepartmentRepository departmentRepo;
	
	
	//Constructor Dependency Injection
	public HospitalDao(DoctorRepository doctorsRepo, DepartmentRepository departmentRepo) {
		this.doctorsRepo= doctorsRepo;
		this.departmentRepo=departmentRepo;
	}


	
	public Department saveDepartment(Department department) {
		return departmentRepo.save(department);
	}



	public Doctor saveDoctor(Doctor doctor) {
		return doctorsRepo.save(doctor);
	}

}

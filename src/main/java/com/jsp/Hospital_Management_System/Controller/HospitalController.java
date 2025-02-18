package com.jsp.Hospital_Management_System.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.Hospital_Management_System.Dao.HospitalDao;
import com.jsp.Hospital_Management_System.Entity.Department;
import com.jsp.Hospital_Management_System.Entity.Doctor;

@RestController
@RequestMapping("/HospitalController")
public class HospitalController {
	
	private HospitalDao hospitalDao;
	
	//Constructor Dependency Injection 
	public HospitalController(HospitalDao hospitalDao) {
		this.hospitalDao=hospitalDao;
	}
	
	@PostMapping("/saveDepartmentWithoutDoctor")
	public Department saveDepartment(@RequestBody Department department) {
		return hospitalDao.saveDepartment(department);
	}
	
	@PostMapping("/saveDoctorWithoutDepartment")
	public Doctor saveDepartment(@RequestBody Doctor doctor) {
		return hospitalDao.saveDoctor(doctor);
	}
}

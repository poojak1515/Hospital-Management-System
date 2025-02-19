package com.jsp.Hospital_Management_System.Dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jsp.Hospital_Management_System.Entity.Department;
import com.jsp.Hospital_Management_System.repository.DepartmentRepository;

@Service
public class DepartmentDao {
	
	private DepartmentRepository departmentRepo;
	
	//Constructor Dependency Injection
	public DepartmentDao(DepartmentRepository departmentRepo) {
		this.departmentRepo=departmentRepo;
	}

	public Department saveDepartment(Department department) {
		return departmentRepo.save(department);
	}

	public Department updateDepartment(Integer id, Department dept) {
		Department department=departmentRepo.findById(id).orElseThrow(()->new RuntimeException("department not found"));
		
		department.setDepartmentName(dept.getDepartmentName());
		department.setDescription(dept.getDescription());
		departmentRepo.save(department);
		return department;
	}

	public List<Department> getAllDepartment() {
		
		return departmentRepo.findAll();
	}

	
	public String deleteDepartmentById(Integer id) {
		Department existingDepartment=departmentRepo.findById(id).orElseThrow(()->new RuntimeException("department not found"));
		int id1=existingDepartment.getDepartmentId();
		if(existingDepartment!=null) 
			departmentRepo.delete(existingDepartment);
		return "department with id "+id1+" is successfully deleted";	
		
	}

	public Department getDepartmentName(String name) {
		

		return departmentRepo.findByName(name);
	}


}

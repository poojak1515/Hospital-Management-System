package com.jsp.Hospital_Management_System.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.Hospital_Management_System.Dao.DepartmentDao;
import com.jsp.Hospital_Management_System.Entity.Department;

@RestController
@RequestMapping("/DepartmentController")
public class DepartmentController {
	
	private DepartmentDao departmentDao;
	
	//Constructor Dependency Injection 
	public DepartmentController(DepartmentDao departmentDao) {
		this.departmentDao=departmentDao;
	}
	
	//to save only department when  a new department is created
	@PostMapping("/saveDepartment")
	public Department saveDepartment(@RequestBody Department department) {
		return departmentDao.saveDepartment(department);
	}
	
	//to update records of department
			@PutMapping("/updateDepartment/{id}")
			public Department updateDepartment(@PathVariable("id")Integer id, @RequestBody Department dept) {
				return departmentDao.updateDepartment(id, dept) ;
				
			}
			
			//display all departments
			@GetMapping("/getDepartmentList")
			public List<Department> getAllDepartment(){
				return departmentDao.getAllDepartment();		}
			
			
			//display departments by their name
			@GetMapping("/getDepartmentByName/{name}")
			public Department getDepartmentByName(@PathVariable("name")String name){
				return departmentDao.getDepartmentName(name);		}
					
			//delete department by id
			@DeleteMapping("/deleteDepartmentById/{id}")
			public String deleteDepartment(@PathVariable("id") Integer id) {
				return departmentDao.deleteDepartmentById(id);
			}
	
	
	
}

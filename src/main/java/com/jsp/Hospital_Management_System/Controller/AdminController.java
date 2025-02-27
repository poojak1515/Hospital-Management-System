package com.jsp.Hospital_Management_System.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.Hospital_Management_System.Dao.AdminDao;


@RestController
@RequestMapping("/adminController")
public class AdminController {
private AdminDao adminDao;
	
	//Constructor Dependency Injection 
	public AdminController(AdminDao adminDao) {
		this.adminDao=adminDao;
	}
	
	@GetMapping("/verifyAdmin/{email}/{password}")
	public boolean getAdminDetail(@PathVariable("email") String email,@PathVariable("password")String password) {
		
		
		return adminDao.verifyAdminData(email, password);
		
	}
	

}

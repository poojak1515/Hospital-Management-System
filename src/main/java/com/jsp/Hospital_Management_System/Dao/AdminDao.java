package com.jsp.Hospital_Management_System.Dao;

import org.springframework.stereotype.Service;

import com.jsp.Hospital_Management_System.Entity.Admin;
import com.jsp.Hospital_Management_System.repository.AdminRepository;

@Service
public class AdminDao {
	private AdminRepository adminRepo;
	
	public AdminDao(AdminRepository adminRepo) {
		this.adminRepo=adminRepo;
	}

	public boolean verifyAdminData(String email, String pswd) {
		Admin admin=adminRepo.findByEmail(email, pswd);
		
		if(admin.getEmail().equalsIgnoreCase(email)&&admin.getPassword().equals(pswd))
			return true;
		else
		return false;
	}

}

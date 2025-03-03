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

import com.jsp.Hospital_Management_System.Dao.DoctorDao;
import com.jsp.Hospital_Management_System.Entity.Doctor;

@RestController
@RequestMapping("/doctorController")
public class DoctorController {
	
	private DoctorDao doctorDao;
	
	public DoctorController(DoctorDao doctorDao) {
		this.doctorDao=doctorDao;
	}
	
	//to save only doctor details without assigning him/her to department
		@PostMapping("/saveDoctor")
		public Doctor saveDepartment(@RequestBody Doctor doctor) {
			return doctorDao.saveDoctor(doctor);
		}
		
		//to update records of doctor
		@PutMapping("/updateDoctor/{id}")
		public Doctor updateDoctor(@PathVariable("id")Integer id, @RequestBody Doctor doctor) {
			return doctorDao.updateDoctor(id, doctor) ;
			
		}
		
		//display all doctors
		@GetMapping("/getAllDoctors")
		public List<Doctor> getAllDoctors(){
			return doctorDao.getAllDoctors();		}
				
		//delete doctors by id
		@DeleteMapping("/deleteDoctorById/{id}")
		public String deleteDoctor(@PathVariable("id") Integer id) {
			return doctorDao.deleteDoctorById(id);
		}
		
		@PostMapping("/verifyDoctor/{id}/{password}")
		public boolean verifyDoctor(@PathVariable("id")Integer id,@PathVariable("password") String password) {
			return doctorDao.verifyPatient(id, password);
			
		}
}

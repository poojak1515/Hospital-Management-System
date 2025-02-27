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

import com.jsp.Hospital_Management_System.Dao.PatientsDao;
import com.jsp.Hospital_Management_System.Entity.Patient;

@RestController
@RequestMapping("/patientsController")
public class PatientsController {
	
	private PatientsDao patientDao;
	
	public PatientsController(PatientsDao patientsDao) {
		this.patientDao=patientsDao;
	}
	
	@PostMapping("/savePatient")
	public Patient savePatient(@RequestBody Patient patient) {
		return patientDao.savePatient(patient);
	}
	
	@PutMapping("/updatePatient/{id}")
	public Patient updatePatient(@PathVariable("id") Integer id, @RequestBody Patient updatedPatient) {
		return patientDao.UpdatePatient(id, updatedPatient);
		
	}
	
	@DeleteMapping("/deletePatient/{id}")
	public String deletePatient(@PathVariable("id") Integer id)
	{
		return patientDao.deletePatient(id);

	}
	
	@GetMapping("/displayPatients")
	public List<Patient> getAllPatient(){
		return patientDao.getAllPatient();
		
	}
	
	@GetMapping("/verifyPatient/{id}/{password}")
	public boolean verifyPatient(@PathVariable("id")Integer id,@PathVariable("password") String password) {
		return patientDao.verifyPatient(id, password);
		
	}
	

}

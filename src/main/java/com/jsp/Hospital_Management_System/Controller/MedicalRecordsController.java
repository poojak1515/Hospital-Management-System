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

import com.jsp.Hospital_Management_System.Dao.MedicalRecordsDao;
import com.jsp.Hospital_Management_System.Entity.MedicalRecords;

@RestController
@RequestMapping("/MedicalRecordsController")
public class MedicalRecordsController {
	
	private MedicalRecordsDao medicalRecordsDao;
	
	public MedicalRecordsController(MedicalRecordsDao medicalRecordsDao) {
		this.medicalRecordsDao=medicalRecordsDao;
	}
	
	
	@PostMapping("/saveMedicalRecords")
	public MedicalRecords saveMedicalRecords(@RequestBody MedicalRecords medicalRecords) {
		return medicalRecordsDao.saveMedicalRecords(medicalRecords);
		
	}
	
	@PutMapping("/updateMedicalRecords/{id}")
	public MedicalRecords updateMedicalRecordsById(@PathVariable("id")Integer id, @RequestBody MedicalRecords medicalRecords) {
		return medicalRecordsDao.updateMedicalRecordsById(id,medicalRecords) ;
	}
	
	@DeleteMapping("/deleteMedicalRecords/{id}")
	public String deleteMedicalRecordsById(@PathVariable("id") Integer id) {
		return medicalRecordsDao.deleteMedicalRecordsById(id) ;
	}
	
	@GetMapping("/getAllMedicalRecords")
	public List<MedicalRecords> getAllMedicalRecords(){
		return medicalRecordsDao.getAllMedicalRecords();
	}
	
	
	

}

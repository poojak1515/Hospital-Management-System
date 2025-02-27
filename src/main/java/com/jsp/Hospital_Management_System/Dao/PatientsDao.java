package com.jsp.Hospital_Management_System.Dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jsp.Hospital_Management_System.Entity.Patient;
import com.jsp.Hospital_Management_System.repository.PatientsRepository;

@Service
public class PatientsDao {
	
	private PatientsRepository patientsRepo;
	
	public PatientsDao(PatientsRepository patientsRepo) {
		this.patientsRepo=patientsRepo;
	}

	public Patient savePatient(Patient patient) {

		return patientsRepo.save(patient);
	}

	public Patient UpdatePatient(int id, Patient patient) {
		Patient existingpatient=patientsRepo.findById(id).orElseThrow(()->new RuntimeException("Patient not found"));
		
		existingpatient.setFirstName(patient.getFirstName());
		existingpatient.setLastName(patient.getLastName());
		existingpatient.setAddress(patient.getAddress());
		existingpatient.setContactNumber(patient.getContactNumber());
		existingpatient.setEmail(patient.getEmail());
		existingpatient.setDateOfBirth(patient.getDateOfBirth());
		existingpatient.setEmergencyContact(patient.getEmergencyContact());
		existingpatient.setBloodType(patient.getBloodType());
		existingpatient.setGender(patient.getGender());
		
		return patientsRepo.save(existingpatient);
		
	}

	public String deletePatient(int id) {
		Patient existingpatient=patientsRepo.findById(id).orElseThrow(()->new RuntimeException("patient not found"));
		int id1=existingpatient.getPatientId();
		if(existingpatient!=null)
			patientsRepo.delete(existingpatient);
		return "patient with id "+id1+" is successfully deleted";
	}

	public List<Patient> getAllPatient() {
		return patientsRepo.findAll();
		
	}

	public boolean verifyPatient(int id, String password) {
		Patient existingpatient=patientsRepo.findById(id).orElseThrow(()->new RuntimeException("patient not found"));
		
		if(existingpatient.getPatientId()==id && existingpatient.getPassword().equals(password))
			return true;
		else
			return false;
				
				
	}

}

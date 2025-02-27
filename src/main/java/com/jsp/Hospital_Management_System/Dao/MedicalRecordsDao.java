package com.jsp.Hospital_Management_System.Dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jsp.Hospital_Management_System.Entity.MedicalRecords;
import com.jsp.Hospital_Management_System.repository.MedicalRecordsRepository;

@Service
public class MedicalRecordsDao {
	private MedicalRecordsRepository medicalRecordsRepo;
	
	public MedicalRecordsDao(MedicalRecordsRepository medicalRecordsRepo) {
		this.medicalRecordsRepo= medicalRecordsRepo;
	}

	public MedicalRecords saveMedicalRecords(MedicalRecords medicalRecords) {

		return medicalRecordsRepo.save(medicalRecords);
	}

	public MedicalRecords updateMedicalRecordsById(int id, MedicalRecords medicalRecords) {
		MedicalRecords existingMedicalRecord=medicalRecordsRepo.findById(id).orElseThrow(()->new RuntimeException("No medical record found"));
		
		existingMedicalRecord.setDate(medicalRecords.getDate());
		existingMedicalRecord.setNotes(medicalRecords.getNotes());
		existingMedicalRecord.setDiagnosis(medicalRecords.getDiagnosis());
		existingMedicalRecord.setTreatment(medicalRecords.getTreatment());
		existingMedicalRecord.setNotes(medicalRecords.getNotes());
		
		medicalRecordsRepo.save(existingMedicalRecord);
		
		return existingMedicalRecord;
	}

	public String deleteMedicalRecordsById(int id) {
		MedicalRecords existingMedicalRecord=medicalRecordsRepo.findById(id).orElseThrow(()->new RuntimeException("No medical record found"));
		int id1=existingMedicalRecord.getRecordId();
		if(existingMedicalRecord!=null)
			medicalRecordsRepo.delete(existingMedicalRecord);
		return "medical record with id "+id1+" is successfully deleted";
	}

	public List<MedicalRecords> getAllMedicalRecords() {
		return medicalRecordsRepo.findAll();
	}

}

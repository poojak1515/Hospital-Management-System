package com.jsp.Hospital_Management_System.Dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jsp.Hospital_Management_System.Entity.Doctor;
import com.jsp.Hospital_Management_System.repository.DoctorRepository;

@Service
public class DoctorDao {
	private DoctorRepository doctorsRepo;

	public DoctorDao(DoctorRepository doctorsRepo) {
		this.doctorsRepo = doctorsRepo;
	}

	public Doctor saveDoctor(Doctor doctor) {
		return doctorsRepo.save(doctor);
	}

	public Doctor updateDoctor(Integer id, Doctor doctor) {
		Doctor existingDoctor = doctorsRepo.findById(id).orElseThrow(() -> new RuntimeException("Doctor not found"));
		existingDoctor.setContactNumber(doctor.getContactNumber());
		existingDoctor.setDepartment_id(doctor.getDepartment_id());
		existingDoctor.setEmail(doctor.getEmail());
		existingDoctor.setFirstName(doctor.getFirstName());
		existingDoctor.setLastName(doctor.getLastName());
		existingDoctor.setSpecialization(doctor.getSpecialization());

		return doctorsRepo.save(existingDoctor);
	}

	public List<Doctor> getAllDoctors() {

		return doctorsRepo.findAll();
	}

	public String deleteDoctorById(int id) {

		Doctor existingDoctor = doctorsRepo.findById(null).orElseThrow(() -> new RuntimeException("Doctor Not Found"));
		int id1 = existingDoctor.getDoctorId();
		if (existingDoctor != null) {
			doctorsRepo.delete(existingDoctor);

		}
		return "doctor with id " + id1 + " is successfully deleted";

		/*
		 * Optional<Doctor> doctor=doctorsRepo.findById(id); Doctor
		 * doctor1=doctor.get(); if(doctor.isPresent()) { int id1=doctor1.getDoctorId();
		 * doctorsRepo.deleteById(id1); return
		 * "doctor with id "+id1+" is removed from database"; }else return
		 * "doctor not found";
		 */
	}

	public boolean verifyPatient(int id, String password) {
		Doctor existingdoctor = doctorsRepo.findById(id).orElseThrow(() -> new RuntimeException("doctor not found"));

		if (existingdoctor.getDoctorId() == id && existingdoctor.getPassword().equals(password))
			return true;
		else
			return false;
	}

}

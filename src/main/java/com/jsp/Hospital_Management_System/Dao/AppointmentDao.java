package com.jsp.Hospital_Management_System.Dao;

import org.springframework.stereotype.Service;

import com.jsp.Hospital_Management_System.Entity.Appointment;
import com.jsp.Hospital_Management_System.repository.AppointmentRepository;

@Service
public class AppointmentDao {
	
	private AppointmentRepository appointmentRepo;
	
	public AppointmentDao(AppointmentRepository appointmentRepo) {
		this.appointmentRepo=appointmentRepo;
	}

	public Appointment saveAppointment(Appointment appointment) {
		return appointmentRepo.save(appointment);
	}

	public String deleteAppointment(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}

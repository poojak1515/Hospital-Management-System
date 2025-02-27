package com.jsp.Hospital_Management_System.Dao;

import java.util.List;

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

	public String deleteAppointment(int id) {
		Appointment appointment=appointmentRepo.findById(id).orElseThrow(()->new RuntimeException("Appointment Not Found"));
		int id1=appointment.getAppointmentId();
		if(appointment!=null) 
			appointmentRepo.delete(appointment);
		return "appointment with id "+id1+" is successfully deleted";
	}
	

	public Appointment updateAppointment(int id, Appointment appointment) {
		Appointment existingAppointment=appointmentRepo.findById(id).orElseThrow(()->new RuntimeException("Appointment Not Found"));
		existingAppointment.setDateTime(appointment.getDateTime());
		existingAppointment.setDoctor(appointment.getDoctor());
		existingAppointment.setPurpose(appointment.getPurpose());
		existingAppointment.setStatus(appointment.getStatus());
		
		appointmentRepo.save(existingAppointment);
		return existingAppointment;
	}

	public List<Appointment> getAllAppointment() {
		return appointmentRepo.findAll();	
	}
	

	
}

package com.jsp.Hospital_Management_System.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.Hospital_Management_System.Dao.AppointmentDao;
import com.jsp.Hospital_Management_System.Entity.Appointment;


@RestController
@RequestMapping("/appointmentController")
public class AppointmentController {
	
	private AppointmentDao appointmentDao;
	
	public AppointmentController(AppointmentDao appointmentDao) {
		this.appointmentDao=appointmentDao;
	}
	
	@PostMapping("/saveAppointment")
	public Appointment saveAppointment(@RequestBody Appointment appointment) {
		return appointmentDao.saveAppointment(appointment);
	}
	

}

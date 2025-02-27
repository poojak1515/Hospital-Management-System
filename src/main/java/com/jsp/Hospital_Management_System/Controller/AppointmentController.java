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
	
	@DeleteMapping("/deleteAppointmentById/{id}")
	public String deleteAppointment(@PathVariable("id")Integer id) {
		return appointmentDao.deleteAppointment(id);
	}
	
	@PutMapping("/updateAppointmentById/{id}")
	public Appointment updateAppointment(@PathVariable("id")Integer id, @RequestBody Appointment appointment) {
		return appointmentDao.updateAppointment(id, appointment);
	}
	
	@GetMapping("/getAllAppointment")
		public List<Appointment> getAllAppointment(){
			return appointmentDao.getAllAppointment();
		}
	}
	



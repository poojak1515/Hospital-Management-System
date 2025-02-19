package com.jsp.Hospital_Management_System.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppointmentStatusMaster {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int statusId;
	
	@Column(nullable = false)
	private String status;
	
	private String details; 

}

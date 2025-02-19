package com.jsp.Hospital_Management_System.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Department {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int departmentId;

	    @Column(nullable = false, unique = true)
	    private String departmentName;
	    
	    private String description;

	     
		
}

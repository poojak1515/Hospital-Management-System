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
public class Medications {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int medicationId;

	@Column(nullable = false, unique = true)
	private String name;

	private String description;

	@Column(nullable = false)
	private String manufacturer;

	@Column(nullable = false)
	private Double price;

}

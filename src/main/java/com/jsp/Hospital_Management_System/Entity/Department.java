package com.jsp.Hospital_Management_System.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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

	   /* @OneToOne
	    @JoinColumn(name = "HeadDoctorID")
	    private Doctor headDoctor;*/
	    
	    private int headDoctor;

	   	@OneToMany(mappedBy = "department", cascade=CascadeType.ALL)
	    private List<Doctor> doctors;

		public Department(int departmentId, String departmentName, String description, List<Doctor> doctors) {
			super();
			this.departmentId = departmentId;
			this.departmentName = departmentName;
			this.description = description;
			this.doctors = doctors;
		}

		public Department(int departmentId, String departmentName, String description) {
			super();
			this.departmentId = departmentId;
			this.departmentName = departmentName;
			this.description = description;
		}

		
}

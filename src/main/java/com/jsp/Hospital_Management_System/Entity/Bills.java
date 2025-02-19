package com.jsp.Hospital_Management_System.Entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bills {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int billId;

    @ManyToOne
    @JoinColumn(name = "PatientID", nullable = false)
    private Patient patient;

    @Column(name = "Date", nullable = false)
    private LocalDate date;

    @Column(nullable = false)
    private Double totalAmount;

    @Column(nullable = false)
    private String status;

  

}

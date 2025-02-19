package com.jsp.Hospital_Management_System.Entity;

import java.time.LocalDate;

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
public class Appointment {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int appointmentId;

    @Column( nullable = false)
    private int patient;

    @Column(nullable = false)
    private int doctor;

    @Column(nullable = false)
    private LocalDate dateTime;

    @Column(nullable = false)
    private int status;//master table

    @Column(nullable = false)
    private String purpose;

}

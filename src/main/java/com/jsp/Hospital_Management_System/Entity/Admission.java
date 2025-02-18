package com.jsp.Hospital_Management_System.Entity;

import java.sql.Date;
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
public class Admission {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int admissionId;

    @ManyToOne
    @JoinColumn(name = "PatientID", nullable = false)
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "RoomID", nullable = false)
    private Rooms room;

    @Column(nullable = false)
    private LocalDate admissionDate;

    private Date dischargeDate;

    @Column(nullable = false)
    private String reason;
}

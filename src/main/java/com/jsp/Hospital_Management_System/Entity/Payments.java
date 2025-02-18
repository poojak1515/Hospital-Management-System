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
public class Payments {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int paymentId;

	@ManyToOne
	@JoinColumn(name = "BillID", nullable = false)
	private Bills bill;

	@Column(nullable = false)
	private Double amount;

	@Column(nullable = false)
	private LocalDate paymentDate;

	@Column(nullable = false)
	private String paymentMethod;

}

package com.jsp.Hospital_Management_System.Entity;



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
public class BillDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int billDetailId;

	@ManyToOne
	@JoinColumn(name = "BillID", nullable = false)
	private Bills bill;

	@ManyToOne
	@JoinColumn(name = "ServiceID", nullable = false)
	private Services service;

	@Column(nullable = false)
	private Integer quantity;

	@Column(nullable = false)
	private Double totalPrice;

}

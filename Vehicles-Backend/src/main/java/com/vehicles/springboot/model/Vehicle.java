package com.vehicles.springboot.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.ManyToOne;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "vehicle")

public class Vehicle {
	@Id
	
	private long id;
	
	@Column(name = "vehicle_id")
	private String vehicleId;

	@Column(name = "reg_no")
	private String regNo;
	
	@Column(name="status")
	private String status;

	@ManyToOne(cascade=CascadeType.ALL)
	
		private User user;
	
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus() {
		return status;
	}

	
}

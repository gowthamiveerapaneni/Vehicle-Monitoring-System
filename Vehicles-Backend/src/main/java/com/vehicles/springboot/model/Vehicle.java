package com.vehicles.springboot.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vehicles")

public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "vehicle_id")
	private String vehicleId;

	@Column(name = "reg_no")
	private String regNo;
	
	@Column(name = "customer_name")
	private String customerName;
	
	@Column(name = "address")
	private String Address;
	
	@Column(name= "status")
	private String Status;
	
	
	public Vehicle() {
		
	}
	
	
	public Vehicle(String vehicleId, String regNo, String customerName, String address, String status) {
		super();
		this.vehicleId = vehicleId;
		this.regNo = regNo;
		this.customerName = customerName;
		Address = address;
		Status = status;
	}
 
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	
}

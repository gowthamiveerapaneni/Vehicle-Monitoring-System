package com.vehicles.springboot.model;

import java.util.Set;



import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="user")

public class User {
	
	@Id
	private long id;
	
	@Column(name = "customer_name")
	private String customerName;
	
	@Column(name = "address")
	private String Address;
	
	@OneToMany
	private Set<Vehicle> vehicle;
	
}
	
	
	
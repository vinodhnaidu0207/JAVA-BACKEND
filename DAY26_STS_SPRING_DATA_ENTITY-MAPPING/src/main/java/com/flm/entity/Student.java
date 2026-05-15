package com.flm.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String mobile;
	
	public Student(String name, String mobile) {
		this.name = name;
		this.mobile = mobile;
	}
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "student_id")
	List<Address> address = new ArrayList<>();
	
	public void addAdresses(Address addres) {
		address.add(addres);
	}
}

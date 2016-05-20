package com.sample.entity;

import javax.persistence.*;

import org.springframework.core.style.ToStringCreator;

@Entity
@Table(name = "DEPARTMENT")
public class Department {
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "ADDRESS")
	private String address;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return new ToStringCreator(this).append("id=" + id).append("name=" + name).append("address=" + address).toString();
	}

	
}

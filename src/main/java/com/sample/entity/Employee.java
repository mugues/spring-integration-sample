package com.sample.entity;

import javax.persistence.*;

import org.springframework.core.style.ToStringCreator;

/**
 * @author Massimo Ugues
 *
 */
@Entity
@Table(name = "EMPLOYEE")
public class Employee {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "SURNAME")
	private String surname;
	
	@Column(name = "STATE")
	private String state = "CREATED";
	
	@ManyToOne()
	private Department department;
	
	@Column(name = "DEPARTMENT_ID", insertable=false, updatable=false)
	private Long departmentId;
	
	public Employee() {
		super();
	}
	public Employee(String name) {
		this.name = name;
	}
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
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {

		return new ToStringCreator(this).append("id=" + id).append("name=" + name).append("surname=" + surname).append("departmentId=" + departmentId).append("department=" + department).toString();
	}


}

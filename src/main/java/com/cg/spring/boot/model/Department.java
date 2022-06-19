package com.cg.spring.boot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "department_table")
public class Department {

	@Id
	@GeneratedValue
	@Column(name = "did")
	private int did;

	@Column(name = "department_name")
	private String departmentName;

	@Column(name = "city")
	private String city;

	public Department() {
		super();
	}

	public Department(String departmentName, String city) {
		super();
		this.departmentName = departmentName;
		this.city = city;
	}

	public Department(int did, String departmentName, String city) {
		super();
		this.did = did;
		this.departmentName = departmentName;
		this.city = city;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Department [did=" + did + ", departmentName=" + departmentName + ", city=" + city + "]";
	}

}

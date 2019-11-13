package com.capgemini.springrest.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

//@XmlRootElement(name = "emp-info")
//@XmlAccessorType(XmlAccessType.FIELD)
@JsonRootName("employeeInfo")
@JsonPropertyOrder({"employeeId","name"})
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name = "employee_info")
public class EmployeeInfoBean {

	@JsonProperty("employeeId")
//	@XmlElement(name = "emp-id")
	@Id
	@Column
	private int emp_id;
	
	@JsonProperty("name")
//	@XmlElement(name = "emp-name")
	@Column
	private String emp_name;
	
//	@XmlElement
	@Column
	private int age;
	
//	@XmlElement
	@Column
	private double salary;
	
//	@XmlElement
	@Column
	private String designation;
	
//	@XmlElement
	@Column
	private char gender;
	
//	@XmlElement
	@Column
	private long mobile;
	
//	@JsonIgnore
//	@XmlElement
	@Column
	private String password;

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}

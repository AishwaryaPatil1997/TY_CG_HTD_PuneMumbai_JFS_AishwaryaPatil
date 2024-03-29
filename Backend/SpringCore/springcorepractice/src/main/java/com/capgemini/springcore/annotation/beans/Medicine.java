package com.capgemini.springcore.annotation.beans;

import java.util.Set;

//import java.util.List;

public class Medicine {

	private String name;
	private String type;
	private double price;
//	private List<String> drugs;
	private Set<String> drugs;

	public Set<String> getDrugs() {
		return drugs;
	}

	public void setDrugs(Set<String> drugs) {
		this.drugs = drugs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

//	public List<String> getDrugs() {
//		return drugs;
//	}
//
//	public void setDrugs(List<String> drugs) {
//		this.drugs = drugs;
//	}

}

package com.capgemini.jpawithhibernate.onetomany;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Pencil")
public class Pencil {

	@Id
	@Column
	private int pid;
	
	@Column
	private String colour;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "boxId",nullable = false)
	private PencilBox pb1;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public PencilBox getPb1() {
		return pb1;
	}

	public void setPb1(PencilBox pb1) {
		this.pb1 = pb1;
	}
}

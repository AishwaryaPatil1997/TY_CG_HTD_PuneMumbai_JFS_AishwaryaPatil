package com.capgemini.jpawithhibernate.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="votercard")
public class VoterCard {
	
	@Id
	@Column
	private int vid;
	
	@Column
	private String address;
	
	@OneToOne(mappedBy = "voterCard")
	private Person personInfo;
	
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Person getPersonInfo() {
		return personInfo;
	}
	public void setPersonInfo(Person personInfo) {
		this.personInfo = personInfo;
	}	
}

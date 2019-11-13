package com.capgemini.jpawithhibernate.onetomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PencilBox")
public class PencilBox {

	@Id
	@Column
	private int boxId;

	@Column
	private String name;

	@OneToMany(mappedBy = "pb1") 
	private List<Pencil> pen;

	public List<Pencil> getPen() {
		return pen;
	}

	public void setPen(List<Pencil> pen) {
		this.pen = pen;
	}

	public int getBoxId() {
		return boxId;
	}

	public void setBoxId(int boxId) {
		this.boxId = boxId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
}

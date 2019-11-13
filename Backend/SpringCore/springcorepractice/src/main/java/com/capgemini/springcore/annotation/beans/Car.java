package com.capgemini.springcore.annotation.beans;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.springcore.interfaces.Engine;

public class Car {

	private int modelNo;
	private String ModelName;
	
	@Autowired
	private Engine engine;

	public int getModelNo() {
		return modelNo;
	}

	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}

	public String getModelName() {
		return ModelName;
	}

	public void setModelName(String modelName) {
		ModelName = modelName;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
}

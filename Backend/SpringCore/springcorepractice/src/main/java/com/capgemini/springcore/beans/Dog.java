package com.capgemini.springcore.beans;

import com.capgemini.springcore.interfaces.Animal;

public class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("Eating pedigree...");
	}

	@Override
	public void speak() {
		System.out.println("Bhowww bhowww");
	}

	@Override
	public void walk() {
		System.out.println("Dog is walking...");
	}

}

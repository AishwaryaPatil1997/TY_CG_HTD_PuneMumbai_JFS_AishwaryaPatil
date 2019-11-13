package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.Pet;

public class AnimalTest {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("pet.xml");
		Pet pet = applicationContext.getBean("pet", Pet.class);
		
		pet.getAnimal().walk();
		pet.getAnimal().speak();
		pet.getAnimal().eat();
	}
}

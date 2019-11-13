package com.capgemini.springcore.annotation.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.annotation.beans.Medicine;

public class MedicineTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("medicine.xml");
		Medicine medicine = context.getBean("medicine", Medicine.class);
		
		System.out.println("Medicine name: " + medicine.getName());
		System.out.println("Type: " + medicine.getType());
		System.out.println("Price: "+ medicine.getPrice());
		System.out.println("Drugs details: " + medicine.getDrugs());
	}
}

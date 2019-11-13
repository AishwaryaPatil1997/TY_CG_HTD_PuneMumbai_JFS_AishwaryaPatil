package com.capgemini.springcore.annotation.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.annotation.beans.Car;

public class CarTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("car.xml");
		Car car = context.getBean("car", Car.class);
		
		System.out.println();
		System.out.println("Car Details:");
		System.out.println();
		System.out.println("Model Number: "+car.getModelNo());
		System.out.println("Model Name: "+car.getModelName());
		System.out.println();
		System.out.println("Engine Details:");
		System.out.println();
		System.out.println("CC: "+car.getEngine().getCC());
		System.out.println("Type: "+car.getEngine().getType());
		System.out.println();
		
		((AbstractApplicationContext)context).close();
		
	}

}

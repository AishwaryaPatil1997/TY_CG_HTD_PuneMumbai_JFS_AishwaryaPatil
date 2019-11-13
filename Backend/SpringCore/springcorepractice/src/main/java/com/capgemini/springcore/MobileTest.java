package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.MobileBean;

public class MobileTest {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("mobile.xml");
		MobileBean mobileBean = (MobileBean) applicationContext.getBean("mobile");
		
		System.out.println("Mobile details:");
		System.out.println("Brand Name   : "+mobileBean.getBrandName());
		System.out.println("Model Name   : "+mobileBean.getModelName());
		System.out.println("Price        : "+mobileBean.getPrice());
		System.out.println("Display Size : "+mobileBean.getMdBean().getDisplaySize());
		System.out.println("Resolution   : "+mobileBean.getMdBean().getResolution());
	}
}

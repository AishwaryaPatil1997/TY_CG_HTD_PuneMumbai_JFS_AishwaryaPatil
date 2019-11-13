package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.MessageBean2;

public class MessageTest2 {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
	//	((AbstractApplicationContext)applicationContext).registerShutdownHook();
		
		MessageBean2 messageBean = (MessageBean2) applicationContext.getBean("messageBean");
		MessageBean2 messageBean2 = (MessageBean2) applicationContext.getBean("messageBean");
		
		System.out.println(messageBean.getMessage());
		System.out.println(messageBean2.getMessage());
		
		((AbstractApplicationContext)applicationContext).close();
	}
}

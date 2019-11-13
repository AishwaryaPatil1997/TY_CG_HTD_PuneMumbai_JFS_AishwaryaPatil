package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.MessageBean;

public class MessageTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		((AbstractApplicationContext)applicationContext).registerShutdownHook();
		
		MessageBean messageBean = (MessageBean) applicationContext.getBean("messageBean");
		
		System.out.println(messageBean.getMessage());
		
//		((AbstractApplicationContext)applicationContext).close();
	}
}

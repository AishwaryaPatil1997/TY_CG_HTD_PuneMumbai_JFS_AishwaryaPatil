package com.capgemini.springcore.postprocessors;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor{

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("Inside Post Bean Factory..");
		
		BeanDefinition beanDefinition = beanFactory.getBeanDefinition("messageBean");
		MutablePropertyValues propertyValues = beanDefinition.getPropertyValues();
		
		System.out.println("Message via XML: "+propertyValues.getPropertyValue("message").getValue());
		propertyValues.add("message", "Welcome to Spring-5...!!!");
	}
	
}

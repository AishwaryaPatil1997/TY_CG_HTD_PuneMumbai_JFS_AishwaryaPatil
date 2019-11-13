package com.capgemini.springcore.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.capgemini.springcore.annotation.beans.DepartmentBean;

@Configuration
public class DepartmentConfig {

	@Bean(name = "development")
	public DepartmentBean getDepartmentBean() {
		DepartmentBean deptBean = new DepartmentBean();
		deptBean.setDeptId(1234);
		deptBean.setDeptname("Development");
		
		return deptBean;
	}
	
	@Bean(name = "testing")
	//@Primary
	public DepartmentBean getDepartmentBean1() {
		DepartmentBean deptBean = new DepartmentBean();
		deptBean.setDeptId(1235);
		deptBean.setDeptname("Testing");
		
		return deptBean;
	}
	
	@Bean(name = "hr")
	public DepartmentBean getDepartmentBean2() {
		DepartmentBean deptBean = new DepartmentBean();
		deptBean.setDeptId(1236);
		deptBean.setDeptname("HR");
		
		return deptBean;
	}
}

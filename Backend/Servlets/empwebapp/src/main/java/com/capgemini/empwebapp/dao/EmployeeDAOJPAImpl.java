package com.capgemini.empwebapp.dao;

import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.empwebapp.bean.EmployeeInfoBean;

public class EmployeeDAOJPAImpl implements EmployeeDAO {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Demo");
	EntityManager entityManager = entityManagerFactory.createEntityManager();

	@Override
	public EmployeeInfoBean getEmployee(int emp_id) {

		EmployeeInfoBean employeeInfoBean = entityManager.find(EmployeeInfoBean.class, emp_id);

		entityManager.close();
		entityManagerFactory.close();

		return employeeInfoBean;
	}

	@Override
	public EmployeeInfoBean authenticate(int emp_id, String password) {

//		EmployeeInfoBean employeeInfoBean = entityManager.find(EmployeeInfoBean.class, emp_id);

//		if (password.equals(employeeInfoBean.getPassword())) {
//			return true;
//		} else {
//			return false;
//		}

		String jpql = "from EmployeeInfoBean where emp_id = :emp_id and password = :password";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("emp_id", emp_id);
		query.setParameter("password", password);

		EmployeeInfoBean eBean = null;

		try {
			eBean = (EmployeeInfoBean) query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		entityManager.close();

		return eBean;
	}

	@Override
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean) {
		EntityTransaction transaction = entityManager.getTransaction();
		boolean isAdded = false;
		try {
			transaction.begin();
			entityManager.persist(employeeInfoBean);
			transaction.commit();
			isAdded =  true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		entityManager.close();

		return isAdded;
	}

	@Override
	public boolean updateEmployee(EmployeeInfoBean employeeInfoBean) {
		
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		boolean isUpdated = false;
		try {
			EmployeeInfoBean infoBean = entityManager.find(EmployeeInfoBean.class, employeeInfoBean.getEmp_id());
			if (infoBean != null) {
				if (employeeInfoBean.getEmp_name() != null) {
					infoBean.setEmp_name(employeeInfoBean.getEmp_name());
				} else {
					return isUpdated; 
				}
				
				if (employeeInfoBean.getAge() != 0) {
					infoBean.setAge(employeeInfoBean.getAge());
				} else {
					return isUpdated;
				}
				
			} else {
				return isUpdated;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return isUpdated;		
	}
}

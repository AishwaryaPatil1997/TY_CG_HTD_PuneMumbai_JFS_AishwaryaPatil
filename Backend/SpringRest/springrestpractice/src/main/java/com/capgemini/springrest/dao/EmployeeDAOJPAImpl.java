package com.capgemini.springrest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.capgemini.springrest.bean.EmployeeInfoBean;

@Repository
public class EmployeeDAOJPAImpl implements EmployeeDAO {

	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;
	
	@Override
	public EmployeeInfoBean getEmployee(int emp_id) {

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EmployeeInfoBean employeeInfoBean = entityManager.find(EmployeeInfoBean.class, emp_id);

		return employeeInfoBean;
	}

	@Override
	public EmployeeInfoBean authenticate(int emp_id, String password) {

		EntityManager entityManager = entityManagerFactory.createEntityManager();
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
		EntityManager entityManager = entityManagerFactory.createEntityManager();
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
		EntityManager manager = entityManagerFactory.createEntityManager();
		EmployeeInfoBean existingEmployeeInfo = manager.find(EmployeeInfoBean.class, employeeInfoBean.getEmp_id());
		boolean isUpdated = false;
		
		if (existingEmployeeInfo != null) {
			String name = employeeInfoBean.getEmp_name();
			if (name != null) {
				existingEmployeeInfo.setEmp_name(name);
			}

			int age = employeeInfoBean.getAge();
			if (age > 18) {
				existingEmployeeInfo.setAge(age);
			}
			
			double salary = employeeInfoBean.getSalary();
			if (salary > 0) {
				existingEmployeeInfo.setSalary(salary);
			}
			
			long mobile = employeeInfoBean.getMobile();
			if (mobile > 0) {
				existingEmployeeInfo.setMobile(mobile);
			}
			
			String designation = employeeInfoBean.getDesignation();
			if (designation != null) {
				existingEmployeeInfo.setDesignation(designation);
			}
			char gender = employeeInfoBean.getGender();
			if (gender == 'M' || gender == 'f' || gender == 'm' || gender == 'f') {
				existingEmployeeInfo.setGender(gender);
			}
			
			String pwd = employeeInfoBean.getPassword();
			if (pwd != null) {
				existingEmployeeInfo.setPassword(pwd);
			}
			
			try {
				EntityTransaction tx = manager.getTransaction();
				tx.begin();
				manager.persist(existingEmployeeInfo);
				tx.commit();
				
				isUpdated = true;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			manager.close();
		}
		return isUpdated;
	}// End of updateEmployee()
	
	@Override
	public boolean deleteEmployee(int empId) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Demo");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		boolean isDeleted = false;

		try {
			EntityTransaction tx = entityManager.getTransaction();
			tx.begin();
			EmployeeInfoBean employeeInfoBean= entityManager.find(EmployeeInfoBean.class, empId);
			entityManager.remove(employeeInfoBean);
			tx.commit();
			isDeleted = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		entityManager.close();
		return isDeleted;
	}// End of deleteEmployee()

	@Override
	public List<EmployeeInfoBean> getAllEmployees() {
		EntityManager manager = entityManagerFactory.createEntityManager();
		String jpql = "from EmployeeInfoBean";
		Query query = manager.createQuery(jpql);
		
		List<EmployeeInfoBean> employeesList = null;
		try {
			employeesList = query.getResultList();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return employeesList;
		
	}// End of getAllEmployees()
}

package com.capgemini.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.springboot.bean.EmployeeInfoBean;
import com.capgemini.springboot.bean.EmployeeResponse;
import com.capgemini.springboot.service.EmployeeService;

//@Controller
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EmployeeBootController {

	@Autowired
	private EmployeeService service;

	//----------------------------- GET EMPLOYEE ------------------------------
	
	@GetMapping(path = "/getEmployee", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
//	@ResponseBody
	public EmployeeResponse getEmployee(int emp_id) {
		EmployeeInfoBean employeeInfoBean = service.getEmployee(emp_id);
		EmployeeResponse response = new EmployeeResponse();

		if (employeeInfoBean != null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee record found...!!!");
			response.setEmployeeInfoBean(employeeInfoBean);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Employee ID " + emp_id + " not found...");
		}

		return response;

	}
	
	//----------------------------- ADD EMPLOYEE ------------------------------

	@PutMapping(path = "/addEmployee", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE })
//	@ResponseBody
	public EmployeeResponse addEmployee(@RequestBody EmployeeInfoBean employeeInfoBean) {
		boolean isAdded = service.addEmployee(employeeInfoBean);
		EmployeeResponse response = new EmployeeResponse();

		if (isAdded) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee added successfully...!!!");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription(" Unable to add employee record...");
		}

		return response;
	}
	
	//----------------------------- DELETE EMPLOYEE ------------------------------

	@DeleteMapping(path = "/deleteEmployee/{employeeId}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public EmployeeResponse deleteEmployee(@PathVariable("employeeId") int empId) {
		boolean isDeleted = service.deleteEmployee(empId);
		EmployeeResponse response = new EmployeeResponse();

		if (isDeleted) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee deleted successfully...!!!");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription(" Unable to delete employee record...");
		}

		return response;
	}
	
	//----------------------------- UPDATE EMPLOYEE ------------------------------

	@PostMapping(path = "/updateEmployee", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public EmployeeResponse updateEmployee(@RequestBody EmployeeInfoBean employeeInfoBean) {
		boolean isUpdated = service.updateEmployee(employeeInfoBean);
		EmployeeResponse response = new EmployeeResponse();

		if (isUpdated) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee updated successfully...!!!");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription(" Unable to update employee record...");
		}

		return response;
	}
	
	//----------------------------- GET ALL EMPLOYEE ------------------------------

	@GetMapping(path = "/getAll", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public EmployeeResponse getAllEmployees() {
		List<EmployeeInfoBean> employeesList = service.getAllEmployees();
		EmployeeResponse response = new EmployeeResponse();

		if (employeesList != null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("All the Employee records found...!!!");
			response.setEmployeesList(employeesList);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Unable to fetch the employee record...");
		}

		return response;
	}
}

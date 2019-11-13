package com.capgemini.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.springrest.bean.EmployeeInfoBean;
import com.capgemini.springrest.bean.EmployeeResponse;
import com.capgemini.springrest.service.EmployeeService;

//@Controller
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EmployeeRestController {

	@Autowired
	private EmployeeService service;

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

	@DeleteMapping(path = "/deleteEmployee", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public EmployeeResponse deleteEmployee(int empId) {
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

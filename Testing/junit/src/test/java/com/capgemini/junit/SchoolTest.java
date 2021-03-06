package com.capgemini.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SchoolTest {

	private School school;
	
	@BeforeEach
	public void createObject() {
		school = new School();
	}
	
	@Test
	public void testRegisterSchool() {
		Student student = new Student("Dimple", 78.8, 'F');
		Student stu = school.registerStudent(student);
		assertEquals(1, stu.getId());
	} 
	
	@Test
	public void testRegisterStudentForNull() {
		assertThrows(NullPointerException.class, () -> school.registerStudent(null));
	}

}

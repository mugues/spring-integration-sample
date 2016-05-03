package com.sample.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.sample.entity.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/application-context/persistence-context.xml" })
public class TestPersistenceContext {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Test
	public void test() {
		assertNotNull(employeeRepository);

		Employee employee = new Employee();
		employee.setName("Max");
		employeeRepository.save(employee);

		Employee employee2 = employeeRepository.findOne(1l);

		assertEquals("Max", employee.getName());
		assertEquals(employee, employee2);
		
	}

}

package com.sample.integration.transaction;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.entity.Employee;
import com.sample.integration.transaction.gateway.Gateway;

public class TransactionApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context/transaction-context.xml");

		System.out.println("1) - Gateway ");
		System.out.println("2) - Poller ");

		Scanner scanner = new Scanner(System.in);
		
		if (scanner.next().equals("1")) {
			Gateway gateway = (Gateway) context.getBean("gateway");
			
			System.out.println("Insert name...:");
			
			String name = scanner.next();		
			Employee employee = new Employee(name);
			gateway.send(employee);
		} 
	}
}

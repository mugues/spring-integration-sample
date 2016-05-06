package com.sample.integration.jms;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.integration.jms.gateway.Gateway;

public class JmsApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context/jms-context.xml");

		Gateway gateway = (Gateway) context.getBean("gateway");

		while (true) {

			System.out.println("write employee name");
			Scanner scanner = new Scanner(System.in);

			String name = scanner.next();
			gateway.send(name);
		}
	}
}

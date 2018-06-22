package com.test.cognizant.sathish.main;

import org.apache.camel.CamelContext;
import org.apache.camel.spring.SpringCamelContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws Exception {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("META-INF/spring/*.xml");
		CamelContext camelContext = SpringCamelContext.springCamelContext(applicationContext, false);
		camelContext.start();
		System.out.println("Server Started.........................");
	}

}

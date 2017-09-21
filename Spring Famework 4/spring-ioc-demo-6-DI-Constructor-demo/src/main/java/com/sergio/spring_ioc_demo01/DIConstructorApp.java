package com.sergio.spring_ioc_demo01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sergio.springdamo.domain.HumanResourceDept;
import com.sergio.springdamo.domain.Organization;

public class DIConstructorApp {
	
	public static void main(String[] args) {
		
		//Create the application context(container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		//Create the bean
		Organization org = (Organization) ctx.getBean("myorg");
		
		//Invoke the company slogan via the bean
		System.out.println(org.corporateSlogan());
		
		//Print organization details
		System.out.println(org);
		
		System.out.println(org.corporateService());
		
		
		HumanResourceDept hrdept = ((HumanResourceDept) ctx.getBean("myhrdept"));
		
		System.out.println(hrdept.hiringStatus(100000));
		
		//close the application context (container)
		((ClassPathXmlApplicationContext) ctx).close();
	}

}

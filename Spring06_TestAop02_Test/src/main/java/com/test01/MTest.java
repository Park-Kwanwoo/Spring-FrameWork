package com.test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("aopAppContext.xml");
		
		Human person01 = factory.getBean("person01",Human.class);
		person01.sayName("뽀로로");
		person01.sayJob("개발자");
		//System.out.println(person01.sayName("뽀로로"));
		//System.out.println(person01.sayJob("개발자"));
		
		System.out.println("----------");
		
		Human person02 = factory.getBean("person02",Human.class);
		person02.sayName("둘리");
		person02.sayJob("개그맨");
		//System.out.println(person02.sayName("둘리"));
		//System.out.println(person02.sayJob("개그맨"));

	}
}

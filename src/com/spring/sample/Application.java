package com.spring.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("applicationContext.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Triangle trian = context.getBean("triangle", Triangle.class);
		System.out.println(trian.getA().getX());
		trian.draw();
		
		//List list = context.getBean("list",List.class);
		//list.print();
	}
}

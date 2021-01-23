package com.au.spring;

import java.io.IOException;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) throws IOException {

		AbstractApplicationContext factory = new FileSystemXmlApplicationContext("spring.xml"); 	      
		factory.registerShutdownHook();
		Triangle triangle = (Triangle)factory.getBean("triangle");//bean id
		triangle.draw();
		
		((FileSystemXmlApplicationContext) factory).close();

	}

}

package com.spring.au;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DrawingApp {
	
	public static void main(String[] args)
	{
		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Rectangle rectangle = factory.getBean(Rectangle.class);
		
		rectangle.draw();
		((AnnotationConfigApplicationContext) factory).close();
	}

}

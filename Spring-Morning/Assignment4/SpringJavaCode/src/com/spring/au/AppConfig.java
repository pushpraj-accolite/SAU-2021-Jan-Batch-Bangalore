package com.spring.au;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public Rectangle getRectangle()
	{
		return new Rectangle();
	}
	
	@Bean(name = "PointA")
	public Point pointAObj() 
	{
		return new Point(5,5);
	}
	
	@Bean(name = "PointB")
	public Point pointBObj() 
	{
		return new Point(30,5);
	}
	
	@Bean(name = "PointC")
	public Point pointCObj() 
	{
		return new Point(30,20);
	}
	
	@Bean(name = "PointD")
	public Point pointDObj() 
	{
		return new Point(5,20);
	}
}

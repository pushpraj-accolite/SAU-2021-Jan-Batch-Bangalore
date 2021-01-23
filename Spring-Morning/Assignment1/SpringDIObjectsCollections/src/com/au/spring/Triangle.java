package com.au.spring;

import java.util.List;

public class Triangle {
	
	private List<Point> points; 
	
	public List<Point> getPoints(){
		return points;
	}
	
	public void setPoints(List<Point> points){
		this.points = points;
	}

	public void draw() 
	{
		System.out.println("Points of triangle are:-");
		for(Point point:points) 
		{
			System.out.println("Point = "+point.getX()+","+point.getY());
		}

	}

}

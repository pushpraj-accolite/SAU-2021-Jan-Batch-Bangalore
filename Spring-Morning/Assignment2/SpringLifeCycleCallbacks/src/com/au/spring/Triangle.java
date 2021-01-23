package com.au.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Triangle {
	@Autowired
	@Qualifier("PointA")
	private Point PointA;
	
	@Autowired
	@Qualifier("PointB")
	private Point PointB;
	
	@Autowired
	@Qualifier("PointC")
	private Point PointC;
	
	public Point getPointA() {
		return PointA;
	}
	
	public void setPointA(Point PointA) {
		this.PointA = PointA;
	}

	
	public Point getPointB() {
		return PointB;
	}
 
	
	public void setPointB(Point pointB) {
		this.PointB = pointB;
	}

	public Point getPointC() {
		return PointC;
	}

	public void setPointC(Point pointC) {
		this.PointC = pointC;
	}  
	
	public void draw() {
		System.out.println("PointA"+getPointA().getX()+"PointA"+getPointA().getY());
		System.out.println("PointB"+getPointB().getX()+"PointB"+getPointB().getY());
		System.out.println("PointC"+getPointC().getX()+"PointC"+getPointC().getY());
	}
 
	public void onInit() {
		System.out.println("Triangle bean initialized");
	}
	
	public void onCleanup() {
		System.out.println("Triangle bean destroyed");
	}

}

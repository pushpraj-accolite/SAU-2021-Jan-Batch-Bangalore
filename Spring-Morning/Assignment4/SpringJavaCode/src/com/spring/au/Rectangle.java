package com.spring.au;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Rectangle {
	
	@Autowired
	@Qualifier("PointA")
	private Point pointA;
	
	@Autowired
	@Qualifier("PointB")
	private Point pointB;
	
	@Autowired
	@Qualifier("PointC")
	private Point pointC;
	
	@Autowired
	@Qualifier("PointD")
	private Point pointD;
	
	public Point getPointA() {
		return pointA;
	}
	
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	
	public Point getPointB() {
		return pointB;
	}
	
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	
	public Point getPointC() {
		return pointC;
	}
	
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	public Point getPointD() {
		return pointD;
	}
	
	public void setPointD(Point pointD) {
		this.pointD = pointD;
	}
	
	public void draw() {
		System.out.println("rectange drawn");
		
		System.out.println("Point A -> "+getPointA().getX()+","+getPointA().getY());
		System.out.println("Point B -> "+getPointB().getX()+","+getPointB().getY());
		System.out.println("Point C -> "+getPointC().getX()+","+getPointC().getY());
		System.out.println("Point D -> "+getPointD().getX()+","+getPointD().getY());
		
		int height = (int) Math.sqrt((getPointA().getX()-getPointD().getX())*(getPointA().getX()-getPointD().getX())+(getPointA().getY()-getPointD().getY())*(getPointA().getY()-getPointD().getY()));
		System.out.println("Height of Rectangle is : "+height);
		
		int width = (int) Math.sqrt((getPointB().getX()-getPointA().getX())*(getPointB().getX()-getPointA().getX())+(getPointB().getY()-getPointA().getY())*(getPointB().getY()-getPointA().getY()));
		System.out.println("Width of Rectangle is : "+width);
	}

}

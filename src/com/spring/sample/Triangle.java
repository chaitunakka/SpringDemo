package com.spring.sample;

public class Triangle {
	
	private Point a;
	private Point b;
	private Point c;
	
	public void setA(Point a) {
		this.a = a;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public void setC(Point c) {
		this.c = c;
	}

	public Point getA() {
		return a;
	}

	public Point getB() {
		return b;
	}

	public Point getC() {
		return c;
	}

	void draw() {
		// TODO Auto-generated method stub
		System.out.println("triangle");
	}
}

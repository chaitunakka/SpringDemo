package com.spring.sample;

public class List {
	private java.util.List<Point> points;

	public java.util.List<Point> getPoints() {
		return points;
	}

	public void setPoints(java.util.List<Point> points) {
		this.points = points;
	}
	
	public void print() {
		// TODO Auto-generated method stub
		for(Point point:points){
			System.out.println(point.getX()+" "+point.getY());
		}
	}
}

package com.assignment.task6;

public class Triangle {
	private int side1;
	private int side2;
	private int side3;
	
	Triangle(){
		this.side1 = 3;
		this.side2 = 4;
		this.side3 = 5;
	}
	
	public int perimeter() {
		return side1 + side2 + side3;
	}
	
	public double area() {
		int s = (side1 + side2 + side3)/2;
		return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle triangle = new Triangle();
		System.out.println("perimeter of traingle = "+ triangle.perimeter());
		System.out.println("area of triangle = " + triangle.area());
	}

}

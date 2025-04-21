package com.assignment.task6;

public class Rectangle {
	private double length;
    private double breadth;
    
    public Rectangle(){
        this.length = 0;
        this.breadth = 0;
    }
    public Rectangle(double length,double breadth){
        this.length= length;
        this.breadth=breadth;
    }
    public Rectangle(int side){
        this.length=side;
        this.breadth=side;
    }
    
    private double Area(){
        return length * breadth;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle zeroRect = new Rectangle();
        Rectangle rect = new Rectangle(2,3);
        Rectangle square = new Rectangle(5);
        System.out.println(zeroRect.Area());
        System.out.println(rect.Area());
        System.out.println(square.Area());
	}

}

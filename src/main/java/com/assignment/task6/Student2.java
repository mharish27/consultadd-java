package com.assignment.task6;

public class Student2 {
	private String name;
	
    public Student2(){
        this.name= "Unknown";
    }
    
    public Student2(String name){
        this.name=name;
    }
    
    @Override
    public String toString() {
    	return "Student name: " + this.name;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 noName = new Student2();
        Student2 harish = new Student2("Harish");
        
        System.out.println(noName);
        System.out.println(harish);
	}

}

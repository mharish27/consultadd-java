package com.assignment.task6;

public class Employee {
	private String name;
    private int yearOfJoining;
    private double salary;
    private String address;
    
    public Employee(String name,int yearOfJoining, double salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }
    
    @Override
    public String toString() {
		return "name: " + this.name
				+ ", Year of Joining - " + this.yearOfJoining
				//+ ", Salary - " + this.salary
				+ ", address - " + this.address;
    	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] employee = {new Employee("Robert", 1994, 200000, "64C- Walls Street"),
                new Employee("Sam", 2000, 200600, "68D- Walls Street"),
                new Employee("John", 1999, 120000," 26B- Walls Street")};
        
        for(Employee emp:employee ){
            System.out.println(emp);

        }

	}

}

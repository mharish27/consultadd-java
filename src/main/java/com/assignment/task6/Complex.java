package com.assignment.task6;

public class Complex {
	private double real;
    private double imaginary;
    
    Complex(double r, double i) {
        this.real = r;
        this.imaginary = i;
    }
    
    public Complex multiply(Complex c) {
        double realPart = (this.real * c.real) - (this.imaginary * c.imaginary);
        double imagPart = (this.real * c.imaginary) + (this.imaginary * c.real);
        return new Complex(realPart, imagPart);
    }
    
    @Override
    public String toString() {
    	return this.real + " + " + this.imaginary + "i";
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c1 = new Complex(4, 3);
        Complex c2 = new Complex(1, 2);
        
        Complex product = c1.multiply(c2);
        System.out.print(product);

	}

}

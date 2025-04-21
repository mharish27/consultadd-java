package com.assignment.task7;

public class Programming4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is a test string to check for number of words";
        String[] words = str.split("\\s+");
        int count = words.length;

        System.out.println("count of words:" + count);

	}

}

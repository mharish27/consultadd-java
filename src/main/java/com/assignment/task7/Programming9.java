package com.assignment.task7;

public class Programming9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="man";
        generateCombination("",str,0);


	}

	private static void generateCombination(String prefix, String str, int index) {
		// TODO Auto-generated method stub
		for(int i=index; i<str.length();i++){
            char ch = str.charAt(i);
            String newPrefix = prefix + ch;
            System.out.println(newPrefix);
            generateCombination(newPrefix,str,i+1);
        }
		
	}

}

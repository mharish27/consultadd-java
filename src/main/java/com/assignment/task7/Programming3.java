package com.assignment.task7;

import java.util.HashSet;
import java.util.Set;

public class Programming3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "harish";
		
		boolean isUnique = checkForAllUniqueChars(str);
        
        if(isUnique){
            System.out.print(str + " has all unique characters");
        }else {
            System.out.print(str + " does not have all unique characters");
        }
	}

	private static boolean checkForAllUniqueChars(String str) {
		// TODO Auto-generated method stub
	    Set<Character> set = new HashSet<>();
	        
	    for(char s:str.toCharArray()){
	    	set.add(s);
	    }
		return set.size() == str.length();
	}

}

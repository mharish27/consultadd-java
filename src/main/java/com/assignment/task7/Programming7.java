package com.assignment.task7;

public class Programming7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
        possiblePermutations("",str);

	}

	private static void possiblePermutations(String prefix, String remaining) {
		// TODO Auto-generated method stub
		if(remaining.isEmpty()){
		    System.out.println(prefix);
		    return;
		}
		for(int i=0;i<remaining.length();i++){
		    char ch = remaining.charAt(i);
		    String newPrefix = prefix + ch;
		    String newRemaining = remaining.substring(0,i)+ remaining.substring(i+1);
		     possiblePermutations(newPrefix,newRemaining);

		}
		
	}

}

package com.assignment.task7;

import java.util.LinkedHashMap;
import java.util.Map;

public class Programming1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ghggfgvkjuugjjy";
        char result = getFirstNonRepeating(str);
        
        if(result != 0){
            System.out.println("First non-repeated character: " + result);
        }
        else{
            System.out.println("no unique character");
        }
	}

	private static char getFirstNonRepeating(String str) {
		// TODO Auto-generated method stub
		
		Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
        	if(entry.getValue() == 1){
        		return entry.getKey();
        	}
        }
		return 0;
	}

}

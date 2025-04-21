package com.assignment.task7;

import java.util.HashMap;
import java.util.Map;

public class Programming6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "this is a sample text";
        String[] words = str.toLowerCase().split("\\s+");
        Map<Character, Integer> freq = new HashMap<>();
        for (String word : words) {
            for (char ch : word.toCharArray()) {
                freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            }
        }
        
        for (Map.Entry<Character, Integer> result : freq.entrySet()) {
            System.out.println(result.getKey() + ":" + result.getValue());
        }

	}

}

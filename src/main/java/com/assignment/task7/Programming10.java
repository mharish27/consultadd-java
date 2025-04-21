package com.assignment.task7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Programming10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map = new HashMap<>();
        map.put("harish",03);
        map.put("akhil",5);
        map.put("likith",02);
        map.put("venkata",01);
        Map<String,Integer> sortedByKey = new TreeMap<>(map);
        
        System.out.println("sorted by key");
        for(Map.Entry<String,Integer> sort : sortedByKey.entrySet()){
            System.out.println(sort.getKey() + "->" + sort.getValue());
        }
        
        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((e1,e2)-> e1.getValue().compareTo(e2.getValue()));
        
        System.out.println("\nsorted by value");
		for(Map.Entry<String,Integer> ls:list){
		    System.out.println(ls.getKey() + ":"+ ls.getValue());
		}
	}

}

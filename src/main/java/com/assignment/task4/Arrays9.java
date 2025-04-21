package com.assignment.task4;

public class Arrays9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr = {1,4,10,-3};
        int target =14;
        
        for (int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                
                if(arr[i]+ arr[j] ==  target){
                    System.out.print(target + " sum found at " 
                    			+ i + "["+ arr[i] + "]" +
                    			" and " + j + "["+ arr[j] + "]");
                }
            }
        }

	}

}

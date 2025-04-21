package com.assignment.task4;

public class Arrays5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix1 = {{1,2,3},{4,5,6}};
        int[][] matrix2 = {{1,2,3},{4,5,6}};
        int[][] sumMatrix = new int[2][3];
        int rows = matrix1.length, cols = matrix1[0].length;
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
            	sumMatrix[i][j]= matrix1[i][j]+ matrix2[i][j];
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }

	}

}

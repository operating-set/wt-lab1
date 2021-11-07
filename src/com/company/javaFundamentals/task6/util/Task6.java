package com.company.javaFundamentals.task6.util;

public class Task6 {
    public static void solution(double[] array){
        for(double x: array) System.out.print(x+" ");
        System.out.println("\n");

        int l = array.length;
        double[][] matrix = new double[l][l];
        for(int i = 0; i<l; i++){
            for(int j = 0; j<l; j++) {
                matrix[i][j]=array[(i+j)%l];
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}

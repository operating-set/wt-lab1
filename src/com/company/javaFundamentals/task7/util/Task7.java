package com.company.javaFundamentals.task7.util;

public class Task7 {
    public static void solution(double[] array){
        for(double x: array) System.out.print(x+" ");
        System.out.println("\n");

        for(int i = 0; i<array.length-1; i++){
            if(array[i]>array[i+1]){
                int j = i;
                while(j>=0 && array[j]>array[j+1]) swap(array,j,j--+1);
            }
        }
        for(double x: array) System.out.print(x+" ");
    }

    private static void swap(double[] array, int i1, int i2){
        array[i1]+=array[i2];
        array[i2]-=array[i1];
        array[i1]+=array[i2];
        array[i2]=-array[i2];
    }
}

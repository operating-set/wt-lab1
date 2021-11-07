package com.company.javaFundamentals.task8.util;

public class Task8 {
    public static void solution(double[] arrayA, double[] arrayB){
        for(double x: arrayA) System.out.print(x+" ");
        System.out.println("\n");
        for(double x: arrayB) System.out.print(x+" ");
        System.out.println("\n");

        int i = 0;

        for(double x: arrayB) if(i>=arrayA.length || x<=arrayA[i])
            System.out.print("x("+x+") ");
        else {
            while( i<arrayA.length && x>arrayA[i]) System.out.print(arrayA[i++]+" ");
            System.out.print("x("+x+") ");
        }
    }
}

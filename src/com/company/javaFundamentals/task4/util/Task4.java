package com.company.javaFundamentals.task4.util;

public class Task4 {
    public static void solution(int[] array){
        System.out.println("Исходный массив:");
        for (int x: array) {
            System.out.print(x+" ");
        }
        System.out.println("\nПростые числа под номерами:");
        for (int i=0; i<array.length; i++) {
            if(fermatTest(array[i]))
            System.out.print(i+" ("+array[i]+")   ");
        }
    }

    private static boolean fermatTest(int x){ // Вероятностный тест Ферма
        if (x%2==0) return false;
        for(int i=0;i<1000;i++){
            int a = (getRandomInteger(x*2)%(x-2)) + 2;
            if (gcd(a,x)!=1)
                return false;
            if(fastExp(a, x-1, x)!=1)
                return false;
        }
        return true;
    }

    private static int getRandomInteger(int max) {
        return (int) (Math.random()*max);
    }

    private static int gcd(int a, int b){
        while (a!=b){
            if(a>b) a-=b;
            else b-=a;
        }
        return a;
    }

    private static int fastExp(int a, int z, int n){
        int a1 = a;
        int z1 = z;
        int x = 1;
        while (z1!=0){
            while (z1%2==0){
                z1 = z1/2;
                a1 = (a1*a1)%n;
            }
            z1 -= 1;
            x = x*a1%n;
        }
        return x;
    }
}

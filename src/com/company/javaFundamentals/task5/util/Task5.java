package com.company.javaFundamentals.task5.util;
import java.util.ArrayList;

public class Task5 {
    public static void solution(double[] array){
        max=1;

        for(double x: array){
            System.out.print(x+" ");
        }
        System.out.println();

        boolean senseless = true;
        for(int i = 1; i< array.length; i++){
            if(array[i]>array[i-1]){
                senseless = false;
                break;
            }
        }

        if(senseless){
            System.out.println("Невозможно вычеркнуть элементы так, чтобы получить возрастающую последовательность,\n" +
                    "так как исходная последовательность - убывающая\n");
        } else {
            for(int i = 0; i<array.length; i++){
                findWay(array,i,1);
            }

            System.out.println("Для получения возрастающей подпоследовательности нужно вычеркнуть минимум " +
                    (array.length-max) + " элементов\n");
        }
    }

    private static int max = 1;

    private static void findWay(double[] array, int curPos, int depth){
        for(int i = curPos+1; i<array.length; i++){
            if(array[i]>array[curPos]){
                findWay(array,i,depth+1);
            }
        }
        if(depth>max) max=depth;
    }
}

package com.company.classesAndObjects.task14_15.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class Sorting {
    public static void sort(ArrayList<Book> arrayList, Comparator<Book> bookComparator){
        for (int left = 0; left < arrayList.size(); left++) {
            // Вытаскиваем значение элемента
            Book value = arrayList.get(left);
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (bookComparator.compare(value,arrayList.get(i))<0) {
                    arrayList.set(i+1,arrayList.get(i));
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            arrayList.set(i+1,value);
        }
    }
}

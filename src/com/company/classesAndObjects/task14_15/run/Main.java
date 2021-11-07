package com.company.classesAndObjects.task14_15.run;
import com.company.classesAndObjects.task14_15.util.Book;
import com.company.classesAndObjects.task14_15.util.Sorting;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> bookArrayList=new ArrayList<Book>();

        bookArrayList.add(new Book("E_book","Author_Q",42,1));
        bookArrayList.add(new Book("A_book","Author_F",44,9));
        bookArrayList.add(new Book("F_book","Author_V",18,2));
        bookArrayList.add(new Book("B_book","Author_E",92,7));
        bookArrayList.add(new Book("G_book","Author_F",94,4));
        bookArrayList.add(new Book("C_book","Author_B",67,5));
        bookArrayList.add(new Book("H_book","Author_Z",65,6));
        bookArrayList.add(new Book("D_book","Author_Z",26,3));

        printBookList(bookArrayList, "Исходный массив");

        Sorting.sort(bookArrayList,Book.byAuthor);

        printBookList(bookArrayList, "По автору");

        Sorting.sort(bookArrayList,Book.byName);

        printBookList(bookArrayList, "По названию");

        Sorting.sort(bookArrayList,Book.byPrice);

        printBookList(bookArrayList, "По цене");

        Sorting.sort(bookArrayList,Book.byAuthorAndName);

        printBookList(bookArrayList, "По автору и имени");
    }

    static void printBookList(ArrayList<Book> bookArrayList, String name){
        System.out.println(name+":\n");
        for(Book x: bookArrayList){
            System.out.println(x.toString());
        }
        System.out.println();
    }
}


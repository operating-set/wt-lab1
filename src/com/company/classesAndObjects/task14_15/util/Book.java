package com.company.classesAndObjects.task14_15.util;

import java.util.Comparator;

public class Book implements Comparable<Book>{

    private String title;
    private String author;
    private int price;
    private static int edition;
    private int isbn;

    public Book(String title, String author, int price, int isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getEdition() {
        return edition;
    }

    public static void setEdition(int edition) {
        Book.edition = edition;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Override
    public int hashCode(){
        return 29*title.hashCode() + 4*author.hashCode() + 2*price;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return this.title.equalsIgnoreCase(book.title) && this.author.equalsIgnoreCase(book.author) && this.price == book.price;
    }

    @Override
    public String toString(){
        return "Название: " + title + "; Автор: " + author + "; Цена: " + price;
    }

    @Override
    public Book clone(){
        return new Book(this.title, this.author, this.price, this.isbn);
    }

    public static Comparator<Book> byName = new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getTitle().compareTo(o2.getTitle());
        }
    };

    public static Comparator<Book> byAuthor = new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getAuthor().compareTo(o2.getAuthor());
        }
    };

    public static Comparator<Book> byPrice = new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getPrice() - o2.getPrice();
        }
    };

    public static Comparator<Book> byNameAndAuthor = new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            int res = o1.getTitle().compareTo(o2.getTitle());
            if (res == 0) res = o1.getAuthor().compareTo(o2.getAuthor());
            return res;
        }
    };

    public static Comparator<Book> byAuthorAndName = new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            int res = o1.getAuthor().compareTo(o2.getAuthor());
            if (res == 0) res = o1.getTitle().compareTo(o2.getTitle());
            return res;
        }
    };

    public static Comparator<Book> byAuthorAndNameAndPrice = new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            int res = o1.getAuthor().compareTo(o2.getAuthor());
            if (res == 0) res = o1.getTitle().compareTo(o2.getTitle());
            if (res == 0) res = o1.getPrice() - o2.getPrice();
            return res;
        }
    };

    @Override
    public int compareTo(Book o) {
        return this.isbn-o.isbn;
    }
}

package com.company.classesAndObjects.task12;

public class Book {

    private String title;
    private String author;
    private int price;
    private static int edition;

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
}

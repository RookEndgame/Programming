package ru.mirea.lab1;

import java.lang.*;
public class Book {
    private String name;
    private int pages;

    public Book(String n, int a){
        name = n;
        pages = a;
    }
    public Book(String n){
        name = n;
        pages = 0;
    }
    public Book(){
        name = "First Book";
        pages = 0;
    }
    public void setpages(int age) {
        this.pages = pages;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
    public int getpages() {
        return pages;
    }
    public String toString(){
        return this.name+", pages "+this.pages;
    }
    public void intopages(){
        System.out.println(name+"s has "+pages*7+ " pages");
    }
}

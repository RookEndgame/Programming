package ru.mirea.lab1;

import java.lang.*;
public class TestBook {
    public static void main(String[] args) {
        Book d1 = new Book("First Book", 2);
        Book d2 = new Book("Second Book", 7);
        Book d3 = new Book("Third Book");
        d3.setpages(1);
        System.out.println(1);
        d1.intopages();
        d2.intopages();
        d3.intopages();
    }
}
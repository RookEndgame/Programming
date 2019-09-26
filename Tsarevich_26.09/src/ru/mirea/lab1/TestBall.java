package ru.mirea.lab1;

import java.lang.*;
public class TestBall {
    public static void main(String[] args) {
        Ball d1 = new Ball("Red", 2);
        Ball d2 = new Ball("Blue", 7);
        Ball d3 = new Ball("Green");
        d3.setradius(1);
        System.out.println(1);
        d1.intoBallradius();
        d2.intoBallradius();
        d3.intoBallradius();
    }
}
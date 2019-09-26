package ru.mirea.lab1;

import java.lang.*;
public class Ball {
    private String color;
    private int radius;
    public Ball(String n, int a){
        color = n;
        radius = a;
    }
    public Ball(String n){
        color = n;
        radius = 0;
    }
    public Ball(){
        color = "Red";
        radius = 0;
    }
    public void setradius(int radius) {
        this.radius = radius;
    }
    public void setcolor(String color) {
        this.color = color;
    }
    public String getcolor(String color){
        return color;
    }
    public int getradius() {
        return radius;
    }
    public String toString(){
        return this.color+", radius "+this.radius;
    }
    public void intoBallradius(){
        System.out.println(color+" ball radius is "+radius*7+ " centimeters");
    }
}

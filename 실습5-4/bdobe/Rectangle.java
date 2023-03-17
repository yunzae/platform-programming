package com.bdobe;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width,int height) {
        this.width = width;
        this.height=height;
    }
    @Override
    public float getLength(){
        float length = (this.width+this.height);
        return length;
    }
    @Override
    public float getArea(){
        float area=  this.width*this.height;
        return area;
    }
    @Override
    public void draw(){
        System.out.printf("Rectangle, Area: %.2f, Length: %.2f\n",getArea(),getLength());
    }
}
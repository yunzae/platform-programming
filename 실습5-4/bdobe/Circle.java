package com.bdobe;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }
    @Override
    public float getLength(){
        float length= (float) (2 *Math.PI * this.radius);
        return length;
    }

    @Override
    public float getArea(){
        float area= (float) Math.PI*this.radius*this.radius;
        return area;

    }
    @Override
    public void draw(){
        System.out.printf("Circle, Area: %.2f, Length: %.2f\n",getArea(),getLength());
    }
}

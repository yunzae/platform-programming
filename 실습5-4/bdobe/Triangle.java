package com.bdobe;

public class Triangle extends Shape {
    private int a, b, c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public float getLength(){
        float length = a+b+c;
        return length;
    }
    @Override
    public float getArea(){
        double s= (this.a+this.b+this.c)/2;
        float area =(float)Math.pow(s*(s-this.a)*(s-this.b)*(s-this.c),1.0/2.0);
        return area;
    }

    @Override
    public void draw() {
        System.out.printf("Triangle, Area: %.2f, Length: %.2f\n",getArea(),getLength());
    }
}

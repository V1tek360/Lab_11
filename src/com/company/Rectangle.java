package com.company;
public class Rectangle {
    double a;
    double b;
    public Rectangle(double a,double b){
        this.a=a;
        this.b=b;
        System.out.println("P="+2*(a+b));
        System.out.println("S="+(a*b));
    }
    public static void main(String[] args) {
        Rectangle vvod=new Rectangle(4,5);
        return;
    }
}

package com.company;
import java.math.*;
import static java.lang.Math.sqrt;
public class Triange {
    double a;
    double b;
    double c;
        public Triange(int a, int b ,int c){
            this.a=a;
            this.b=b;
            this.c=c;
            System.out.println("a="+a+" b="+b+" c="+c);
            int p=a+b+c;
            int p2=p/2;
            System.out.println("P="+p);
            System.out.println("S="+(sqrt(p2*(p2-a)*(p2-b)*(p2-c))));
        }
    public static void main(String[] args) {
            Triange vvod= new Triange(3,4,5);
        return;
    }
}

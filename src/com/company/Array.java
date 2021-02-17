package com.company;
import java.util.Scanner;
public class Array {
    private int[]intArray;
    private int n;
    public Array(int n) {
        this.intArray = new int[n];
        this.n = n;
        for (int i = 0; i < n; i++) {
            Scanner in = new Scanner(System.in);
            intArray[i] = in.nextInt();
        }
    }
    public static int s(int[]intArray,int n){
        Array vvod=new Array(n);
        System.out.println("");
        System.out.println("Массив: ");
        for (int i=0;i< n;i++){
            System.out.print(intArray[i]+" ");
        }
        System.out.println("");
        int max=intArray[0];
        for (int j=0;j<n-1;j++) {
            for (int i = 0; i < n-1; i++) {
                if (intArray[i] > intArray[i+1]) {
                    max=intArray[i+1];
                    intArray[i+1]=intArray[i];
                    intArray[i]=max;
                }
            }
        }
        System.out.println("Массив в порядке возрастания: ");
        for (int i=0;i<n;i++){
            System.out.print(intArray[i]+" ");
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int m = in.nextInt();
        int[] mas=new int[m];
        Array vvod=new Array(m);
        System.out.println(s(mas,m));
    }
}

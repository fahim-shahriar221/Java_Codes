package com.basicjava;

public class PrintElements {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,6,11,31};
        for (int i=0; i<a.length;i++){
            System.out.println("Index["+i+"]"+": "+a[i]);
        }
    }
}

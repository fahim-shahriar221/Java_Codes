package com.basicjava;

public class EvenPosition {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,6,11,31};
        for (int i=0; i<a.length;i+=2){
            System.out.println("Even Index["+i+"]"+": "+a[i]);
        }
    }
}

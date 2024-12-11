package com.basicjava;

public class OddPosition {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,6,11,31};
        for (int i=1; i<a.length;i+=2){
            System.out.println("Odd Index["+i+"]"+": "+a[i]);
        }
    }
}

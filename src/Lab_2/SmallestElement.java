package com.basicjava;

public class SmallestElement {
    public static void main(String[] args) {
        int[] a={1,2,3,4,6,11,31};
        int min=a[0];
        for(int i=0; i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("Smallest Element: "+min);
    }
}
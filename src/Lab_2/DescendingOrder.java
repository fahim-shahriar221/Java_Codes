package com.basicjava;

import java.util.Arrays;

public class DescendingOrder {
    public static void main(String[] args) {
        int[] a={4,2,3,1,6,11,31};
        System.out.println("Elements of array: ");
        for (int j=0; j<a.length;j++) {
            System.out.print(a[j] + " ");
        }
        Arrays.sort(a);
        System.out.println("\nDescending Order: ");
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+ " ");
        }
    }
}

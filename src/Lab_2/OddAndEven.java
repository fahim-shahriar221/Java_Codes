package com.basicjava;

public class OddAndEven {
    public static void main(String[] args) {
        int[] a={4,2,3,1,6,11,31};
        System.out.println("Elements of array: ");
        for (int j=0; j<a.length;j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println("\nOdd elements: ");
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println("\nEven elements: ");
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0) {
                System.out.print(a[i] + " ");
            }
        }
    }
}

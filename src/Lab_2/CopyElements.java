package com.basicjava;

public class CopyElements {
    public static void main(String[] args) {
        int[] a={2,6,3,4,31,11,1};
        int i;
        System.out.println("Array 1: ");
        //print array1
        for (i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        int[] b=new int[a.length];
        //copying elements
        for (i = 0; i <a.length; i++){
            b[i]=a[i];
        }
        System.out.println("\nArray 2: ");
        //print array2
        for (i=0; i<a.length; i++){
            System.out.print(b[i]+" ");
        }
    }
}

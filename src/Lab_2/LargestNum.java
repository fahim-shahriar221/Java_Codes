package com.basicjava;

public class LargestNum {
    public static void main(String[] args) {
        int[] a={1,2,3,4,6,11,31};
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if (a[i]>max) {
                max=a[i];
            }
        }
        System.out.println("Maximum number: "+max);
    }
}

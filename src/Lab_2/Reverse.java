package com.basicjava;

public class Reverse{
        public static void main(String[] args) {
            int [] a={1,2,3,4,6,11,31};
            System.out.println("array 1 is : ");
            for(int j=0;j<a.length;j++){
                System.out.print(a[j]+ " ");
            }
            System.out.println("\nReverse Array is : ");
            for(int i=a.length-1;i>=0;i--){
                System.out.print(a[i]+ " ");
            }
        }
    }

package com.example.lib;

public class MyClass {

    public static void main(String[] args) {

        int a[] = {50, 20, 80, 30, 70, 10, 40, 60};

        int max = a[0];
        for (int i = 1; i < a.length; i++) {

            if(max < a[i]){

                max = a[i];

            }


        }
        System.out.println(max);



    }


}
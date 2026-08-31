package com.levin.CollectionsFrameWork.ExceptionHandling;

public class MainClass1 {
    public static void main(String[] args) {
        int[] a = new int[5];

        System.out.println("Hello Guys");

        try {
            System.out.println(a[8]);
        }
        //Now in catch we specify the type of Exception we want to catch.
        /*
        As we already know the error that will come so we can specify the Exception like Arithmetic or NullPointer.
         */ catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Tried to access the out of bound element.");
        }

        System.out.println("Bye Guys");

         /*
         Now as we are using the try-catch block , the "Bye Guys" also got printed and didn't terminate abruptly.
          */

        //Now see MainClass2.java
    }
}

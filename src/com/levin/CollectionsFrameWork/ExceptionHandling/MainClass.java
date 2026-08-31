package com.levin.CollectionsFrameWork.ExceptionHandling;

public class MainClass
{
    public static void main(String[] args)
    {
        int[] a = new int[5];
        System.out.println(a[0]);

        System.out.println("Bye Guys");
        System.out.println(a[8]);
        System.out.println("Hello");
        /*
        Now if I do this: System.out.println(a[8]);
         pakka I will get IndeOutOfBounds Exception and becuz that
         System.out.println("Hello"); this line won't be reached and won't run.
         This is a runtime error.
         */


        //Now w.k.t this line gives us an error: System.out.println(a[8]);
        /*
        So what we can do is as w.k.t it will give us an error we can put them in the try-catch block.
         */
        // See MainClass1.java
    }
}

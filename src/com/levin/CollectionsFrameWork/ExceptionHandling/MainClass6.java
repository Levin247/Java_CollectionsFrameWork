package com.levin.CollectionsFrameWork.ExceptionHandling;

public class MainClass6
{
    public static void main(String[] args)
    {
        int[] a = new int[5];

        System.out.println("Hello Guys");
        try
        {
            int result = 5 / 0;
            System.out.println(a[8]);
        }
        /*
        When we do the below it doesn't matter which type of Exception it handles any Exception.
         */
        catch(Exception e)
        {
            System.out.println("All Exceptions are Handled.");
        }
        //The drawback is that different error's can't be handled.

        System.out.println("Bye Guys");
    }
}

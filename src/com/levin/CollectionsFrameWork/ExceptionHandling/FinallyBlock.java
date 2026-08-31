package com.levin.CollectionsFrameWork.ExceptionHandling;

public class FinallyBlock
{
    public static void main(String[] args)
    {
        int[] a = new int[5];

        System.out.println("Hello World");

        try
        {
            //System.out.println(a[8]);
            System.out.println(a[3]);
            /*
            Now here as a[3] is not an exception we won't go inside the catch block as we go inside the catch block only when there is an Exception.
             */
        }

        catch(Exception e)
        {
            System.out.println("Exceptions Handled");
        }

        finally
        {
            System.out.println("I will run always ");
        }

        /*
        There is also not a necessity to put catch pakka will try if we want to we can remove the catch block also and don't need to put it along with catch and put it with finally also.

        finally run even if there is an Exception or even if there isn't.
         */


        System.out.println("Bye World");
    }
}

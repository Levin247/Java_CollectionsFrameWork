package com.levin.CollectionsFrameWork.ExceptionHandling;

public class MainClass4
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


        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Tried to access the out of bound element.");
        }

        catch(ArithmeticException e)
        {
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
            System.out.println(e);
        }

        System.out.println("Bye Guys");


        /*
        So the 2 exceptions in the try block , I wanna handle them in the same way and I wanna handle them in the same way.

        See MainClass5
         */
    }
}

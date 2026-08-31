package com.levin.CollectionsFrameWork.ExceptionHandling;

public class MainClass5
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
        catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e)
        {
            System.out.println("Handling the Exception.");
        }
        /*
        Runtime Exception is the Parent of ArrayIndexOutOfBoundsException , ArithmeticException , NullPointerException as they are Runtime Exceptions.
         */
        catch(RuntimeException e)
        {

        }

        System.out.println("Bye Guys");
    }
}

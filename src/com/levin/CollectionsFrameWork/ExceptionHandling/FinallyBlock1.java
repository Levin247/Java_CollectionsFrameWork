package com.levin.CollectionsFrameWork.ExceptionHandling;

public class FinallyBlock1
{
    public static void main(String[] args)
    {
        int[] a = new int[5];

        try
        {
            getNumberFromArray(a);
        }
        catch (Exception e)
        {
            System.out.println("Caught the Exception");
            System.out.println(e.getMessage());
        }
    }

    static int getNumberFromArray (int[] a) throws ArithmeticException
    {
        return a[8];
    }
    //If I want I can only include the try catch and not the throws ArithmeticException in the method it will still work through this throws we are just indicating that the method might throw an Exception.
}

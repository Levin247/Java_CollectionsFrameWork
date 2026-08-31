package com.levin.CollectionsFrameWork.ExceptionHandling;

public class MainClass3
{
    public static void main(String[] args)
    {
        int[] a = new int[5];

        System.out.println("Hello Guys");

        try
        {
            int result = 5 / 0;

            /*Now if we try compiling this prgm again it will give error as this statement is reached: int result = 5 / 0 , and then to the try block tries this: int result = 5 / 0 , and but then after trying it it goes to catch it but we gave only catch for ArrayIndexOutOfBoundsException so it can't catch it and the prgm terminates abruptly and bcuz of that this line isn't be tried: System.out.println(a[8]) , and our catch block was specified for this line.
             */

            //Therefore to handle multiple exception we have to specify multiple catch blocks.
            System.out.println(a[8]);
        }

        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Tried to access the out of bound element.");
        }

        System.out.println("Bye Guys");

        //See MainClass4
    }
}

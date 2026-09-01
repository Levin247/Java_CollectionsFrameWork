package com.levin.CollectionsFrameWork.ExceptionHandling;

import java.util.Scanner;

//Third
public class CustomExceptions1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");

        try
        {
            int age = sc.nextInt();
            if (age > 100)
            {
                //See this closely right it's a constructor right.
                //throw new MyException1("My error is this.");
                throw new ArithmeticException("More than 100 not allowed");
            }
        }

        catch(Exception e)
        {
            System.out.println(e);
        }

        /*
        Now instead of this catch block if I did this:

        catch(ArithmeticException e)
        {

        }
        Then I will get error bcuz I am not catching the myException exception that I am throwing explicitly.
         */
    }
}



class MyException1 extends Exception
{
    public MyException1(String message)
    {
        super(message);
    }
}

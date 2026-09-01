package com.levin.CollectionsFrameWork.ExceptionHandling;

import java.util.Scanner;

//Third
public class CustomExceptions
{
    public static void main(String[] args) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();

        if(age > 100)
        {
            throw new MyException();
        }
        //If we see when I did this: throw new Exception() , it asked me to add throws Exception in the main method and I did that here so we can do this also: See CustomException1
    }
}



class MyException extends Exception
{

}

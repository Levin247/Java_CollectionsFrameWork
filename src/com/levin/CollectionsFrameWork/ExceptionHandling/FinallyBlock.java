package com.levin.CollectionsFrameWork.ExceptionHandling;

//Second
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


        //Assume we have a method and the method might throw any exception and for that we use the throw and throws keyword.

        //See getNumberFromArray() method and come here.
        getNumberFromArray(a);
        //Now this call doesn't know if the method will have any exception.
        //Now Compile this and see we will get error.
        //Now see FinallyBlock1.java


    }

    //Now this method will have no idea about the size of the array right and we are returning a[8] also from the array but if the array size is less than that so it might throw an error.
    //So we can use the throws keyword and not throw , throw is different from throws.
    //Now think the main method calls this method.
    static int getNumberFromArray(int[] a)
    {
        return a[8];
    }
}

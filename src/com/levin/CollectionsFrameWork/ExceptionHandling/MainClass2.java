package com.levin.CollectionsFrameWork.ExceptionHandling;

public class MainClass2
{
    public static void main(String[] args)
    {
        int[] a = new int[5];

        System.out.println("Hello Guys");

        try
        {
            System.out.println(a[8]);
            /*Now what happens is there are two exceptions but it caught
            this line here at try: System.out.println(a[8]) , and bcuz of this the int result part will never be checked as bcuz when the prgm tries the statement :  System.out.println(a[8])
            it then goes to the catch block so bcuz of that this line
            int result = 5 / 0 , never get's executed.
             */
            int result = 5 / 0;
        }

         catch (ArrayIndexOutOfBoundsException e)
         {
            System.out.println("Tried to access the out of bound element.");
         }

        System.out.println("Bye Guys");

        // See MainClass3
    }
}

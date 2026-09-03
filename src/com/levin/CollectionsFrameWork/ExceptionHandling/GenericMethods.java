package com.levin.CollectionsFrameWork.ExceptionHandling;

public class GenericMethods
{
    //Fifth
    public static void main(String[] args)
    {
        printData("Hello");
        printData(123);

        GenericMethods obj = new GenericMethods();
        obj.<String>doubleData("112");
        obj.doubleData(123);

        CustomClass custom = new CustomClass();
        obj.doubleData(custom);
    }

    //We are specifying <E> here bcuz to show that the method supports parameterised object of type E in the arguments.
    static  <E> void printData(E data)
    {
        System.out.println(data);
    }

    <E> void doubleData(E data)
    {
        System.out.println(data);
    }
}


class CustomClass
{

}

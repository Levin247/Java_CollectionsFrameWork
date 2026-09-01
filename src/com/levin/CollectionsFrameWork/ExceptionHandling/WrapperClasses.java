package com.levin.CollectionsFrameWork.ExceptionHandling;

import java.util.ArrayList;

public class WrapperClasses
{
    public static void main(String[] args)
    {
        Integer obj = new Integer(12);
        Integer obj2 = Integer.valueOf(12);
        Integer obj3 = 12;//Auto-Boxing: For this Wrapper Class is applying a box / wraps around the primitive datatype.

        int age = obj;//This is Un-Boxing.

        //You might this how this Autoboxing and Unboxing occurs but that is the done at compile time and like there are functions that convert them.

        
        ArrayList<Integer> a = new ArrayList<>();

        Boolean myboolean  = Boolean.valueOf(false);

        Integer obj4 = Integer.valueOf("12");

        System.out.println(obj4 * 12);

        Boolean flag = Boolean.valueOf("true");

    }
}

package com.levin.CollectionsFrameWork.Collection;

import java.util.ArrayList;
import java.util.List;

public class LearnList
{
    //First
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        //Here the ArrayList class implements the List Interface.

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(2);
        list.add(3);
        System.out.println(list.size());
        System.out.println(list.contains(20));
        System.out.println(list.contains(200));
        list.remove(1);
        System.out.println(list);
        list.remove(Integer.valueOf(30));
        System.out.println(list);



        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        list.addAll(list2);
        System.out.println(list);

        list.removeAll(list2);
        System.out.println(list);


        //For getting the intersection of two lists we can use the retain method.
        //Keep only the elements in list1 that are also present in list2.
        list2.retainAll(list);
        System.out.println(list2);
        list.clear();

        List<Integer> list3 = new ArrayList<>();

        list3.add(5);
        list3.add(6);
        list3.add(7);
        list3.add(8);
        list3.add(100);

        /*
        Object[] a = list.toArray();

        for(Object e : a)
        {
            Integer temp = Integer(e);
            System.out.println(e);
        }

         */

        System.out.println(list3.get(0));
        list3.set(0 , 100);
        System.out.println(list3.get(0));

        //When adding elemnts gets pushed to the left.
        list3.add(0,200);
        System.out.println(list3);
        System.out.println(list3.indexOf(100));
        System.out.println(list3.lastIndexOf(100));

        //int[] a = new int[5];

    }
}

package com.levin.CollectionsFrameWork.Collection;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

//Second
public class ListMore
{
    public static void main(String[] args)
    {
        List<String> fruits = new ArrayList<>();

        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Kiwi");

        for(int i = 0; i < fruits.size(); i++)
        {
            System.out.println(fruits.get(i));
        }


        for(String fruit : fruits)
        {
            System.out.println(fruit);
        }


        //Printing using Iterator.
        Iterator<String> fruitit = fruits.iterator();
        while(fruitit.hasNext())
        {
            System.out.println(fruitit.next());
        }

        //We can use listiterator also.
        Iterator<String> it = fruits.listIterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }


        //SubList
        /*
        Starting index - Inclusive
        Ending index - Exclusive
         */
        List<String> smalllist = fruits.subList(1 , 2);
        System.out.println(smalllist);
    }
}

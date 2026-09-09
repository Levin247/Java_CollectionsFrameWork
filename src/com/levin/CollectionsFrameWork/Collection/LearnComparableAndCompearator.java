package com.levin.CollectionsFrameWork.Collection;

import java.util.*;
//Second
public class LearnComparableAndCompearator
{
    public static void main(String[] args)
    {
        Animal a1 = new Animal(4 , "Leo" , 10);
        Animal a2 = new Animal(2 , "Bruno" , 4);
        Animal a3 = new Animal(2 , "Maxo" , 6);
        Animal a4 = new Animal(3 , "Don" , 3);


        List<Animal> dogs = new ArrayList<>();
        dogs.add(a1);
        dogs.add(a2);
        dogs.add(a3);
        dogs.add(a4);

        //Now I wanna sort this based on AGe

        System.out.println(dogs);


        Collections.sort(dogs);

        System.out.println(dogs);
    }
}

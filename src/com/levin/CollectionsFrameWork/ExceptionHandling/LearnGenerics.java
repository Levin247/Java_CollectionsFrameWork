package com.levin.CollectionsFrameWork.ExceptionHandling;

import java.util.ArrayList;

public class LearnGenerics
{
    //Fifth
    public static void main(String[] args)
    {
        Dog<String> d1 = new Dog<>("abcd123");
        Dog<String> d2 = new Dog<>("yrtf123");

        Dog<Integer> d3 = new Dog<>(12);

        System.out.println(d3.getId());


        ArrayList<Integer> a = new ArrayList<>();

    }
}

//Like see the Datatype E is to be provided now what if I wanna provide another datatype and it's object.
class Dog<E>
{
    E id;

    public Dog(E id)
    {
        this.id = id;
    }


    E getId()
    {
        return id;
    }
}

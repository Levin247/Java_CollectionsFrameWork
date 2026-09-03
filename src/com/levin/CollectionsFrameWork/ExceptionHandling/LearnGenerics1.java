package com.levin.CollectionsFrameWork.ExceptionHandling;

public class LearnGenerics1
{
    public static void main(String[] args)
    {
        Dog<String , String> d1 = new Dog<String, String>("abcd123" , "Leo");
        Dog<String , Integer> d2 = new Dog<String, Integer>("yrtf123" , 123);

        Dog<Integer , String> d3 = new Dog<Integer , String>(12 , "Leo");

    }
}

//Now this Dog class supports two parameterised types.
class Dog<E , V>
{
    //Like see now
    E id;
    V name;

    public Dog(E id ,V name)
    {
        this.id = id;
        this.name = name;
    }
}

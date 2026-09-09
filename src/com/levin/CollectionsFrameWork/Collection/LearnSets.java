package com.levin.CollectionsFrameWork.Collection;

import java.util.*;


class Student
{
    int rollno;
    String name;

    public Student(int rollno, String name)
    {
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollno == student.rollno;
    }


    @Override
    public int hashCode()
    {
        return Objects.hashCode(rollno);
    }
}
public class LearnSets
{

    enum Color
    {
        RED , YELLOW , GREEN
    }
    public static void main(String[] args)
    {
        EnumSet<Color> enumset = EnumSet.allOf(Color.class);
        Set<Student> setty  = new HashSet<>();

        setty.add(new Student(1 , "Anuj"));
        setty.add(new Student(2 , "Rahul"));
        setty.add(new Student(1 , "Anuj"));

        Student s1 = new Student(1 , "Rohith");
        Student s2 = new Student(1 , "Anuj");
        System.out.println(s1.equals(s2));

        System.out.println(setty);

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(10);
        set.add(10);
        set.add(10);
        set.add(20);

        System.out.println(set);


        set.remove(10);
        System.out.println(set);


        Set<Integer> set1 = new LinkedHashSet<>();//Here order is maintained in which u entered u entered.


        Set<Integer> set3 = new TreeSet<>();//O(logN)
        //Internally TreeSet uses a BST.
    }
}

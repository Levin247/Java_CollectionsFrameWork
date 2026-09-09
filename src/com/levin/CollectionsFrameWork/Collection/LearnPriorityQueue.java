package com.levin.CollectionsFrameWork.Collection;

import java.util.PriorityQueue;
import java.util.Queue;

//Fifth
public class LearnPriorityQueue
{
    public static void main(String[] args)
    {
        Queue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(40);
        pq.add(10);//By Default the lowest integer has highest Priority
        pq.add(20);
        System.out.println(pq);// The min heap is implemented here that's why the the queue becomes sorted.
        //Using Comparator we can make it max heap also.
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());

    }
}

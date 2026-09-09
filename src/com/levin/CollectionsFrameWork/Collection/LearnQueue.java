package com.levin.CollectionsFrameWork.Collection;

import java.util.LinkedList;
import java.util.Queue;
/*
What's the difference between offer , add and poll and remove.
 */
//Third
public class LearnQueue
{
    public static void main(String[] args)
    {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        System.out.println(queue);

        queue.offer(50);
        queue.offer(60);
        queue.offer(70);

        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue);

        System.out.println(queue.peek());



        while(!queue.isEmpty())
        {
            System.out.println(queue.poll());
        }

        System.out.println(queue.poll());
        //System.out.println(queue.remove());


    }
}

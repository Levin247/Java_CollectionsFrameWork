package com.levin.CollectionsFrameWork.Collection;

import javax.swing.plaf.DesktopIconUI;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

//Fourth
public class LearnDeque
{
    public static void main(String[] args)
    {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        //OR
        //Queue<Integer> deq = new ArrayDeque<>();//But we can call only Queue methods as Queue Implementation.
        //OR
        //Deque<Integer> deqq = new ArrayDeque<>();

        dq.offer(10);
        dq.offerLast(20);
        dq.offerFirst(30);

        System.out.println(dq);

        dq.poll();

        System.out.println(dq.poll());

        System.out.println(dq);
        System.out.println(dq.pollLast());
        System.out.println(dq);

        dq.offer(10);
        dq.offer(20);
        dq.offer(30);
        System.out.println(dq);
        System.out.println(dq.peek());




        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack.peek());



        ArrayDeque<Integer> q = new ArrayDeque<>();

        q.offer(10);
        q.offer(20);
        q.offer(30);

        System.out.println(q);
        System.out.println(q.poll());
    }
}

package com.queue.one;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class QueueApp {
    public static void main(String[] args){
        Queue theQueue = new Queue(5);

        java.util.Queue<String> queue = new LinkedList<String>();
        queue.offer("a");
        queue.poll();

        theQueue.insert(10);
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);

        theQueue.remove();
        theQueue.remove();
        theQueue.remove();

        theQueue.insert(50);
        theQueue.insert(60);
        theQueue.insert(70);
        theQueue.insert(80);

        while ( !theQueue.isEmpty()) {
            long n = theQueue.remove();
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.println(" ");
    }
}

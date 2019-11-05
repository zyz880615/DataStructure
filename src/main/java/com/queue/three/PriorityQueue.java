package com.queue.three;

public class PriorityQueue {
    private int maxSize;
    private long[] queArray;
    private int nItem;

    public PriorityQueue(int maxSize) {
        this.maxSize = maxSize;
        queArray = new long[maxSize];
        nItem = 0;
    }

    public void insert(long item){
        int j;

        if (nItem == 0){
            queArray[nItem++] = item;
        } else {
            for ( j = nItem-1; j>=0; j--){
                if (item > queArray[j]){
                    queArray[j+1] = queArray[j];
                }else {
                    break;
                }
            }
            queArray[j+1] = item;
            nItem++;
        }
    }

    public long remove(){
        return queArray[--nItem];
    }

    public long peekMin(){
        return queArray[nItem-1];
    }

    public boolean isEmpty(){
        return (nItem==0);
    }

    public boolean isFull(){
        return (nItem == maxSize);
    }
}

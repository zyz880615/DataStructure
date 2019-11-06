package com.link.two;

public class DoubleLink {

    public int key;

    public DoubleLink next;

    public DoubleLink prev;

    public DoubleLink(int key) {
        this.key = key;
    }

    public void Display() {
        System.out.println("key is " + key);
    }
}

package com.link.

public class DoubleApp {

    public static void main(String[] args){
        DoubleLinkList doubleLinkList = new DoubleLinkList();
        doubleLinkList.insert(1);
        doubleLinkList.insert(2);
        doubleLinkList.insert(3);
        doubleLinkList.insert(4);
        doubleLinkList.get(2).Display();
    }

}

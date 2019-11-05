package com.link.one;

public class LinkListApp {
    public static void main(String[] args){
        LinkList theList = new LinkList();
        theList.insert(22,2.99);
        theList.insert(44,4.99);
        theList.insert(66,6.99);
        theList.insert(88,8.99);
        theList.displayList();

        while (!theList.isEmpty()){
            Link aLink = theList.deleteFirst();
            System.out.print("Delete");
            aLink.displayLink();
            System.out.println("");
        }
        theList.displayList();
    }
}

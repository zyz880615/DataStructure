package com.link.one;

public class LinkList {
    private Link first;

    public LinkList() {
        this.first = null;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void insert(int iData, double dData){
        Link newLink = new Link(iData,dData);
        newLink.next = first;
        first = newLink;
    }

    public Link deleteFirst(){
        Link temp = first;
        first = first.next;
        return temp;
    }

    public void displayList(){
        System.out.print("List(first -> last): ");
        Link current = first;
        while (current!=null){
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}

package com.link.two;

public class DoubleLinkList {


    public DoubleLink head;

    public DoubleLinkList() {
        this.head = null;
    }

    /**
     * LIST-SEARCH(L,k)
     * 1 x = L.head
     * 2 while x != NULL and x.key != k
     * 3    x = x.next
     * 4 return x
     */
    public DoubleLink get(int data) {
        DoubleLink link = head;
        while ((link != null) && (link.key != data)) {
            link = link.next;
        }
        return link;
    }

    /**
     * LIST-INSERT(L,x)
     * 1 x.next = L.head
     * 2 if L.head != NULL
     * 3       L.head.prev = x
     * 4 L.head = x
     * 5 x.prev = NULL
     */
    public void insert(int data) {
        DoubleLink doubleLink = new DoubleLink(data);
        doubleLink.next = head;
        if (head != null) {
            head.prev = doubleLink;
        }
        head = doubleLink;
        doubleLink.prev = null;
    }

    /**
     * LIST - DELETE(L, x)
     * 1 if x.prev != NULL
     * 2       x.prev.next = x.next
     * 3 else L.head = x.next
     * 4 if x.next != NULL
     * 5       x.next.prev = x.prev
     */


}

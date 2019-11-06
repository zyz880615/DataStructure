public class LinkList {

    public Link first;

    public LinkList() {
        this.first = null;
    }

    public void insertFirst(int data) {
        Link link = new Link(data);
        link.next = first;
        first = link;
    }

    public void display() {
        Link current = first;

        while (current != null) {
            current.display();
            current = current.next;
        }
    }

    public Link delete() {
        Link temp = first;
        first = first.next;
        return temp;
    }

}

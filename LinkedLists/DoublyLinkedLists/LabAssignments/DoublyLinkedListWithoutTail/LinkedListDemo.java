package LabAssignments.DoublyLinkedListWithoutTail;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        myList.addFront(12);
        myList.addFront(14);
        myList.addFront(15);
        myList.addFront(19);
        myList.addBack(18);
        myList.addBack(20);
        myList.addBack(23);

        myList.displayForward();

        myList.deleteFront();
        myList.displayForward();
    }
}

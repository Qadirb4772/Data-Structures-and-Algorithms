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

        myList.deleteBack();
        myList.displayForward();

        if(myList.searchNode(48)){
            System.out.println("Node Found");
        }else{
            System.out.println("Node not found");
        }

        myList.deleteNode(20);
        myList.displayForward();
        myList.displayBackward();

         myList.updateNode(14, 4);
         myList.displayForward();
         //myList.displayBackward();
    }
}

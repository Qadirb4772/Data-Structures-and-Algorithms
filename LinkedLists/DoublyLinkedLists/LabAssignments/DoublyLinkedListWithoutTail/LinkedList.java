package LabAssignments.DoublyLinkedListWithoutTail;

public class LinkedList {
    private Node head;

    //method for adding at the beginning
    public void addFront(int data){
        Node node = new Node(data);
        if(head == null){
            this.head = node;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
    }

    //method for adding at the end
    public void addBack(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node node = head;

        while(node.next != null){
            node = node.next;
        }

        node.next = newNode;
        newNode.prev = node;
    }

    //method for deleting the first element of the list
    public void deleteFront(){
        if(head != null){
            head = head.next;
            head.prev = null;
            return;
        }
        System.out.println("Nothing to be deleted List is empty");
    }

    //method for deleting the last element of the list
    public void deleteBack(){
        
    }
    //method for displaying data in forward order
    public void displayForward(){
        Node node = head;
        System.out.print("NULL <-> ");
        while(node != null){
            System.out.print(node.data+" <-> ");
            node = node.next;
        }
        System.out.println("NULL");
    }

    private static class Node{
        private int data;
        private Node next;
        private Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
}

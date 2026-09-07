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
        Node node = head;
        while(node.next.next != null){
            node = node.next;
        }
        node.next = null;
    }

    //method for searching in the linkedList
    public boolean searchNode(int data){
        Node node = head;
        while(node != null){
            if(node.data == data){
                return true;
            }
            node = node.next;
        }
        return false;
    }

    //method for deleting node with parameter data
    public void deleteNode(int data){
        Node node = head;
        if(node.data == data){
            deleteFront();
            return;
        }
        while(node.next != null && node.next.data != data){
            node = node.next;
        }
        if(node.next != null){
            node.next = node.next.next;
            if(node.next != null)
                node.next.prev = node;
            return;
        }
    }

    //method for adding data before a particular data
    public void addBefore(int targetData, int data){
        Node newNode = new Node(data);

        Node node = head;
        if(node.data == targetData){
            addFront(data);
            return ;
        }
        while(node.next != null && node.next.data != targetData){
            node = node.next;
        }
        if(node != null){
            newNode.next = node.next;
            node.next = newNode;
            newNode.prev = node;
            newNode.next.prev = newNode;
            
        }
    }

    //method for adding data after a particular data
    public void addAfter(int targetData, int data){
        Node newNode = new Node(data);

        Node node = head;
        
        while(node.next != null &&node.data != targetData){   
            node = node.next;
        }

        if(node != null){
            newNode.next = node.next;
            node.next = newNode;
            newNode.prev = node;
            newNode.next.prev = newNode;
            
        }
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

    //method for display data in reverse order
    public void displayBackward(){
        Node node = head;
        while(node.next != null){
            node = node.next;
        }

        System.out.print("NULL <-> ");
        while(node != null){
            System.out.print(node.data+" <-> ");
            node = node.prev;
        }
        System.out.println("NULL");
    }

    //method for updating a particular node
    public void updateNode(int targetData, int data){
        Node node = search(targetData);
        if(node != null){
            node.data = data;
        }else{
            System.out.println("No data such exists");
        }
    }

    public Node search(int data){
        Node node = head;
        while(node != null){
            if(node.data == data){
                return node;
            }
            node = node.next;
        }
        return null;
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

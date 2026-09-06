package LabAssignments;
class CLinkedList{
    Node head;

    CLinkedList(){
        this.head = null;
    }

    public void addFront(int data){
        Node newNode = new Node(data);
        if(head != null){
            Node n = head;
            while(n.next != head){
                n = n.next;
            }
            newNode.next = head;
            head = newNode;
            n.next = newNode;
        }else{
            head = newNode;
            newNode.next = head;
        }
    }

    public void dislayNodes(){
        Node node = head;
        if(node != null){
            System.out.print(node.data+" -> ");
        }else{
            System.out.println("List is EMPTY!!");
            return;
        }
        while(node.next != head){
            System.out.print(node.next.data+" -> ");
            node = node.next;
        }
        System.out.println(" HEAD");
    }

    public void addBack(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            newNode.next = head;
        }else{
            Node n = head;
            while(n.next != head){
                n = n.next;
            }
            newNode.next = head;
            n.next = newNode;
        }
    }

    public void deleteFront(){
        if(head == null){
            System.out.println("List is EMPTY!! Nothing to be deleted!!");
            return;
        }
        Node n = head;
        while (n.next != head) {
            n = n.next;
        }
        n.next = head.next;
        head = head.next;
    }

    public void deleteBack(){
        Node n = head;
        while(n.next.next != head){
            n = n.next;
        }
        n.next = head;
    }

    public Node searchNode(int data){
        Node n = head;
        if(n.data == data){
            return n;
        }
        while(n.next != head){
            if(n.next.data == data){
                return n.next;
            }
            n = n.next;
        }
        return null;
    }

    public void deleteNode(int data){
        Node n = searchNode(data);
        if(n != null){
            Node node = head;
            if(node.data == data){
                deleteFront();
                return;
            }
            while(node.next != head && node.next.data != data){
                node = node.next;
            }
            node.next = node.next.next;
        }else{
            System.out.println("No Such Node Exists");
        }
    }

    public void addAfter(int targetData, int data){
        Node newNode = new Node(data);
        Node node = head;
        Node search = searchNode(targetData);
        if(search == null){
            System.out.println("No Such node with data: "+targetData+" exists");
            return;
        }
        if(node.data == targetData){
            newNode.next = node.next;
            node.next = newNode;
            return;
        }

        while(node.next != head && node.next.data != targetData){
            node = node.next;
        }
        newNode.next = node.next.next;
        node.next.next = newNode;
    }

    private class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
}
public class CircularLinkedListWithoutTail {
    public static void main(String[] args) {
        CLinkedList list = new CLinkedList();
        list.addFront(12);
        list.addFront(18);
        list.addBack(8);

        list.dislayNodes();

        list.deleteBack();
        list.dislayNodes();

        list.addAfter(18, 13);
        list.dislayNodes();
       
    }
}

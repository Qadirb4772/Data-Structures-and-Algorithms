package LabAssignments;
class CLinkedList{
    Node head;
    Node tail;
    CLinkedList(){
        this.head = null;
        this.tail = null;
    }

    public void addFront(int data){
        Node newNode = new Node(data);
        if(head != null){
            newNode.next = head;
            head = newNode;
            tail = newNode;
        }else{
            head = newNode;
            tail = newNode;
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
        if(tail == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            tail.next = newNode;
        }
    }

    public void deleteFront(){
        if(head == null){
            System.out.println("List is EMPTY!! Nothing to be deleted!!");
            return;
        }
        
        tail.next = head.next;
        head = head.next;
    }

    public void deleteBack(){
        Node n = head;
        while(n.next.next != head){
            n = n.next;
        }
        tail = n.next;
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

    public void addBefore(int targetData, int data){
        Node newNode = new Node(data);
        Node n = head;
        Node search = searchNode(targetData);
        if(search == null){
            System.out.println("No Such node with data: "+targetData+" exists");
            return;
        }
        if(n.data == targetData){
            addFront(newNode.data);
            return;
        }
        while(n.next.data != targetData){
            n = n.next;
        }
        if(n != head){
            newNode.next = n.next;
            n.next = newNode;
        }else{
            addBack(newNode.data);
        }
    }

    public void updateNode(int data, int newData){
        Node search = searchNode(data);
        if(search == null){
            System.out.println("No Such node with data: "+data+" exists");
            return;
        }
        search.data = newData;
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
public class CircularLinkedListWithTail {
    public static void main(String[] args) {
        CLinkedList list = new CLinkedList();
        list.addBack(0);
        list.addBack(1);
        list.addBack(2);

        list.dislayNodes();

      list.deleteNode(1);
      list.dislayNodes();

      if(list.searchNode(2) != null){
        System.out.println("Data Found");
      }else{
        System.out.println("Data Not Found");
      }

      list.addAfter(2, 10);
      list.dislayNodes();

      list.addBefore(10, 5);
      list.dislayNodes();
    }
}

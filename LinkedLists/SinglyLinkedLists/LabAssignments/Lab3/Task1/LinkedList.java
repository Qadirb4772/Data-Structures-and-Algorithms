package LabAssignments.Lab3.Task1;

public class LinkedList implements List{
    Node head;
    int size;

    LinkedList(){
        this.head = null;
        this.size = 0;
    }

    @Override
    public int size(){
        return this.size;
    }

    @Override 
    public boolean isEmpty(){
        return head == null;
    }
    
    @Override
    public void add(Node n){
        Node current = head;
        if(current == null){
            head = n;
            ++size;
            System.out.println("Node added Successfully!");
            return;
        }

        while(current.next != null){
            current = current.next;
        }
        current.next = n;
        ++size;
        System.out.println("Node Added Successfully!");
    }

    @Override 
    public void add(int data, Node n){
        Node current = head;
        while(current != null){
            if(current.data == data){
                if(current.next == null){
                    current.next = n;
                }else{
                    n.next = current.next;
                    current.next = n;
                }
                ++size;
                System.out.println("Node Added Successfully");
                return;
            }
            current = current.next;
        }
        System.out.println("No Such Node with Data: "+data+" Exists");
    }

    @Override
    public void remove(int data){
        Node node = head;
        if(node.data == data){
            head = head.next;
            --size;
            System.out.println("Node Removed Successfully");
            return;
        }
        while(node != null){
            if(node.next.data == data){
                node.next = node.next.next;
                --size;
                System.out.println("Node Removed Successfully");
                break;
            }
            node = node.next;
        }
        if(node == null){
            System.out.println("No Such Node with data: "+data+" exists");
        }
    }

    @Override
    public void remove(Node n){
        Node node = head;
        if(node.data == n.data){
            head = head.next;
            --size;
            System.out.println("Node Removed Successfully");
            return;
        }
        while(node != null){
            if(node.next.data == n.data){
                node.next = node.next.next;
                --size;
                System.out.println("Node Removed Successfully");
                break;
            }
            node = node.next;
        }
        if(node == null){
            System.out.println("No Such Node with data: "+n.data+" exists");
        }
    }

    @Override
    public LinkedList duplicate(){
        LinkedList list = new LinkedList();
        Node node = head;
        while(node != null){
            list.add(new Node(node.data));
            node = node.next;
        }
        return list;
    }

    @Override
    public LinkedList duplicateReverse(){
        LinkedList list = new LinkedList();
        Node node = head;
        while(node != null){
            list.addFirst(new Node(node.data));
            node = node.next;
        }
        return list;
    }

   public void addFirst(Node n){
        if(head != null){
            n.next = head;
        }
        head = n;
        ++size;
        System.out.println("Node added successfully!");
   }
   @Override
   public String toString(){
        StringBuilder list = new StringBuilder();/* This is usedto reduce multiple String object creations*/
        list.append("[size: "+this.size+" - ");
        Node n = head;
        while(n != null){
            if(n.next != null){
                list.append(n.data+", ");
            }else{
                list.append(n.data);
            }
            n = n.next;
        }
        list.append("]");
        return list.toString();//returning after converting the StringBuilder to String

   }
}

package LabAssignments.Lab3.Task2;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        Node node1 = new Node(12);
        Node node2 = new Node(19);
        Node node3 = new Node(18);

        list.add(node1);
        list.add(node2);
        list.add(node3);

        System.out.println(list);

        LinkedList dupLinkedList = list.duplicate();
        System.out.println(dupLinkedList);
        LinkedList reversedLinkedList = list.duplicateReverse();
        System.out.println(reversedLinkedList);
        
    }
}

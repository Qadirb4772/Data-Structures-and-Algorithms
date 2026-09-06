package LabAssignments.Lab3.Task1;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Node n0 = new Node(12);
        Node n1 = new Node (14);
        Node n2 = new Node(15);
        list.add(n0);
        list.add(n1);
        list.add(14, n2);

        System.out.println(list);

        list.remove(14);
        System.out.println(list);


        System.out.println();
        LinkedList dupLinkedList = list.duplicate(); 
        System.out.println(dupLinkedList);

        System.out.println();
        LinkedList duplicateReverse = list.duplicateReverse();

        duplicateReverse.addFirst(new Node(100));
        System.out.println(duplicateReverse);
        



    }
}

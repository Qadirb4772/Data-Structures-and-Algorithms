package LabAssignments.Lab3.Task2;


public interface List {
    boolean isEmpty();
    int size();
    void add(Node n);
    void add(int data, Node n);
    void remove(int data);
    void remove(Node n);

    LinkedList duplicate();
    LinkedList duplicateReverse();

}

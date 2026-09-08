package LabAssignments.studentManagementSystem;

public class StudentManager {
    private Node head;
    private Node tail;

    public StudentManager(){
        this.head = null;
        this.tail = null;
    }

    //method for adding student at front
    public void addStudentFront(Student std){
        Node newNode = new Node(std);
        if(head == null){
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    //method for adding student at end
    public void addStudentBack(Student std){
        Node node = new Node(std);
        if(tail == null){
            tail = node;
            head = node;
            return;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    //method for deleting front student
    public void deleteStudentFront(){
        if(head == null){
            System.out.println("Record is Empty!! Nothing to be deleted");
            return ;
        }
        head = head.next;
        head.prev = null;
    }

    //method for deleting last student
    public void deleteStudentBack(){
        if(tail == null){
            System.out.println("Record is Empty! Nothing to be deleted");
            return;
        }
        tail = tail.prev;
        tail.next = null;
    }

    //method for deleting a particular node with id
    public void deleteStudent(int stdId){
        if(tail.student.getStudentId() == stdId){
            deleteStudentBack();
            return;
        }
        if(head.student.getStudentId() == stdId){
            deleteStudentFront();
            return;
        }
        Node node = head;
        Node n = null;
        while(node != null){
            if(node.student.getStudentId() == stdId){
                n = node;
                break;
            }
            node = node.next;
        }
        if(node != null){
            n.prev.next = null;
            n.prev = null;
        }else{
            System.out.println("No Student exists with ID: "+stdId);
        }
    }

    //method for searching student
    public void searchStudent(int stdId){
        Node node = head;
        while(node != null){
            if(node.student.getStudentId() == stdId){
                node.student.displayInfo();
                return;
            }
            node = node.next;
        }
        System.out.println("No Student with ID: "+stdId+" exists in the list");
    }

    //method for displaying students forward
    public void displayStudentsForward(){
        Node node = head;
        while(node != null){
            System.out.println("__________________");
            node.student.displayInfo();
            System.out.println("__________________\n\n");
            node = node.next;
        }
    }
    private static class Node{
        private Student student;
        private Node next;
        private Node prev;

        public Node(Student std){
            this.student = std;
            this.next = null;
            this.prev = null;
        }
    }
}

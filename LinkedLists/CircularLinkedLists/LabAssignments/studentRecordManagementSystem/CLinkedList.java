package LabAssignments.studentRecordManagementSystem;

public class CLinkedList{
  private Node head;
  

  public CLinkedList(){
    this.head = null;
  }
  

public class Node{
  private Student std;
  Node next;
  
  public Node(Student std){
    if(std != null){
      this.std = std;
    }
    this.next = null;
  }

  public Student getStudent(){
    return this.std;
  }

  public void setStudent(Student st){
    this.std = st;
  }
}


  public void addStudentFront(Student s){
    Node n = new Node(s);
    if(head != null){
      Node node = head;
      while(node.next != head){
        node = node.next;
      }
      n.next = head;
      head = n;
      node.next = head;
    }else{
      head = n;
      n.next = head;
    }
  }

  public Student searchStudent(int stdId){
    Node node = head;
    if(node == null){
        System.out.println("No Such Student Found");
        return null;
    }
    if(node.getStudent().getStudentId() == stdId){
        return node.getStudent();
    }

    while(node.next != head){
        if(node.next.getStudent().getStudentId() == stdId){
            return node.next.getStudent();
        }
        node = node.next;
    }
    return null;
  }

  
  public void addStudentBack(Student s){
    Node n = new Node(s);
    Node node = head;
    while(node.next != head){
        node = node.next;
    }
    node.next = n;
    n.next = head;
  }
  
  public void deleteStudentFront(){
    if(head != null){
      Node node = head;
      while(node.next != head){
        node = node.next;
      }
      head = head.next;
      node.next = head;      
    }else{
      System.out.println("Nothing to be deleted!!");
      return;
    }
  }
  
  //56(0)(head) -> 89(1) -> 32(2) -> 67(3)(tail)
  public void deleteStudentBack(){
    Node n = head;
    while(n.next.next != head){
        n = n.next;
    }
    n.next = head;
  }
  
  public void displayStudents(){
    Node n = head;
    if(n != null){
        n.getStudent().displayInfo();
    }else{
        System.out.println("No Student Exists!!");
        return;
    }

    while(n.next != head){
      n.next.getStudent().displayInfo();
      n = n.next;
    }
  }
  
  public void updateStudent(int id, Student std){
    Node n = head;
    Student student = searchStudent(id);
    if(student == null){
        System.out.println("No student with ID: "+id+" exists");
        return;
    }
    if(n.getStudent().getStudentId() == id){
        n.setStudent(std);
    }
    while(n.next != head){
        if(n.next.getStudent().getStudentId() == id){
            n.next.setStudent(std);
            return;
        }
        n = n.next;
    }
  }


  public void deleteStudent(int stdId){
    Node n = head;
    if(n.getStudent().getStudentId() == stdId){
        deleteStudentFront();
        return;
    }
    while(n.next != head && n.next.getStudent().getStudentId() != stdId){
        n = n.next;
    }
    n.next = n.next.next;
  }
  
 
  public void addStudentAfter(int id, Student std){
    Node newNode = new Node(std);

    Node node = head;
    if(node.getStudent().getStudentId() == id){
      newNode.next = node.next;
      node.next = newNode;
      
      return;
    }
    while(node.next != head && node.next.getStudent().getStudentId() != id){
      node = node.next;
    }
    newNode.next = node.next.next;
    node.next.next = newNode;
  }
  

  public void addStudentBefore(int id, Student std){
    Node newNode = new Node(std);

    Node node = head;
    if(node.getStudent().getStudentId() == id){
      addStudentFront(std);
      return;
    }
    while(node.next != head && node.next.getStudent().getStudentId() != id){
      node = node.next;
    }
    newNode.next = node.next;
    node.next = newNode;
  }
}



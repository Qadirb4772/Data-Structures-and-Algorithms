package Queues.Problems;

class Queue{
    private Node front;
    private Node rear;
    private int size;
    private static final int totalSize = 10; //this variable is created for implementation of isFull() method. Otherwise we cannot decide whether the Queue is full or not 


    public Queue(){
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    //method for putting an element inside the queue
    public void enqueue(int data){
        Node node = new Node(data);
        if(!isFull()){
            if(front == null){
                front = node;
                rear = node;
            }else{
                node.next = front;
                front = node;
            }
            ++size;
        }else{
            System.out.println("The Queue is Full");
        }
    }

    //method for removing an element from the queue
    public void dequeue(){
        if(!isEmpty()){
            Node node = front;
            while(node.next.next != null){
                node = node.next;
            }
            node.next = null;
            rear = node;
            --size;
        }else{
            System.out.println("Queue is Empty!!");
        }
    }

    //method for checking whether queue is full or not
    public boolean isFull(){
        return size > totalSize;
    }

    //method for checking whether queue is empty or not
    public boolean isEmpty(){
        return front == null;
    }

    //method for displaying queue
    public void displayQueue(){
        Node node = front;
        System.out.print("NULL -> ");
        while(node != null){
            System.out.print(node.data+" -> ");
            node = node.next;
        }
        System.out.println("NULL");
    }

    //method for getting the peek element
    public int peek(){
        return front.data;
    }
    //method for getting the size of the queue
    public int size(){
        return this.size;
    }
    private class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }    
}
public class QueueUsingLinkedList {
    public static void main(String[] args){
        Queue queue = new Queue();
        queue.enqueue(12);
        queue.enqueue(14);
        queue.enqueue(18);
        queue.enqueue(18);

        queue.displayQueue();

        queue.dequeue();
        queue.displayQueue();

        System.out.println(queue.isFull());

        System.out.println("Size of the queue is: "+queue.size());
        System.out.println("Peek of the queue is: "+queue.peek());
    }
}

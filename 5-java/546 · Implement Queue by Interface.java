// use singly linkedlist

class Node{
    int val = -1;
    Node next = null;
    public Node(){
    }
    public Node(int val){
        this.val = val;
    }
}

interface InterfaceQueue {
    void push(int element);

    // define an interface for pop method
    /* write your code here */
    int pop();

    // define an interface for top method
    /* write your code here */
    int top();
}

public class MyQueue implements InterfaceQueue {
    /* you can declare your private attributes here */
    private Node head;
    private Node tail;
    private int size = 0;

    public MyQueue() {
       // do initialization if necessary
       head = new Node();
       tail = new Node();
    }

    // implement the push method
    /* write your code here */
    @Override
    public void push(int val) {
       if (size==0){
           head = new Node(val);
           tail = new Node(val);
       } else if (size ==1){
           tail = new Node(val);
           head.next = tail;
       } else {
           Node tmp = new Node(val);
           tail.next = tmp;
           tail = tmp;
       }
       size ++;
    }
	
    // implement the pop method
    /* write your code here */
    @Override
    public int pop() {
        int tmp = head.val;
        head = head.next;
        size --;
        if (size == 0){
            tail = null; // null tail also
        } else if (size == 1){
            tail = head;
            head.next = null;
        }
        return tmp;
    }
    
	// implement the top method
    /* write your code here */
    @Override
    public int top() {
        return head.val;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue queue = new MyQueue();
 * queue.push(123);
 * queue.top(); will return 123;
 * queue.pop(); will return 123 and pop the first element in the queue
 */
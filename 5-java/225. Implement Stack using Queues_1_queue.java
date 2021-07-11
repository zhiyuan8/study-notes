class MyStack {
    // push O(n) pop O(1) top O(1)
    // after you add one element to the queue, rotate (n-1) element in queue to be top of added element, to make the tail be the head.
    /** Initialize your data structure here. */
    private Queue<Integer> queue = new LinkedList<Integer>();
    
    public MyStack() {
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        // add
        queue.add(x);
        // rotate
        for (int i=1; i<queue.size(); i++){ // start from i=1!!! rotate (n-1) elements!!!
            queue.add(queue.poll());
        }
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue.poll();
    }
    
    /** Get the top element. */
    public int top() {
        return queue.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
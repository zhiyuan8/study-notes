class MyQueue {
    // implement by 1 stack, each time when add, pop all elements out to a temporary stack, then push new elment, next push back temprorary stack to the original stack
    private Stack<Integer> stack = new Stack<>();
    
    /** Initialize your data structure here. */
    public MyQueue() {   
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        Stack<Integer> tmp = new Stack<>();
        for (int i=0; i<stack.size(); i++){
            tmp.add(stack.pop());
        }
        stack.add(x);
        while (!tmp.isEmpty()){
            stack.add(tmp.pop());
        }
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return stack.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        return stack.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
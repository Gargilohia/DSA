class MyQueue {
    Stack<Integer> pushqueue;
    Stack<Integer> popqueue;
    
    public MyQueue() {
        pushqueue = new Stack<>();
        popqueue = new Stack<>();
    }
    
    public void push(int x) {
        if(!popqueue.empty())
            while(!popqueue.empty())
                pushqueue.push(popqueue.pop());
        pushqueue.push(x); 
    }
    
    public int pop() {
        if(!pushqueue.empty())
            while(!pushqueue.empty())
                popqueue.push(pushqueue.pop());
        int ele = popqueue.pop();
        return ele;
    }
    
    public int peek() {
        if(!pushqueue.empty())
            while(!pushqueue.empty())
                popqueue.push(pushqueue.pop());
        int ele = popqueue.peek();
        return ele;
    }
    
    public boolean empty() {
        if(popqueue.empty() && pushqueue.empty())
            return true;
        else return false;
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
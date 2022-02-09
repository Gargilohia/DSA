class MinStack {
    Stack<Integer> minval;
    Stack<Integer> minstack;
    public MinStack() {
        minstack = new Stack<>();
        minval = new Stack<>();
    }
    
    public void push(int val) {
        minstack.push(val);
        if(minval.isEmpty() || minval.peek()>=val)
            minval.push(val);
    }
    
    public void pop() {
        if(minstack.peek().equals(minval.peek())){
            minval.pop();
            minstack.pop();
        }
        else minstack.pop();
        
    }
    
    public int top() {
        return minstack.peek();
    }
    
    public int getMin() {
        return minval.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
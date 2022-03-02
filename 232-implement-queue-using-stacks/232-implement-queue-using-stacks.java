class MyQueue {
    private Stack<Integer> inp=new Stack();
    private Stack<Integer> out=new Stack();
    public MyQueue() {
            
    }
    
    public void push(int x) {
        inp.push(x);    
    }
    
    public int pop() {
        if(!empty()){
        int op=peek();
        out.pop();            
        return op;
        }
        return -1;
    }
    
    public int peek() {
        if(out.empty())
            while(!inp.empty())
                out.push(inp.pop());
        return out.peek();
    }
    
    public boolean empty() {
        return (inp.empty() && out.empty());
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
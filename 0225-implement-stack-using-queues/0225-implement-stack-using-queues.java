class MyStack {
    private LinkedList<Integer> single=new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        single.add(x);
        int size=single.size();
        while(size>1){
            single.add(single.remove());
            size--;
        }
    }
    
    public int pop() {
        return single.remove();
    }
    
    public int top() {
        return single.peek();
    }
    
    public boolean empty() {
        return single.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
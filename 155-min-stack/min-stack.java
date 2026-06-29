class MinStack {
    Deque<int[]> queue;

    public MinStack() {
        queue = new ArrayDeque<>();
    }
    
    public void push(int val) {
        int min = queue.isEmpty() ? val : Math.min(queue.peek()[1], val);
        queue.push(new int[] {val, min});
    }
    
    public void pop() {
        queue.pop();
    }
    
    public int top() {
        return queue.peek()[0];
    }
    
    public int getMin() {
        return queue.peek()[1];
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
class MinStack 
{
    Stack<Integer> stk=new Stack<>();
    Stack<Integer> minstk=new Stack<>();


    public MinStack() {
        
        
    }
    
    public void push(int val) {
        stk.push(val);

        if(minstk.isEmpty()|| val<=minstk.peek())
        {
            minstk.push(val);
        }
        else {
        // Otherwise, push the same min again to keep sizes equal
        minstk.push(minstk.peek());
    }
        
    }
    
    public void pop() {
        
        stk.pop();
        minstk.pop();
    }
    
    public int top() {
        
        int a=stk.peek();
        return a;
    }
    
    public int getMin() {
        return minstk.peek();

        

       
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
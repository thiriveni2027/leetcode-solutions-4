class MyQueue {
    Stack <Integer> main=new Stack<>();
    Stack <Integer> help=new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        main.push(x);
    }
    
    public int pop() {
        while(main.size()!=1){
            help.push(main.pop());
        }
        int val=main.pop();
        while(help.size()!=0){
            main.push(help.pop());
        }
        return val;
    }
    
    public int peek() {
        while(main.size()!=1){
            help.push(main.pop());
        }
        int val=main.pop();
        main.push(val);
        while(help.size()!=0){
            main.push(help.pop());
        }
        return val;
    }
    
    public boolean empty() {
        return main.size()==0;
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
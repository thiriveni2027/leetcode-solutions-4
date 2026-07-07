class MyStack {
    Queue<Integer> main=new LinkedList<>();
    Queue<Integer> help=new LinkedList<>();


    public MyStack() {


        
    }
    
    public void push(int x) {
        main.add(x);
        
    }
    
    public int pop() {
        while(main.size()!=1){
            help.add(main.remove());

        
    }
    int val=main.remove();
    while(help.size()!=0){
        main.add(help.remove());
    }
    return val;
    }
    
    public int top() {
        while(main.size()!=1){
            help.add(main.remove());

        
    }
    int val=main.remove();
    while(help.size()!=0){
        main.add(help.remove());
    }
    main.add(val);
    return val;
    
        
    }
    
    public boolean empty() {
        return main.size()==0;
        
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
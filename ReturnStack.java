public class ReturnStack {
    public class RsNode{
        ReturnRequest data;
        RsNode link;
        RsNode next;
    }
    RsNode top;
    ReturnStack(){ this.top = null; }
    // İnserting an element in stack
    public void push(ReturnRequest request){
        RsNode temp = new RsNode();
        if(temp == null){
            System.out.println("Stack Overflow");
            return;
        }
        temp.data = request;
        temp.link = top;
        top = temp;
    }
    // İs empty for checking stack
    public boolean isEmpty(){return top == null;}
    // Looking top of stack
    public ReturnRequest peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }

        return top.data;
    }
    // Removing
    public void pop(){
        if(top == null){
            System.out.println("Stack underflow");
            return;
        }
        top = (top).link;
    }
    // Printing
    public void printStack(){
        if(top == null){
            System.out.println("Stack underflow");
            return;

        }else{
            RsNode temp = top;
            System.out.println("Current stack: ");
            while (temp != null){

                System.out.println(temp.data);
                temp = temp.link;

            }

        }

    }
}

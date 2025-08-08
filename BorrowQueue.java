public class BorrowQueue{
    // Node for borrow queue
    public class BrNode{
        BorrowRequest data;
        BrNode next;
        BrNode(BorrowRequest data){
            this.data = data;
            this.next = null;
        }
    }
    public BrNode front;
    public BrNode rear;
    public int size;
    public BorrowQueue(){
        front = null;
        rear = null;
        size = 0;
    }
    // Enqueue from borrow request
    public void enqueue(BorrowRequest request){
        BrNode newNode = new BrNode(request);
        if (isEmpty()){
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        size++;
    }
    // Dequeue from current request
    public BorrowRequest dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        BorrowRequest request = front.data;
        front = front.next;
        size--;
        if(isEmpty()){
            rear = null;
        }
        return request;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public int size(){
        return size;
    }
    // Printing
    public void printQueue(){
        BrNode last = front;
        while (last !=null ){
            System.out.println(last.data + "");
            last = last.next;
        }
        System.out.println();
    }
}
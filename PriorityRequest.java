public class PriorityRequest extends BorrowRequest{
    boolean isPriority;
    public PriorityRequest(int userId, int bookId, boolean isPriority){
        super(userId,bookId);
        this.isPriority = isPriority;

    }
    public String toString(){
        return "(Priority: " + isPriority + ") " + super.toString();
    }
}


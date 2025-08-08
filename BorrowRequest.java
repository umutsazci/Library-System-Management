public class BorrowRequest {
    int userId;
    int bookId;
    long requestTime;
    public BorrowRequest(int userId, int bookId){
        this.userId = userId                        ;
        this.bookId = bookId                        ;
        this.requestTime= System.currentTimeMillis();
    }
    public String toString(){
        return "User ID: " + userId + " Book ID: " + bookId + " Request time: " + requestTime;
    }
}

public class ReturnRequest {
    int bookId;
    long returnTime;
    public ReturnRequest(int bookId){
        this.bookId = bookId;
        this.returnTime = System.currentTimeMillis();

    }
    public String toString(){
        return "Book ID: " + bookId + " Return time: " + returnTime ;
    }
}

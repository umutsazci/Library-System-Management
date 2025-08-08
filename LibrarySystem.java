public class LibrarySystem {
    public static void main(String[] args){
        // Adding 10 book
        BookList bookList = new BookList();
        bookList.addBook(new Book(1, "Onyx Storm", "Rebecca Yarros"));
        bookList.addBook(new Book(2, "Sunrise on the Reaping", "Suzanne Collins"));
        bookList.addBook(new Book(3, "Great Big Beautiful Life", "Emily Henry"));
        bookList.addBook(new Book(4, "The Crash", " Freida McFadden"));
        bookList.addBook(new Book(5, "The Housemaid", "Freida McFadden") );
        bookList.addBook(new Book(6, "It Ends with Us", "Colleen Hoover"));
        bookList.addBook(new Book(7, "Lessons in Chemistry", "Bonnie Garmus"));
        bookList.addBook(new Book(8, "The Silent Patient", "Alex Michaelides"));
        bookList.addBook(new Book(9, "Fourth Wing", "Rebecca Yarros"));
        bookList.addBook(new Book(10, "A Court of Thorns and Roses", "Sarah J. Maas"));

        // 5 normal and 3 priority requests
        PriorityQueue borrowQueue = new PriorityQueue();
        borrowQueue.enqueue(new PriorityRequest(1, 1, false));
        borrowQueue.enqueue(new PriorityRequest(2, 3, true));
        borrowQueue.enqueue(new PriorityRequest(3, 2, false));
        borrowQueue.enqueue(new PriorityRequest(4, 4, true));
        borrowQueue.enqueue(new PriorityRequest(5, 6, false));
        borrowQueue.enqueue(new PriorityRequest(6, 5 ,true));
        borrowQueue.enqueue(new PriorityRequest(7, 7, false));
        borrowQueue.enqueue(new PriorityRequest(8, 10, false));

        // Return 2 requests
        ReturnStack returnStack = new ReturnStack();
        returnStack.push(new ReturnRequest(1));
        returnStack.push(new ReturnRequest(10));

        // Process 3 borrow requests
        for (int i=0; i < 3; i++ ){
            BorrowRequest process = borrowQueue.dequeue();
            System.out.println("Processed ; " + process );
            returnStack.push(new ReturnRequest(process.bookId));

        }
        // Print BookList
        System.out.println("Books ");
        bookList.printList();
        // Print BorrowQueue
        System.out.println("Borrow queue ");
        borrowQueue.printQueue();
        // Print ReturnStack
        System.out.println("Return stack ");
        returnStack.printStack();

    }
}

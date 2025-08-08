//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BookList bookList = new BookList();
        BorrowQueue queue = new BorrowQueue();
        ReturnStack stack = new ReturnStack();



        bookList.addBook(new Book(1, "Onyx Storm", "Rebecca Yarros"));
        bookList.addBook(new Book(2, "Sunrise on the Reaping", "Suzanne Collins"));
        bookList.addBook(new Book(3, "Great Big Beautiful Life", "Emily Henry"));
        bookList.addBook(new Book(4, "The Crash", " Freida McFadden"));
        bookList.addBook(new Book(5, "The Housemaid", "Freida McFadden") );



        bookList.removeBook(5);
        System.out.println(" ID 5 book is: ");
        Book find = bookList.findBook(5);
        if (find != null){
            System.out.println(find);
        }
        else {
            System.out.println("Not here");
        }
        System.out.println("\nFinal book list");
        bookList.printList();
        BorrowRequest firstBookRequest = new BorrowRequest(1, 5);
        BorrowRequest secondBookRequest = new BorrowRequest(2, 3);
        BorrowRequest thirdBookRequest = new BorrowRequest(3,3);
        BorrowRequest fourthBookRequest = new BorrowRequest(4, 5);
        BorrowRequest fifthBookRequest = new BorrowRequest(5, 1);
        BorrowRequest sixthBookRequest = new BorrowRequest(6, 1);
        BorrowRequest seventhBookRequest = new BorrowRequest(7, 2);
        BorrowRequest eighthBookRequest = new BorrowRequest(8, 3);
        BorrowRequest ninethBookRequest = new BorrowRequest(9, 4);
        BorrowRequest tenthBookRequest = new BorrowRequest(10, 5);
        queue.enqueue(new BorrowRequest(1,2));
        queue.enqueue(firstBookRequest);
        queue.enqueue(secondBookRequest);
        queue.enqueue(thirdBookRequest);
        queue.enqueue(fourthBookRequest);
        queue.enqueue(fifthBookRequest);
        queue.enqueue(sixthBookRequest);
        queue.enqueue(seventhBookRequest);
        queue.enqueue(eighthBookRequest);
        queue.enqueue(ninethBookRequest);
        queue.enqueue(tenthBookRequest);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.printQueue();
        ReturnRequest firstRequest = new ReturnRequest(1);
        ReturnRequest secondRequest = new ReturnRequest(2);
        ReturnRequest thirdRequest = new ReturnRequest(3);
        ReturnRequest fourthRequest = new ReturnRequest(4);
        ReturnRequest fifthRequest = new ReturnRequest(5);

        stack.push(firstRequest);
        stack.push(secondRequest);
        stack.push(thirdRequest);
        stack.push(fourthRequest);
        stack.push(fifthRequest);
        stack.pop();
        stack.pop();

        stack.printStack();


    }
}
public class BookList {
    // Node for book
    public class BookNode {
        Book book;
        BookNode next;
        BookNode(Book book) {
            this.book = book;
            this.next = null;
        }

    }
    public BookNode head;
    // İnsert book
    public void addBook(Book book) {
        BookNode newNode = new BookNode(book);
        if (head == null) {
            head = newNode;
        } else {
            BookNode last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }
    // Remove book from id
    public void removeBook(int id){
        if (head == null) return;
        if (head.book.bookId == id){
            head = head.next;
            return;
        }
        BookNode last = head;
        while (last.next != null && last.next.book.bookId != id){
            last = last.next;


        }
        if (last.next != null){
            last.next = last.next.next;
        }
    }
    // Find book by id
    public Book findBook(int id){
        BookNode last = head;
        while (last != null){
            if (last.book.bookId == id){
                return last.book;
            }
            last = last.next;
        }
        return null;
    }
    // Print current list
    public void printList(){
        BookNode last = head;
        while (last != null){
            System.out.println(last.book);
            last = last.next;
        }
    }


    }



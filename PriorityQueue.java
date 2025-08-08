public class PriorityQueue {

    // Node for the priority queue
    public static class PrNode {
        PriorityRequest data;
        PrNode next;

        PrNode(PriorityRequest data) {
            this.data = data;
            this.next = null;
        }
    }

    public PrNode priorityFront;
    public PrNode priorityRear;
    public PrNode normalFront;
    public PrNode normalRear;
    public int size;

    public PriorityQueue() {
        this.priorityFront = null;
        this.priorityRear = null;
        this.normalFront = null;
        this.normalRear = null;
        this.size = 0;
    }


    public void enqueue(PriorityRequest request) {
        PrNode newNode = new PrNode(request);
        // Enqueue for the priority queue
        // No need to isEmpty because useless for inserting
        if (request.isPriority) {
            if (priorityFront == null) {
                priorityFront = newNode;
            } else {
                priorityRear.next = newNode;
            }
            priorityRear = newNode;
        // Enqueue for the normal queue
        } else {
            if (normalFront == null) {
                normalFront = newNode;
            } else {
                normalRear.next = newNode;
            }
            normalRear = newNode;
        }
        size++;
    }

    public PriorityRequest dequeue() {
        // Checking queue is empty or not
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return null;
        }
        // Declare a request from PriorityRequest
        PriorityRequest request;
        if (priorityFront != null) {
            // Dequeue from the priority queue
            request = priorityFront.data;
            priorityFront = priorityFront.next;
            if (priorityFront == null) {
                priorityRear = null;
            }
        } else {
            // Dequeue from the normal queue
            request = normalFront.data;
            normalFront = normalFront.next;
            if (normalFront == null) {
                normalRear = null;
            }
        }
        size--;
        return request;
    }
    // İsEmpty for
    // Dequeue method
    public boolean isEmpty() {
        return size == 0;
    }
    // Size control
    public int size() {
        return size;
    }


    public void printQueue() {
        // Priority print
        System.out.print("Priority Requests: ");
        PrNode current = priorityFront;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
        // Normal print
        System.out.print("Normal Requests: ");
        current = normalFront;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");

    }
}
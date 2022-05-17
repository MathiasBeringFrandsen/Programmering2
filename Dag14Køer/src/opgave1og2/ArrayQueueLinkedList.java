package opgave1og2;

public class ArrayQueueLinkedList implements QueueI {
    private Node first;
    private Node last;
    private int size;

    /**
     * Constructs an empty queue.
     */
    public ArrayQueueLinkedList() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    /**
     * Checks whether this queue is empty.
     *
     * @return true if this queue is empty
     */
    @Override
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * Adds an element to the tail of this queue.
     *
     * @param newElement the element to add
     */
    @Override
    public void enqueue(Object newElement) {
        Node newNode = new Node();
        newNode.data = newElement;
        if (first == null) {
            first = newNode;
        }  else {
            last.next = newNode;
        }
        last = newNode;
        size++;
    }

    /**
     * Removes an element from the head of this queue.
     *
     * @return the removed element
     */
    @Override
    public Object dequeue() {
        Node element = first;
        this.first = element.next;
        element.next = null;
        size--;
        return element.data;
    }

    /**
     * Returns the head of this queue. The queue is unchanged.
     *
     * @return the head element
     */
    @Override
    public Object getFront() {
        return first.data;
    }

    /**
     * The number of elements on the queue.
     *
     * @return the number of elements on the queue
     */
    @Override
    public int size() {
        return size;
    }

    class Node {
        public Object data;
        public Node next;
    }
}

package opgave3;

public class LinkedDequeue implements DequeI {
    private Node first;
    private Node last;
    private int size;


    public LinkedDequeue() {
        first = new Node();
        last = new Node();
        first.next = last;
        last.prev = first;
        size = 0;
    }

    /**
     * Checks whether this deque is empty.
     *
     * @return true if this queue is empty
     */
    @Override
    public boolean isEmpty() {
        return first.next == last;
    }

    /**
     * Adds an element to the head of this deque.
     *
     * @param newElement the element to add
     */
    @Override
    public void addFirst(Object newElement) {
        Node newNode = new Node();
        newNode.data = newElement;
        newNode.next = first.next;
        newNode.prev = first;
        first.next = newNode;
        newNode.next.prev = newNode;
        size++;
    }

    /**
     * Adds an element to the tail of this deque.
     *
     * @param newElement the element to add
     */
    @Override
    public void addLast(Object newElement) {
        Node newNode = new Node();
        newNode.data = newElement;
        newNode.next = last;
        newNode.prev = last.prev;
        last.prev.next = newNode;
        last.prev = newNode;
        size++;
    }

    /**
     * Removes an element from the head of this deque.
     *
     * @return the removed element
     */
    @Override
    public Object removeFirst() {
        Node element = first.next;

        first.next = element.next;
        element.next.prev = first;
        element.next = null;
        element.prev = null;
        size--;

        return element.data;
    }

    /**
     * Removes an element from the tail of this deque.
     *
     * @return the removed element
     */
    @Override
    public Object removeLast() {
        Node element = last.prev;

        last.prev = element.prev;
        element.prev.next = last;
        element.next = null;
        element.prev = null;
        size--;

        return element.data;
    }

    /**
     * Returns the head of this deque. The deque is unchanged.
     *
     * @return the head element
     */
    @Override
    public Object getFirst() {
        return first.next.data;
    }

    /**
     * Returns the tail of this deque. The deque is unchanged.
     *
     * @return the tail element
     */
    @Override
    public Object getLast() {
        return last.prev.data;
    }

    /**
     * The number of elements on the deque.
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
        public Node prev;
    }
}

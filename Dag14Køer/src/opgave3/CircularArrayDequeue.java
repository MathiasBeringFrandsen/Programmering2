package opgave3;

import java.util.NoSuchElementException;

/**
 * An implementation of a queue as a circular array.
 */
public class CircularArrayDequeue implements DequeI {
    private Object[] elements;
    private int currentSize;
    private int head;
    private int tail;

    /**
     * Constructs an empty queue.
     */
    public CircularArrayDequeue() {
        final int INITIAL_SIZE = 10;
        elements = new Object[INITIAL_SIZE];
        currentSize = 0;
        head = 0;
        tail = 0;
    }


    /**
     * Checks whether this queue is empty.
     *
     * @return true if this queue is empty
     */
    @Override
    public boolean isEmpty() {
        return currentSize == 0;
    }


    /**
     * Adds an element to the head of this deque.
     *
     * @param newElement the element to add
     */
    @Override
    public void addFirst(Object newElement) {
        growIfNecessary();
        currentSize++;
        if (head == 0) {
            elements[elements.length - 1] = newElement;
            head = elements.length - 1;
        } else {
            elements[head - 1] = newElement;
            head = (head - 1);
        }
    }


    /**
     * Adds an element to the tail of this deque.
     *
     * @param newElement the element to add
     */
    @Override
    public void addLast(Object newElement) {
        growIfNecessary();
        currentSize++;
        elements[tail] = newElement;
        tail = (tail + 1) % elements.length;
    }


    /**
     * Removes an element from the head of this deque.
     *
     * @return the removed element
     */
    @Override
    public Object removeFirst() {
        Object removed = elements[head];
        elements[head] = null;
        currentSize--;
        head = (head + 1) % elements.length;
        return removed;
    }


    /**
     * Removes an element from the tail of this deque.
     *
     * @return the removed element
     */
    @Override
    public Object removeLast() {
        Object removed;
        if (tail == 0) {
            removed = elements[elements.length - 1];
            tail = elements.length - 1;
        } else {
            removed = elements[tail - 1] ;
            tail = tail - 1;
        }
        currentSize--;
        elements[tail] = null;
        return removed;
    }


    /**
     * Returns the head of this deque. The deque is unchanged.
     *
     * @return the head element
     */
    @Override
    public Object getFirst() {
        return elements[head];
    }


    /**
     * Returns the tail of this deque. The deque is unchanged.
     *
     * @return the tail element
     */
    @Override
    public Object getLast() {
        Object returnable;
        if (tail == 0){
            returnable = elements[elements.length - 1];
        } else {
            returnable = elements[tail - 1];
        }
        return returnable;
    }


    /**
     * Grows the element array if the current size equals the capacity.
     */
    private void growIfNecessary() {
        if (currentSize == elements.length) {
            Object[] newElements = new Object[2 * elements.length];
            for (int i = 0; i < elements.length; i++) {
                newElements[i] = elements[(head + i) % elements.length];
            }
            elements = newElements;
            head = 0;
            tail = currentSize;
        }
    }

    @Override
    public int size() {
        return currentSize;
    }
}

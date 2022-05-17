package opgave1og2;

import java.util.NoSuchElementException;

/**
 * An implementation of a queue as a array.
 */
public class ArrayQueue implements QueueI {
    private int last;
    private Object[] elements;

    /**
     * Constructs an empty queue.
     */
    public ArrayQueue() {
        this.last = 0;
        this.elements = new Object[10];
    }

    /**
     * Checks whether this queue is empty.
     *
     * @return true if this queue is empty
     */
    @Override
    public boolean isEmpty() {
        boolean isEmpty = last == 0;
        return isEmpty;
    }

    /**
     * Adds an element to the tail of this queue.
     *
     * @param newElement the element to add
     */
    @Override
    public void enqueue(Object newElement) {
        if (last == elements.length) {
            Object[] temp = new Object[20];
            for (int i = 0; i < elements.length - 1; i++){
                temp[i] = elements[i];
            }
            elements = temp;
        } else {
            elements[last] = newElement;
            last++;
        }
    }

    /**
     * Removes an element from the head of this queue.
     *
     * @return the removed element
     */
    @Override
    public Object dequeue() {
        Object element = elements[0];
        for (int i = 1; i < last; i++) {
            elements[i - 1] = elements[i];
        }
        last--;
        elements[last] = null;
        return element;
    }

    /**
     * Returns the head of this queue. The queue is unchanged.
     *
     * @return the head element
     */
    @Override
    public Object getFront() {
        if (elements.length == 0){
            throw  new NoSuchElementException();
        }
        return elements[0];
    }

    /**
     * The number of elements on the queue.
     *
     * @return the number of elements in the queue
     */
    @Override
    public int size() {
        return last;
    }
}

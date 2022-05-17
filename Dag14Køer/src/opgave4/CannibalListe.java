package opgave4;

import java.util.Random;

public class CannibalListe {
    private Node first;
    private Node last;
    private int size;

    /**
     * Constructs an empty queue.
     */
    public CannibalListe() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    /**
     * Adds an element to the tail of this queue.
     *
     * @param newPerson the element to add
     */
    public void enqueue(Person newPerson) {
        Node newNode = new Node();
        newNode.data = newPerson;
        if (first == null) {
            first = newNode;
        } else {
            last.next = newNode;
        }
        last = newNode;
        newNode.next = first;
        size++;
    }

    public void print() {
        if (size == 0) {
            System.out.println("Alle er spist!");
        } else {
            Node temp = first;
            while (temp.next != first) {
                System.out.println(temp.data);
                temp = temp.next;
            }
            System.out.println(last.data);
        }
    }

    public void randomStart() {
        Random ran = new Random();
        int random = ran.nextInt(size);
        for (int i = random; i >= 0; i--) {
            last = first;
            first = first.next;
        }
    }

    public Person eat(int count) {
        Node spist;
        if (size == 1) {
            spist = first;
            first = null;
        } else {
            Node temp = first;
            for (int i = 0; i < count - 1; i++) {
                temp = temp.next;
            }
            spist = temp.next;
            temp.next = spist.next;
            first = temp.next;
            last = temp;
        }
        size--;
        return spist.data;
    }

    public boolean isEmpty() {
        return first == null;
    }

    class Node {
        public Person data;
        public Node next;
    }
}

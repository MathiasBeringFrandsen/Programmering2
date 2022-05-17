package dictionaryelev;

public class DictionaryLinked<K, V> implements Dictionary<K, V> {

    private Node start;
    private int size;

    /**
     * HashingMap constructor comment.
     */

    public DictionaryLinked() {
        // Sentinel (tomt listehoved - der ikke indeholder data)
        start = new Node();
        size = 0;
    }

    @Override
    public V get(K key) {
        V value = null;
        Node temp = start.next;
        boolean found = false;
        while (temp != null && !found) {
            if (temp.key.equals(key)) {
                value = temp.value;
                found = true;
            } else {
                temp = temp.next;
            }
        }
        return value;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public V put(K key, V value) {
        V oldValue = null;
        Node temp = start;
        boolean placed = false;
        while (temp.next != null && !placed) {
            if (temp.next.key.equals(key)) {
                oldValue = temp.next.value;
                temp.next.value = value;
                placed = true;
            } else {
                temp = temp.next;
            }
        }
        if (!placed) {
            Node newNode = new Node();
            newNode.key = key;
            newNode.value = value;
            temp.next = newNode;
            size++;
        }
        return oldValue;
    }

    @Override
    public V remove(K key) {
        V value = null;
        Node temp = start;
        while (temp.next != null) {
            if (temp.next.key.equals(key)) {
                value = temp.next.value;
                temp.next = temp.next.next;
                size--;
            } else {
                temp = temp.next;
            }
        }
        return value;
    }

    @Override
    public int size() {
        return size;
    }

    private class Node {
        Node next;
        K key;
        V value;
    }

}

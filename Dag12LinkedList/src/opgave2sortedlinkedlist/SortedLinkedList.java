package opgave2sortedlinkedlist;

public class SortedLinkedList {
    private Node first;

    public SortedLinkedList() {
        first = null;
    }

    /**
     * Tilføjer e til listen, så listen fortsat er sorteret i henhold til den
     * naturlige ordning på elementerne
     */
    public void addElement(String e) {
        Node node = new Node();
        node.data = e;
        if (first == null) {
            first = node;
        } else {
            if (first.data.compareToIgnoreCase(e) > 1) {
                node.next = first;
                first = node;
            } else {
                Node temp = first;
                while (temp.next != null && temp.next.data.compareToIgnoreCase(e) < 1) {
                    temp = temp.next;
                }
                node.next = temp.next;
                temp.next = node;
            }
        }
    }

    /**
     * Udskriver elementerne fra listen i sorteret rækkefølge
     */
    public void udskrivElements() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    /**
     * Returnerer antallet af elementer i listen
     */
    public int countElements() {
        int amount = 0;
        Node temp = first;
        while (temp != null) {
            amount++;
            temp = temp.next;
        }
        return amount;
    }


    /**
     * Fjerner det sidste (altså det største) element i listen. Listen skal fortsat være
     * sorteret i henhold til den naturlige ordning på elementerne.
     *
     * @return true hvis der blev fjernet fra listen ellers returneres false.
     */
    public boolean removeLast() {
        Node temp = first;
        boolean found = true;
        if (first == null) {
            found = false;
        } else {
            if (temp.next == null) {
                first = null;
            } else {
                while (temp.next.next != null) {
                    temp = temp.next;
                }
                temp.next = null;
            }
        }
        return found;
    }

    /**
     * Fjerner den første forekomst af e i listen. Listen skal fortsat være
     * sorteret i henhold til den naturlige ordning på elementerne.
     *
     * @return true hvis e blev fjernet fra listen ellers returneres false.
     */
    public boolean removeElement(String e) {
        boolean found = false;
        Node temp = first;
        while (!found && temp.next != null) {
            if (temp.next.data.equals(e)) {
                Node temp2 = temp.next;
                temp.next = temp.next.next;
                temp2.next = null;
                found = true;
            }
            temp = temp.next;
        }
        return found;
    }


    // Privat indre klasse der modellerer en node i listen
    private class Node {
        public String data;
        public Node next;
    }
}

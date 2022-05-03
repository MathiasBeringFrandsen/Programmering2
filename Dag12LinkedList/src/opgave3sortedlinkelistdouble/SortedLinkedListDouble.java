package opgave3sortedlinkelistdouble;

import opgave2sortedlinkedlist.SortedLinkedList;

public class SortedLinkedListDouble {

	private Node first;
	private Node last;
	private int size;

	public SortedLinkedListDouble() {
		first = new Node();
		last = new Node();
		first.next = last;
		last.prev = first;
		size = 0;
	}

	/**
	 * Tilføjer e til listen, så listen fortsat er sorteret i henhold til den
	 * naturlige ordning på elementerne
	 */
	public void addElement(String e) {
		Node node = new Node();
		node.data = e;
		if (first == last) {
			first = node;
			size++;
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
	 * Fjerner den første forekomst af e i listen. Listen skal fortsat være
	 * sorteret i henhold til den naturlige ordning på elementerne.
	 *
	 * @return true hvis e blev fjernet fra listen ellers returneres false.
	 */
	public boolean removeElement(String e) {
	// TODO
		return false;
	}

	/**
	 * Udskriver elementerne fra listen i sorteret rækkefølge 
	 */
	public void udskrivElements() {
		//TODO
	}

	/**
	 * Udskriver elementerne fra listen i sorteret rækkefølge bagfra
	 */
	public void udskrivBagfra() {
		// TODO
	}

	/**
	 * Returnerer antallet af elementer i listen
	 */
	public int countElements() {
		// TODO
		return -1;
	}

	// Privat indre klasse der modellerer en node i en dobbeltkædet liste
	class Node {
		public String data;
		public Node next;
		public Node prev;
	}
}

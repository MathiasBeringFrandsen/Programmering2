package opgave2sortedlinkedlist;

public class SortedLinkedListApp {
    public static void main(String[] args) {
        String jesper = "Jesper";
        String mads = "Mads";
        String markus = "Markus";
        String frederik = "Frederik";
        String tobias = "Tobias";

        SortedLinkedList list = new SortedLinkedList();
        list.addElement(mads);
        list.addElement(jesper);
        list.addElement(markus);
        list.addElement(frederik);
        list.addElement(tobias);

        list.removeLast();
        list.udskrivElements();
        System.out.println(list.countElements());
        System.out.println(list.removeElement("Markus"));
    }
}

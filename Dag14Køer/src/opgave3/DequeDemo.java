package opgave3;

public class DequeDemo {
    public static void main(String[] args) {
        DequeI q = new LinkedDequeue();
//        DequeI q = new CircularArrayDequeue();
        q.addFirst("Tom");
        q.addFirst("Diana");
        q.addFirst("Harry");
        q.addLast("Thomas");
        q.addLast("Bob");
        q.addLast("Brian");
        System.out.println(q.getFirst());
        System.out.println(q.getLast());
        System.out.println(q.isEmpty() + " " + q.size());
        while (!q.isEmpty()) {
            System.out.println(q.removeFirst());
        }
        System.out.println();
        System.out.println(q.isEmpty() + " " + q.size());
        System.out.println();
        q.addFirst("Anna");
        q.addLast("Lotte");
        System.out.println(q.isEmpty() + " " + q.size());
        while (!q.isEmpty()) {
            System.out.println(q.removeLast());
        }
        System.out.println();
        System.out.println(q.isEmpty() + " " + q.size());
    }
}

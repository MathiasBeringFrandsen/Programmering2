package binarysearchtreestuderende;

public class App {
    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        tree.add(45);
        tree.add(22);
        tree.add(11);
        tree.add(30);
        tree.add(15);
        tree.add(25);
        tree.add(77);
        tree.add(90);
        tree.add(88);

        System.out.println("Max: " + tree.findmax());
        System.out.println();
        System.out.println("Min: " + tree.findMin());
        System.out.println();
        System.out.println("Fjern min 1: " + tree.removeMin());
        System.out.println();
        System.out.println("Fjern min 2: " + tree.removeMin());
        System.out.println();
        System.out.println("Fjern max 1: " + tree.removeMax());
        System.out.println();
        System.out.println("Fjern max 2: " + tree.removeMax());
    }
}

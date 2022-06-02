package hovedspgsmNN;

public class App {
    public static void main(String[] args) {
        // Venstre Side
        BinaryTree<String> to = new BinaryTree<>("2");
        BinaryTree<String> fire = new BinaryTree<>("4");

        BinaryTree<String> plusVenstre = new BinaryTree<>("+", to, fire);
        BinaryTree<String> syv = new BinaryTree<>("7");

        BinaryTree<String> gange = new BinaryTree<>("*", plusVenstre, syv);

        // Højre Side
        BinaryTree<String> tre = new BinaryTree<>("3");
        BinaryTree<String> otte = new BinaryTree<>("8");

        BinaryTree<String> plusHøjre = new BinaryTree<>("+", tre, otte);

        // Root
        BinaryTree<String> plusRoot = new BinaryTree<>("+", gange, plusHøjre);

        System.out.println(plusRoot.countElement("+"));

        System.out.println(plusRoot.value());
    }
}

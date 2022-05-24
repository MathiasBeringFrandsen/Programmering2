package binartreestuderende;

public class App {
    public static void main(String[] args) {

        // Left side
        BinaryTree<Integer> fifteen = new BinaryTree<>(15);
        BinaryTree<Integer> elleven = new BinaryTree<>(11,null,fifteen);

        BinaryTree<Integer> twentyfive = new BinaryTree<>(25);
        BinaryTree<Integer> thirty = new BinaryTree<>(30, twentyfive, null);

        BinaryTree<Integer> twentyto = new BinaryTree<>(22, elleven, thirty);

        // Right Side
        BinaryTree<Integer> eightyeight = new BinaryTree<>(88);
        BinaryTree<Integer> ninety = new BinaryTree<>(90, eightyeight, null);
        BinaryTree<Integer> seventyseven = new BinaryTree<>(77, null, ninety);

        // Root
        BinaryTree<Integer> root = new BinaryTree<>(45, twentyto, seventyseven);

//        System.out.println(root.right().data());
//        System.out.println(ninety.replace(37));
//        System.out.println(ninety.data());
//        System.out.println(root.height());
//
//        root.preorder();
//        System.out.println();
//        System.out.println();
//        root.inorder();
//        System.out.println();
//        System.out.println();
//        root.postorder();
        System.out.println(root.sum());


    }
}

public class Main {
    public static void main(String[] args) {
        RedBlackTree node = new RedBlackTree();

        node.insert(45);
        node.inorder();
        System.out.println("\n");
        node.insert(9);
        node.inorder();
        System.out.println("\n");
        node.insert(10);
        node.inorder();
        System.out.println("\n");
        node.insert(20);
        node.inorder();
        System.out.println("\n");
        node.insert(4);
        node.inorder();
        System.out.println("\n");
        node.insert(30);
        node.inorder();
        System.out.println("\n");
        node.insert(8);
        node.inorder();
        System.out.println("\n");
        node.insert(40);
        node.inorder();
        System.out.println("\n");
        node.insert(0);
        node.inorder();
        
    }
}
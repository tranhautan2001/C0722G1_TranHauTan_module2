package ss_12_java_collection_framework.practice.practice4;

public class TestBST {
    public static void main(String[] args) {
        BST<String> tree = new BST<>();
        tree.insert("Geoge");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");

        System.out.println("Inorder (đã sắp xếp ): ");
        tree.inorder();
        System.out.println("the number of nodes is : "+ tree.getSize());
    }
}

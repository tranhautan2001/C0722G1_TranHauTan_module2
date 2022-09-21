package ss_12_java_collection_framework.practice.practice4;

public interface ITree<E> {
    public boolean insert(E e);


    public void inorder();

    public int getSize();
}

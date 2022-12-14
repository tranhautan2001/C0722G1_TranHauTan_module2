package ss10_dsa_danh_sach.exercis.exercis1;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object elements[];


    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }


    public MyList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IndexOutOfBoundsException("capacity" + capacity);

        }

    }


    public int size() {
        return this.size;
    }


    public Object clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;

        }
        return null;
    }


    public boolean add(E element) {
        if (elements.length == size) {
            this.ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        return true;
    }


    public void add(E element, int index) {
        if (index > elements.length) {
            throw new IndexOutOfBoundsException("index" + index);
        } else {
            this.ensureCapacity(5);
        }
        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            for (int i = size + 1; i >= index; i--) {
                elements[i] = elements[i - 1];

            }
            elements[index] = element;
            size++;
        }
    }


    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);

        }
    }
}

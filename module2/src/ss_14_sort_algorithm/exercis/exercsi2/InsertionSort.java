package ss_14_sort_algorithm.exercis.exercsi2;

public class InsertionSort {
    static int[] list = {1, 5, 4, 33, 7, 10};

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int key = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > key; k--) {
                list[k + 1] = list[k];
            }
            list[k + 1] = key;
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        System.out.print("Danh sách đã sắp xếp : " + "\n");
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}

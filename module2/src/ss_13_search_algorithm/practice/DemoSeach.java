package ss_13_search_algorithm.practice;

public class DemoSeach {

    // thuật toán tìm kiếm nhị phân


    public static void main(String[] args) {
        System.out.println(binarySearch(list, 7));

    }

    static int[] list = {1,2,3,4,5,6,7,8,9};

    static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key == list[mid])
                return mid;
            else if (key < list[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1; /* Now high < low, key not found */
    }

}

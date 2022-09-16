package ss10_dsa_danh_sach.practice.practice2;


public class MylinkedList {
    private Node head;
    private int numNodes;    // Lớp MyLinkedList chứa lớp Node.

    public MylinkedList(int i) {
    }

    public class Node {
        private Node next;
        private Object data;

        public Node(Object data) {     // tạo lớp Node
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    //Cài đặt phương thức add
    //
    //Mục đích: Thêm đối tượng vào vị trí thứ index trong danh sách
    //
    //Tham số đầu vào: vị trí thêm (index), đối tượng thêm (data)

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    //Cài đặt phương thức addFirst()
    //
    //Mục đích: Thêm đối tượng vào vị trí đầu tiên trong danh sách
    //
    //Tham số đầu vào: đối tượng thêm (data)


    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }
    //Cài đặt phương thức get()
    //
    //Mục đích: Lấy phần tử ở vị trí index từ danh sách
    //
    //Tham số đầu vào: vị trí cần lấy (index)

    public Node get (int index){
        Node temp = head;
        for (int i = 0; i <index ; i++) {
            temp = temp.next;

        }
        return temp;
    }
    //Cài đặt phương thức printList
    //
    //Mục đích: Hiển thị danh sách các phần tử trong danh sách

    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}

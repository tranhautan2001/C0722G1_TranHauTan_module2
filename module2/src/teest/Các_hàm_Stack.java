package teest;


import java.util.Stack;

public class Các_hàm_Stack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("dog");
        stack.push("cat");
        stack.push("horse");

        System.out.println("Stack: "+stack);

        //hàm xóa phần tử cuối trong mảng:
        String element = stack.pop();
        System.out.println(element);

        // hàm peek() trả về phần tử trên cùng của stack
        String element2 = stack.peek();
        System.out.println(element2);

        // hàm tìm kiếm phần tử có trong mảng
       int position = stack.search("cat");
        System.out.println(position);

        // hàm empty() xem stack có trống hay không
        boolean resulf = stack.empty();
        System.out.println(resulf);

    }


}


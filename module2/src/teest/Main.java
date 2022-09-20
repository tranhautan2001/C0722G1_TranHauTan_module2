package teest;

class Main
{
    //function to reverse the string
    public static void reverse(StringBuffer array)
    {
        // Tạo một ngăn xếp dung lượng
        // bằng chiều dài của chuỗi
        int n = array.length();
        Stack obj = new Stack(n);

        // Đẩy tất cả các ký tự của chuỗi
        // để ngăn xếp
        int i;
        for (i = 0; i < n; i++)
            obj.push(array.charAt(i));

        // Bật tất cả các ký tự của chuỗi
        // và đưa chúng trở lại array
        for (i = 0; i < n; i++)
        {
            char ch = obj.pop();
            array.setCharAt(i,ch);
        }
    }

    //chức năng điều khiển
    public static void main(String args[])
    {
        // tạo một chuỗi mới
        StringBuffer s= new StringBuffer("123456");

        //gọi phương pháp đảo ngược
        reverse(s);

        //in chuỗi đảo ngược
        System.out.println("số nguyên đảo ngược là: " + s);
    }
}

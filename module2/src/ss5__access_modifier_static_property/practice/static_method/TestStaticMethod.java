package ss5__access_modifier_static_property.practice.static_method;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();


        Student s1 = new Student(1, "Trần Hậu Tân");
        Student s2 = new Student(2, "Phan Tuấn Linh");
        Student s3 = new Student(3, "Lê Tạ Hà Phương");


        s1.display();
        s2.display();
        s3.display();
    }
}

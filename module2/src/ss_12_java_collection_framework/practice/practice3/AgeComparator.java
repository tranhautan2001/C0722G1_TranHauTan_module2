package ss_12_java_collection_framework.practice.practice3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AgeComparator implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAge() > o2.getAge()) {
            return 1;
        } else if (o1.getAge() == o2.getAge()) {
           return 0;
        }else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Student student = new Student("kien",26,"HT");
        Student student1 = new Student("trang",28,"HT");
        Student student2 = new Student("duyen",27,"HT");
        Student student3= new Student("tan",25,"HT");
        List<Student> lists = new ArrayList<>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        for (Student st : lists) {
            System.out.println(st.toString());
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists, ageComparator);
        for (Student st : lists) {
            System.out.println(st.toString());
        }
    }
}
package ss5__access_modifier_static_property.exercis.static_method;

public class Student {
    private int rollon;
    private String name;
    private static String college = "BBDIT";

    Student(int r, String n){
        rollon = r;
        name = n;

    }
    static void change(){
        college = "CODEGYM";

    }
    void display(){
        System.out.println(rollon + " " +name + " " + college);
    }

}

package ss10_dsa_danh_sach.exercis.bai_lam_them_haiTT.model;

public class Student extends Person {
    private String className;
    private double point;

    public Student() {
    }

    public Student(int id, String name, String dateOfBirth, String sex, String className, double point) {
        super(id, name, dateOfBirth, sex);
        this.className = className;
        this.point = point;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s\n", this.getId(), this.getName(), this.getDateOfBirth(), this.getSex(),
                this.getClassName(), this.getPoint());
    }

    @Override
    public String toString() {
        return "Student{"+ super.toString() +
                "className='" + className + '\'' +
                ", point=" + point +
                '}' ;
    }
}

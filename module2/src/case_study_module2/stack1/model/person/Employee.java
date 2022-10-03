package case_study_module2.stack1.model.person;

public class Employee extends Person{
  private int level;
  private String location;
  private double wage;

    public Employee() {
    }

    public Employee(String name, String dateOfBirth, String sex, int cmnd, int phoneNumber, String email, int level, String location, double wage) {
        super(name, dateOfBirth, sex, cmnd, phoneNumber, email);
        this.level = level;
        this.location = location;
        this.wage = wage;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "level=" + level +
                ", location='" + location + '\'' +
                ", wage=" + wage +
                '}';
    }
}

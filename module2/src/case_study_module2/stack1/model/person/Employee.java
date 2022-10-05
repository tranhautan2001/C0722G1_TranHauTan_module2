package case_study_module2.stack1.model.person;

public class Employee extends Person{
  private String level;
  private String location;
  private double wage;

    public Employee() {
    }

    public Employee(int id, String name, String dateOfBirth, String sex, String idCard, String phoneNumber, String email, String level, String location, double wage) {
        super(id, name, dateOfBirth, sex, idCard, phoneNumber, email);
        this.level = level;
        this.location = location;
        this.wage = wage;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
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

    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s\n", this.getId(), this.getName(), this.getDateOfBirth(), this.getSex(),
                this.getIdCard(), this.getPhoneNumber(), this.getEmail(), this.getLevel(),this.getLocation(),this.getWage());
    }
    @Override
    public String toString() {
        return "Nhân Viên {" +
                "Trình Độ =" + level +
                ", Vị Trí  ='" + location + '\'' +
                ", Lương =" + wage +
                '}'+super.toString();
    }
}

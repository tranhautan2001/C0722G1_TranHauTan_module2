package case_study_module2.stack1.model.person;

public abstract class Person {
    private int id;
    private String name;
    private String dateOfBirth;
    private String sex;
    private String idCard;
    private String phoneNumber;
    private String email;

    public Person() {
    }

    public Person(int id, String name, String dateOfBirth, String sex, String idCard, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Người {" +
                "Mã Nhân Viên =" + id +
                ", Tên ='" + name + '\'' +
                ", Ngày Sinh ='" + dateOfBirth + '\'' +
                ", Giới Tính ='" + sex + '\'' +
                ", Số CMND =" + idCard +
                ", Số Điện Thoại =" + phoneNumber +
                ", Email='" + email + '\'' +
                '}';
    }
}

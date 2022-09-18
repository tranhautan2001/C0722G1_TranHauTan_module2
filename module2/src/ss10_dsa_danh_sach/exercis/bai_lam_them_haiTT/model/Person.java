package ss10_dsa_danh_sach.exercis.bai_lam_them_haiTT.model;

public abstract class Person {
    private int id;
    private String name;
    private String dateOfBirth;
    private String sex;

    public Person() {
    }

    public Person(int id, String name, String dateOfBirth, String sex) {

        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
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

    @Override
    public String toString() {
        return
                "id=" + id +
                        ", name='" + name + '\'' +
                        ", dateOfBirth='" + dateOfBirth + '\'' +
                        ", sex='" + sex + '\'' ;

    }
}

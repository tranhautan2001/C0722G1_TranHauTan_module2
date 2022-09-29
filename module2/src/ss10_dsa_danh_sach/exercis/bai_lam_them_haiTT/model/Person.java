package ss10_dsa_danh_sach.exercis.bai_lam_them_haiTT.model;

public abstract class Person  {
    private int id;
    private String name;
    private int dateOfBirth;
    private String sex;

    public Person() {
    }

    public Person(int id, String name, int dateOfBirth, String sex) {
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

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
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
                "ID=" + id +
                        ", Tên ='" + name + '\'' +
                        ", Ngày Sinh ='" + dateOfBirth + '\'' +
                        ", Giới tính ='" + sex + '\'';
    }
}



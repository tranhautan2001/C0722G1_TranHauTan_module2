package ss10_dsa_danh_sach.exercis.bai_lam_them_haiTT.model;

public abstract class Person  {
    private Integer id;
    private String name;
    private String dateOfBirth;
    private String sex;

    public Person() {
    }

    public Person(Integer id, String name, String dateOfBirth, String sex) {

        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
    }

    public Integer getInteger() {
        return id;
    }

    public void setInteger(Integer id) {
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
                "ID=" + id +
                        ", Tên ='" + name + '\'' +
                        ", Ngày Sinh ='" + dateOfBirth + '\'' +
                        ", Giới tính ='" + sex + '\'';
    }
}



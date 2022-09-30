package ss10_dsa_danh_sach.exercis.bai_lam_them_haiTT.model;

public class Teacher extends Person {
    private String specialize;

    public Teacher() {
    }

    public Teacher(int id, String name, int dateOfBirth, String sex, String specialize) {
        super(id, name, dateOfBirth, sex);
        this.specialize = specialize;
    }


    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s\n", this.getId(), this.getName(), this.getDateOfBirth(), this.getSex(), this.getSpecialize());
    }

    @Override
    public String toString() {
        return "Giáo Viên {" + super.toString() +
                ", Công việc ='" + specialize + '\'' +
                '}';
    }

}

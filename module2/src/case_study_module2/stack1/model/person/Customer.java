package case_study_module2.stack1.model.person;

public class Customer extends Person {
    private String typeOfGuest;
    private String address;

    public Customer() {
    }

    public Customer(int id, String name, String dateOfBirth, String sex, String idCard, String phoneNumber, String email, String typeOfGuest, String address) {
        super(id, name, dateOfBirth, sex, idCard, phoneNumber, email);
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public String getTypeOfGuest() {
        return typeOfGuest;
    }

    public void setTypeOfGuest(String typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s\n", this.getId(), this.getName(), this.getDateOfBirth(), this.getSex(),
                this.getIdCard(), this.getPhoneNumber(), this.getEmail(), this.getTypeOfGuest(),this.getAddress());
    }
    @Override
    public String toString() {
        return "Customer{" +
                "typeOfGuest='" + typeOfGuest + '\'' +
                ", address='" + address + '\'' +
                '}'+super.toString();
    }
}
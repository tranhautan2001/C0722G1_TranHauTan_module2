package case_study_module2.stack1.model.person;

public class Customer extends Person{
   private String typeOfGuest;
   private String address;

    public Customer() {
    }

    public Customer(String name, String dateOfBirth, String sex, int cmnd, int phoneNumber, String email, String typeOfGuest, String address) {
        super(name, dateOfBirth, sex, cmnd, phoneNumber, email);
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

    @Override
    public String toString() {
        return "Customer{" +
                "typeOfGuest='" + typeOfGuest + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

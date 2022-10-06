package case_study_module2.stack1.model.facility;

public abstract class Facility {
    private String id;
    private String name;
    private double area;
    private int cost;
    private int people;
    private String rentalType;

    public abstract String getInfo();

    public Facility() {
    }

    public Facility(String id, String name, double area, int cost, int people, String rentalType) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.people = people;
        this.rentalType = rentalType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }


    @Override
    public String toString() {
        return "Cơ Sỏ{" +
                " Mã Dịch Vụ = " + id + '\'' +
                "Tên Dịch VỤ = " + name +
                ", Diện Tích =" + area +
                ", Chi Phí =" + cost +
                ", Số Người =" + people +
                ", Kiểu Thuê='" + rentalType + '\'' +
                '}';
    }
}

package case_study_module2.stack1.model.facility;

import case_study_module2.stack1.model.facility.Facility;

public class Villa extends Facility {
    private String room;
    private double poolArea;
    private int numberOfFloors;

    public Villa() {
    }

    public Villa(String id, String name, double area, int cost, int people, String rentalType, String room, double poolArea, int numberOfFloors) {
        super(id, name, area, cost, people, rentalType);
        this.room = room;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s",this.getId(), this.getName(),this.getArea(), this.getCost(), this.getPeople(),
                this.getRentalType(), this.getRoom(), this.getPoolArea(), this.getNumberOfFloors());
    }

    @Override
    public String toString() {
        return " Biệt Thự {" +
                " Phòng =" + room  +
                ", Diện Tích Hồ Bơi=" + poolArea +
                ", Số Tầng =" + numberOfFloors +
                '}'+super.toString();
    }
}

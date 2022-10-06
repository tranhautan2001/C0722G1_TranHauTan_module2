package case_study_module2.stack1.model.facility;

import case_study_module2.stack1.model.facility.Facility;

public class House  extends Facility {
    private String room;
    private int numberOfFloors;

    public House() {
    }

    public House(String id, String name, double area, int cost, int people, String rentalType, String room, int numberOfFloors) {
        super(id, name, area, cost, people, rentalType);
        this.room = room;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s\n",this.getId(), this.getName(),this.getArea(), this.getCost(), this.getPeople(),
                this.getRentalType(), this.getRoom(), this.getNumberOfFloors());
    }
    @Override
    public String toString() {
        return " Nhà {" +
                " Phòng ='" + room + '\'' +
                ", Số Tầng =" + numberOfFloors +
                '}'+super.toString();
    }
}

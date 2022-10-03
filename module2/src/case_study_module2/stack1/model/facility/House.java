package case_study_module2.stack1.model.facility;

import case_study_module2.stack1.model.facility.Facility;

public class House  extends Facility {
    private String room;
    private int numberOfFloors;

    public House() {
    }

    public House(String name, double area, int cost, int people, String rentalType, String room, int numberOfFloors) {
        super(name, area, cost, people, rentalType);
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

    @Override
    public String toString() {
        return "House{" +
                "room='" + room + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}

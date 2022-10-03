package case_study_module2.stack1.model.facility;

import case_study_module2.stack1.model.facility.Facility;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String name, double area, int cost, int people, String rentalType, String freeService) {
        super(name, area, cost, people, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                '}';
    }
}

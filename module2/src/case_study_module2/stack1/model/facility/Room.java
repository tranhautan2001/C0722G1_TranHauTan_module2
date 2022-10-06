package case_study_module2.stack1.model.facility;

import case_study_module2.stack1.model.facility.Facility;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String id, String name, double area, int cost, int people, String rentalType, String freeService) {
        super(id, name, area, cost, people, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s\n",this.getId(), this.getName(),this.getArea(), this.getCost(), this.getPeople(),
                this.getRentalType(), this.getFreeService());
    }
    @Override
    public String toString() {
        return " Phòng {" +
                "Dịch Vụ Miễn Phí ='" + freeService + '\'' +
                '}'+super.toString();
    }
}

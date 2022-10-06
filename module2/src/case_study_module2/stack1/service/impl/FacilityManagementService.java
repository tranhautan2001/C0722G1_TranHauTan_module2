package case_study_module2.stack1.service.impl;

import case_study_module2.stack1.exeception.CheckNumberException;
import case_study_module2.stack1.model.facility.Facility;
import case_study_module2.stack1.model.facility.House;
import case_study_module2.stack1.model.facility.Room;
import case_study_module2.stack1.model.facility.Villa;
import case_study_module2.stack1.service.IFacilityManagementService;
import case_study_module2.stack1.utils.*;

import java.util.*;

public class FacilityManagementService implements IFacilityManagementService {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String PATH = "case_study_module2\\stack1\\data\\Facility.csv";
    private Map<Facility, Integer> maps = new LinkedHashMap<>();
    private static List<Facility> facilityMaintenanceList;


    @Override
    public void displayFacility() {
        maps = ReadFile.readFacility(PATH);
        Set<Facility> keys = maps.keySet();
        for (Facility key : keys) {
            System.out.println("Key: " + key );
        }
    }

    @Override
    public void addNewVilla() {
        maps = ReadFile.readFacility(PATH);
        maps.put(infoVilla(), 0);
        WriteFile.writeFacility(PATH,maps);
        System.out.println("thêm mới thành công!");
    }



    @Override
    public void addNewHouse() {
        maps = ReadFile.readFacility(PATH);
        maps.put(infoHouse(), 0);
        WriteFile.writeFacility(PATH,maps);
        System.out.println("thêm mới thành công!");
    }


    @Override
    public void addNewRoom() {
        maps = ReadFile.readFacility(PATH);
        maps.put(infoRoom(), 0);
        WriteFile.writeFacility(PATH,maps);
        System.out.println("thêm mới thành công!");
    }


    @Override
    public void displayFacilityMaintenance() {
      
    }
    private static Villa infoVilla() {
        String id = ValidateVilla.getID();
        String name = ValidateVilla.getName();
        double area = ValidateVilla.getArea();
        int cost = ValidateVilla.getCost();
        int people = ValidateVilla.getPeople();
        String rentalType = ValidateVilla.getRentalType();
        String room = ValidateVilla.getRoom();
        double poolArea = ValidateVilla.getPoolArea();
        int numberOfFloors = ValidateVilla.getNumberOfFloors();

        Villa villas = new Villa(id,name,area,cost,people,rentalType,room,poolArea,numberOfFloors) ;
        return villas;
    }


    private static House infoHouse() {
        String id = ValidateHouse.getID();
        String name = ValidateHouse.getName();
        double area = ValidateHouse.getArea();
        int cost = ValidateHouse.getCost();
        int people = ValidateHouse.getPeople();
        String rentalType = ValidateHouse.getRentalType();
        String room = ValidateHouse.getRoom();
        int numberOfFloors = ValidateHouse.getNumberOfFloors();

        House houses = new House(id,name,area,cost,people,rentalType,room,numberOfFloors) ;
        return houses;
    }

    private static Room infoRoom() {
        String id = ValidateRoom.getID();
        String name = ValidateRoom.getName();
        double area = ValidateRoom.getArea();
        int cost = ValidateRoom.getCost();
        int people = ValidateRoom.getPeople();
        String rentalType = ValidateRoom.getRentalType();
        String freeService = ValidateRoom.getFreeService();

        Room rooms = new Room(id,name,area,cost,people,rentalType,freeService) ;
        return rooms;
    }

}
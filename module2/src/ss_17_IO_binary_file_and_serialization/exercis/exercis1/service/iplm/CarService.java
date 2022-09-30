package ss_17_IO_binary_file_and_serialization.exercis.exercis1.service.iplm;
import ss_17_IO_binary_file_and_serialization.exercis.exercis1.model.Car;
import ss_17_IO_binary_file_and_serialization.exercis.exercis1.service.ICarService;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarService implements ICarService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Car> carList = new ArrayList<>();

    @Override
    public void addCar() throws IOException {
        Car car = this.inforCar();
        carList.add(car);
        writeFileCar();
        System.out.println("Thêm mới xe thành công! ");
    }

    @Override
    public void displayCar() throws IOException, ClassNotFoundException {
        carList = readFileCar();
        for (Car car: carList) {
            System.out.println(car);
        }
    }

    @Override
    public void seachCar() throws IOException {
        writeFileCar();
        do {
            System.out.println("Nhập 1 để tìm kiếm xe theo name: \n" +
                              "Nhập 2 để tìm kiếm xe theo ID: \n" +
                              "Nhập 3 để thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    String name = scanner.nextLine();
                    for (int i = 0; i < carList.size(); i++) {
                        if (carList.get(i).getName().equals(name)) {
                            System.out.println(carList.get(i));
                            System.out.println("-----------------");
                        }

                    }
                    break;
                case 2:
                    int ID = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < carList.size(); i++) {
                        if (carList.get(i).getId() == ID) {
                            System.out.println(carList.get(i));
                            System.out.println("-----------------");
                            break;
                        }

                    }
                    break;
                case 3:
                    return;
            }
        } while (true);


    }
    public Car inforCar(){
        System.out.println("Mời bạn nhập mã xe");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập tên xe");
        String name = scanner.nextLine();
        System.out.println("Mời bạn nhập hãng xe");
        String manufacturer = scanner.nextLine();
        System.out.println("Mời bạn nhập giá xe");
        int price = Integer.parseInt(scanner.nextLine());
     Car car = new Car(id,name,manufacturer,price);
     return car;
    }
    private void writeFileCar() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("ss_17_IO_binary_file_and_serialization\\exercis\\exercis1\\data\\Car.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(carList);
        objectOutputStream.close();

     }
     private List<Car> readFileCar() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("ss_17_IO_binary_file_and_serialization\\exercis\\exercis1\\data\\Car.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        carList = (List<Car>) objectInputStream.readObject();
        objectInputStream.close();
        return carList;

     }

}

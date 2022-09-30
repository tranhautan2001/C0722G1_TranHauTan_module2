package ss_17_IO_binary_file_and_serialization.exercis.exercis1.service;

import java.io.IOException;

public interface ICarService {
    void addCar() throws IOException;

    void displayCar() throws IOException, ClassNotFoundException;

    void seachCar() throws IOException;

}

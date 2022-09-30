package ss_17_IO_binary_file_and_serialization;

import ss_17_IO_binary_file_and_serialization.exercis.exercis1.model.Car;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectOutStreamExample {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("ss_17_IO_binary_file_and_serialization\\codegym.txt"));
            Product product = new Product(1,"Iphone 12",2800000,"new");
            oos.flush();   // kiểm tra hàm này dùng làm gì
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            oos.close();
        }
        System.out.println("Success!");
    }


}

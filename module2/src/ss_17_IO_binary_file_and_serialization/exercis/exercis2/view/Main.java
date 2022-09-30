package ss_17_IO_binary_file_and_serialization.exercis.exercis2.view;

import ss_17_IO_binary_file_and_serialization.exercis.exercis2.controller.CopyFileBinary;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            File sourceFile = new File("ss_17_IO_binary_file_and_serialization\\exercis\\exercis2\\data\\sourcefile.csv");
            File destFile = new File("ss_17_IO_binary_file_and_serialization\\exercis\\exercis2\\data\\targetfile.csv");
            CopyFileBinary.copyFileBinary(sourceFile, destFile);
            System.out.println("Copy thành công!");

        } catch (IOException  e) {
            System.out.println(e.getMessage());
        }

    }
}

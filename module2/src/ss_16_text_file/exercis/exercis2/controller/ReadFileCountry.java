package ss_16_text_file.exercis.exercis2.controller;

import ss_16_text_file.exercis.exercis2.model.Country;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileCountry {
    public static void main(String[] args)  throws IOException {
        File file = new File("ss_16_text_file\\exercis\\exercis2\\data\\countries.csv");

        FileReader fileReader = new FileReader(file);

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        String [] list;

        List<Country> countries = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null){
            list = line.split(",");
            countries.add(new Country(Integer.parseInt(list[0]), list[1], list[2]));
        }
        bufferedReader.close();

        System.out.print("Danh sách các quốc gia: \n ");
        System.out.print(countries);

    }
}

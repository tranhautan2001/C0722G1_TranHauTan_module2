package ss_16_text_file.exercis.exercis1.view;

import ss_16_text_file.exercis.exercis1.common.Reader;
import ss_16_text_file.exercis.exercis1.common.Writer;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Reader.readFile("ss_16_text_file\\exercis\\exercis1\\data\\source_file.txt");
        Writer.writeFile("ss_16_text_file\\exercis\\exercis1\\data\\target_file.txt",strings);
    }
}

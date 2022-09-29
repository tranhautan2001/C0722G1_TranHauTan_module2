package ss_16_text_file.exercis.exercis1.common;

import java.io.*;
import java.util.List;

public class Writer {
    public static void writeFile(String pathFile, List<String> line) {

        try {
            File file = new File(pathFile);
            if (!file.exists()) {
                throw new FileNotFoundException("lỗi");
            }
            FileWriter fileWriter = new FileWriter(pathFile, true);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String string : line) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }
}
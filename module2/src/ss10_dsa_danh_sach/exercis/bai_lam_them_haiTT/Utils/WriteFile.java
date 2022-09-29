package ss10_dsa_danh_sach.exercis.bai_lam_them_haiTT.Utils;

import ss10_dsa_danh_sach.exercis.bai_lam_them_haiTT.model.Student;
import ss10_dsa_danh_sach.exercis.bai_lam_them_haiTT.model.Teacher;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFile {
    private static void writeFile(String path, String data) {
        try {
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeStudentFile(String path, List<Student> students) {
        StringBuilder data = new StringBuilder();
        for (Student student : students) {
            data.append(student.getInfo());
        }

        writeFile(path, data.toString());
    }

    public static void writeTeacherFile(String path, List<Teacher> teachers) {
        StringBuilder data = new StringBuilder();
        for (Teacher teacher : teachers) {
            data.append(teacher.getInfo());
        }

        writeFile(path, data.toString());
    }
}

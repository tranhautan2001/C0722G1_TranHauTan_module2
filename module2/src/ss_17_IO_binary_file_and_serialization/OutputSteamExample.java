package ss_17_IO_binary_file_and_serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputSteamExample {
    public static void main(String[] args) throws IOException {
        // tạo 1 luồng ký tự đầu ra với mục đích ghi thông tin vào file

        OutputStream os = new FileOutputStream("ss_17_IO_binary_file_and_serialization\\codegym.txt");

        //Tạo một mảng byte, ta sẽ ghi các byte này vào file nói trên .

        byte[] bytes = new byte[]{'C','o','d','e','G','y','m'};

        //Ghi lần lượt các ký tự vào luồng

        for (int i = 0; i < bytes.length; i++) {
            byte b = bytes[i];

            // Ghi ký tự vào luồng
            os.write(b);
        }
        // Đóng luồng đầu ra lại việc ghi xuống file hoàn tất
        os.close();
    }
}

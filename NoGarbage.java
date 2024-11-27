package hust.soict.dsai.garbage;

import java.nio.file.Files;  // Import để sử dụng Files
import java.nio.file.Paths;  // Import để sử dụng Paths
import java.io.IOException;  // Import để sử dụng IOException

public class NoGarbage {
    public static void main(String[] args) {
        try {
            String filePath = "file.txt";  // Đảm bảo rằng file.txt tồn tại và có đường dẫn chính xác
            byte[] fileBytes = Files.readAllBytes(Paths.get(filePath));  // Đọc toàn bộ dữ liệu từ file
            long startTime = System.currentTimeMillis();
            StringBuilder stringBuilder = new StringBuilder();
            for (byte b : fileBytes) {
                stringBuilder.append((char) b);  // Chuyển đổi byte thành ký tự và thêm vào StringBuilder
            }
            long endTime = System.currentTimeMillis();
            System.out.println("Finished reading file using StringBuilder!");
            System.out.println("Time taken: " + (endTime - startTime) + "ms");
        } catch (IOException e) {
            e.printStackTrace();  // In ra chi tiết lỗi nếu có
        }
    }
}


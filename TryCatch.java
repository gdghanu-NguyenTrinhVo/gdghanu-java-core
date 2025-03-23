// Try/catch: được dùng để xử lý ngoại lệ (exception), giúp chương trình không bị dừng đột ngột khi xảy ra lỗi
//try: chứa đoạn mã có khả năng gây lỗi (exception)
//catch: xử lý ngoại lệ nếu nó xảy ra trong khối try

import java.io.*;
public class TryCatch {
    public static void main(String[] args) {
        // try/catch cơ bản
        try {
            int result = 10 / 0; // Dòng này sẽ gây lỗi ArithmeticException
        }
        // Khối catch bắt và xử lý ngoại lệ ArithmeticException
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!"); // In thông báo lỗi
        }
        System.out.println("Program continues running."); // Chương trình tiếp tục chạy sau khi xử lý ngoại lệ

        //Try với nhiều Catch
        try {
            int[] arr = new int[2]; // Khai báo mảng kích thước 2
            arr[5] = 10; // Gây lỗi ArrayIndexOutOfBoundsException
            int result = 10 / 0; // Gây lỗi ArithmeticException
        }
        //Bắt lỗi ArithmeticException
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!"); // Thông báo lỗi chia cho 0
        }
        //Bắt lỗi ArrayIndexOutOfBoundsException
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds!"); // Thông báo lỗi truy cập mảng
        } //Các ngoại lệ cụ thể phải đứng trước ngoại lệ chung (như Exception)

        //try/catch với Exception
        try {
            int result = 10 / 0; // Gây lỗi ArithmeticException
        }
        // Bắt mọi loại ngoại lệ bằng Exception
        catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage()); // In thông báo lỗi chung
        } //Exception là lớp cha của mọi ngoại lệ, nên bắt được tất cả.
          //Dùng e.getMessage() để lấy thông tin chi tiết về lỗi.

        //try/catch với Finally
        try {
            int result = 10 / 2; // Không gây lỗi
            System.out.println("Result: " + result); // In kết quả
        }
        // Bắt lỗi ArithmeticException nếu có
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!"); // Thông báo lỗi chia cho 0
        }
        // Khối finally luôn chạy, bất kể có lỗi hay không
        finally {
            System.out.println("It always executes."); // Thông báo khối finally
        } //finally dùng để thực hiện các tác vụ dọn dẹp như đóng file

        //Try với Multi-Catch trong một khối
        try {
            int[] arr = new int[2]; // Khai báo mảng kích thước 2
            arr[5] = 10 / 0; // Có thể gây cả hai lỗi
        }
        // Bắt cả ArithmeticException và ArrayIndexOutOfBoundsException trong một khối
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage()); // In thông báo lỗi
        }

        //Try-with-Resources
        // Khối try-with-resources khai báo và tự động quản lý FileWriter
        try (FileWriter fw = new FileWriter("output.txt")) {
            fw.write("Hello, Nguyen Trinh Vo"); // Ghi dữ liệu vào file
            System.out.println("Data written to file.");
        }
        // Bắt lỗi IOException nếu có vấn đề khi ghi file
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage()); // In thông báo lỗi
        }

       //Throws example
        try {
            // Gọi phương thức checkAge với tuổi 15
            checkAge(15);
        }
        // Bắt và xử lý ngoại lệ ArithmeticException
        catch (ArithmeticException e) {
            // In thông báo lỗi từ ngoại lệ
            System.out.println("Error: " + e.getMessage());
        }

    }
        //Câu lệnh throw cho phép tạo một lỗi tùy chỉnh
        // Phương thức tĩnh kiểm tra tuổi và có thể ném ngoại lệ
        static void checkAge(int age) {
            // Kiểm tra nếu tuổi nhỏ hơn 18
            if (age < 18) {
                // Ném ngoại lệ ArithmeticException nếu tuổi không đủ
                throw new ArithmeticException("You must be at least 18 years old.");
            }
            // Nếu tuổi hợp lệ (lớn hơn hoặc bằng 18)
            else {
                // In thông báo cho phép truy cập
                System.out.println("You are old enough!");
            }
    }
}


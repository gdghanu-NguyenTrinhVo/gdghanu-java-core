package Scanner;
import java.util.InputMismatchException;
import java.util.Scanner;
/*
-Scanner: đọc dữ liệu đầu vào từ người dùng hoặc các nguồn khác như tệp hoặc luồng
-Phương thức: nextInt(): Đọc một số nguyên từ nguồn dữ liệu
              nextDouble(): Đọc một số thực từ nguồn dữ liệu
              nextLine(): Đọc một chuỗi ký tự từ nguồn dữ liệu
              nextBoolean(): Đọc một giá trị boolean từ nguồn dữ liệu
              nextByte(): Đọc một số byte từ nguồn dữ liệu
              nextShort(): Đọc một số short từ nguồn dữ liệu
              nextLong(): Đọc một số long từ nguồn dữ liệu
              nextFloat(): Đọc một số float từ nguồn dữ liệu
 */
public class MyScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //nhập thông tin
//        System.out.println("Enter number: ");
//        double number = sc.nextDouble(); // nhập kiểu dữ liệu double cho biến number
//        System.out.println("Number: "+number);

        //sử dụng try-catch để bắt lỗi khi nhập dữ liệu
        try{
            System.out.println("Enter number: ");
            double n = sc.nextDouble();
            System.out.println(n);
        }catch (InputMismatchException e){
            System.out.println(e);
        }
    }
}
/*
-Các lỗi khi nhập dữ liệu:
InputMismatchException: Lỗi này xảy ra khi người dùng nhập vào một kiểu dữ liệu không phù hợp với kiểu dữ liệu được yêu cầu bởi phương thức
NoSuchElementException: Lỗi này xảy ra khi không còn dữ liệu để đọc từ nguồn nữa
IllegalStateException: Lỗi này xảy ra khi phương thức được gọi trong trạng thái không hợp lệ

Có thể sử dụng hasNext() để kiểm tra trước khi đọc dữ liệu để tránh những lỗi trên
 */
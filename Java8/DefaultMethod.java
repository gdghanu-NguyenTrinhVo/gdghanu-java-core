package Java8;

/*
Default method:
-Trước java 8, các interface chỉ có thể chứa các phương thức trừu tượng
-Khi một interface đã được định nghĩa và sử dụng trong mã nguồn, việc thêm một method mới vào interface sẽ
phá vỡ cấu trúc của các class đã triển khai giao diện đó -> có thể thêm phuong thức mới vào giao diện mà
không bắt buộc các class phải thay đổi bằng cách sử dụng default mehthod
-Default method cung cấp một hannhf vi mặc định chung, nhưng vẫn cho phép các lớp triển khai giao diện có thể ghi đè
ghi đè nếu cần thiết
 */

interface Example1{
    void method1();
    default void print(){
        System.out.println("Default method!");
    }
}
public class DefaultMethod implements Example1{
    public void method1(){
        System.out.println("Method 1 is running!");
    }

    //không cần triển khai phương thức print()
}

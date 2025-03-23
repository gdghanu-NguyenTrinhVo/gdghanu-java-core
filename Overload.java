//Overload(nạp chồng): cho phép một phương thức có nhiều cách triển khai
//các triển khai này phải được phân biệt bằng danh sách tham số của chúng
//các tham số có thể khác nhau về số lượng, loại hoặc thứ tự.

class Example {
    int sum(int a, int b) { // phương thức sum có 2 tham số kiểu integer là a,b
        return a + b;
    }

    double sum(double a, double b) { // phương thức sum có 2 tham số kiểu double là a,b
        return a + b;
    }

    int sum(int a, int b, int c) { // phương thức sum có 3 tham số kiểu integer là a,b và c
        return a + b + c;
    }
}

public class Overload{
    public static void main(String[] args) {
        Example ex = new Example(); // tạo đối tượng ex mang kiểu Example

        System.out.println(ex.sum(2, 3));  //gọi và in ra kết quả của phương thức sum có 2 tham số kiểu int

        System.out.println(ex.sum(2.5, 3.5)); //gọi và in ra kết quả của phương thức sum có 2 tham số kiểu double

        System.out.println(ex.sum(1, 2, 3));//gọi và in ra kết quả của phương thức sum có 3 tham số kiểu int
    }
}

//String: là 1 kiểu dữ liệu trong java
//sau khi khởi tạo, giá trị của String không thể thay dổi
//Nếu thực hiện các thao tác như nối chuỗi hay thay thế ký tự, một đối tượng String mới sẽ được tạo ra thay vì sửa đổi đối tượng cũ
//String được lưu trong String Pool
//String pool: là một vùng nhớ đặc biệt nằm trong vùng nhớ Heap (Heap memory), dùng để lưu trữ các biến được khai báo theo kiểu String.
//String pool giúp tối ưu hoá việc lưu trữ và sử dụng vùng nhớ khi khai báo biến String, giúp hạn chế tình trạng tràn bộ nhớ Java Heap Space.
class stringExample{
    public static void main(String[] args) {
        String s = "Hello"; // tạo đối tượng "Hello"
        System.out.println(s);
        s = s + " World!"; // Tạo một đối tượng mới: "Hello World!"
        System.out.println(s);

        //s ban đầu trỏ đến "Hello" trong String Pool
        //khi nối thêm " World!", một đối tượng mới được tạo và s chuyển sang trỏ đến đối tượng mới này.

        String pool = "ABCD"; // Tạo string "ABCD"
        String pool1 = "ABCD"; // Tham chiếu đến cùng đối tượng với pool1
        System.out.println(pool1 == pool); //true khi cùng tham chiếu trong String Pool

        //new String() sẽ tạo ra đối tượng nằm ngoài String Pool(nằm trong Heap Memory)
        String pool2 = new String("ABCD");

        System.out.println(pool1 == pool2);    // false vì khác tham chiếu (trong và ngoài String Pool)

    }
}


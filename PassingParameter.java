//Passing parameter(truyền tham số): là cách gửi dữ liệu vào một phương thức (method) khi gọi nó
//giá trị được truyền vào được gọi là tham số thực tế
//các biến nhận giá trị trong định nghĩa phương thức được gọi là tham số hình thức
public class PassingParameter {

    //Khi truyền kiểu nguyên thủy(int, double, float, boolean,...), giá trị thực tế được sao chép vào tham số hình thức.
    //Thay đổi trong phương thức không ảnh hưởng đến biến gốc

    public static void changeValue(int number) {
        number = 100; // Thay đổi bản sao, không ảnh hưởng đến biến gốc
        System.out.println("In method: " + number);
    }

    //Khi truyền kiểu tham chiếu(String, StringBuffer, array,...), một bản sao của tham chiếu (địa chỉ bộ nhớ) được truyền.
    //Thay đổi trạng thái của đối tượng trong phương thức sẽ ảnh hưởng đến đối tượng gốc
    public static void appendText(StringBuffer sb) {
        sb.append(" World!"); // Thay đổi trạng thái của đối tượng gốc
    }

    //Gán lại tham chiếu mới không ảnh hưởng đến biến gốc.
    public static void reassign(StringBuffer sb) {
        sb = new StringBuffer("Nguyen"); // Gán tham chiếu mới, không ảnh hưởng đến gốc
        sb.append(" Trinh Vo");
        System.out.println("In method: "+sb);
    }

    //Có thể truyền nhiều tham số vào 1 method
    public static void sum(int a, int b, int c) {
        int sum = a+b+c; // tính tổng của a, b, c
        System.out.println("Sum = " + sum);
    }
    public static void main(String[] args) {
            //Truyền kiểu nguyên thủy
            int num = 10;
            System.out.println("Before call method: " + num);
            changeValue(num);
            System.out.println("After call method: " + num);

            //Thay đổi biến gốc khi truyền kiểu tham chiếu
            StringBuffer text = new StringBuffer("Hello");
            System.out.println("Before call method: " + text);
            appendText(text);
            System.out.println("After call method: " + text);

            //Không thay đôi biến gốc khi truyền kiểu tham chiếu
            StringBuffer text1 = new StringBuffer("Nguyen");
            System.out.println("Before call method: " + text1);
            reassign(text1);
            System.out.println("After call method: " + text1);

            //Truyền nhiều giá trị
            sum(1,2,3);
            sum(4,5,6);
    }
}

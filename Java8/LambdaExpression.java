package Java8;
/*
-LambdaExpression: là 1 hàm ẩn danh cho phép người dùng chuyển ca phương thức làm đối số
                  không có tên, không thuộc bất kỳ lớp nào, không có phạm vi truy cập, không khai báo giá trị trả về

-Ứng dụng: viết ít code hơn
           hiệu quả hơn nhờ hỗ trợ thực hiện tuần tự và song song qua StreamAPI
           cung cấp implements cho Functional interface
-Cú pháp: (argument list) -> {body}
           phải sử dụng return khi biểu thức lambda chứa nhiều câu lệnh
 */
public class LambdaExpression {
    public static void main(String[] args) {
        PrintString printString = s -> {
            System.out.println(s);
        };
        printString.print("Vo");

        SumInterface sumInterface = (a,b) ->{
            int sum = a+b;
            System.out.println(sum);
            return a+b;
        };
        sumInterface.sumOfNumber(3,5);
    }
}

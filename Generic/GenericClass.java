package Generic;
/*
Trước khi có Generics, các cấu trúc dữ liệu như danh sách (List) thường lưu trữ các đối tượng dưới dạng kiểu chung (ví dụ: Object trong Java).
->phải ép kiểu (casting) khi lấy dữ liệu ra, và dễ xảy ra lỗi nếu kiểu không khớp
-Generics cho phép khai báo kiểu dữ liệu cụ thể khi sử dụng, giúp trình biên dịch kiểm tra kiểu ngay tại thời điểm biên dịch, giảm thiểu lỗi runtime
 */

/*
-Generic class: là một lớp có thể tham chiếu bất kỳ kiểu đối tượng nào
-Quy ước tham số:
    T - Type
    E - Element
    K - Key
    N - Number
    V - Value
-Ký tự Diamond <>: có thể thay thế các đối số kiểu dữ liệu cần thiết để gọi hàm khởi tạo (constructor) của một lớp Generic bằng cặp dấu <>
-Phương thức Generic: phương thức generic có thể chấp nhận bất kỳ kiểu đối số nào
-Ký tự đại diện: Ký tự ? tượng trưng cho phần tử ký tự đại diện
 ví dụ: <? extends Class> có nghĩa là bất kỳ lớp con của Class
-Generics trong các đối tượng Collection: ClassOrInterface<Type>
 */
public class GenericClass<K, V, N, I> {
    public void print (K k, V v, N n, I i){
        System.out.println(k);
        System.out.println(v);
        System.out.println(n);
        System.out.println(i);
    }
}

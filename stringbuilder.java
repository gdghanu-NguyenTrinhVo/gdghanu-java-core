//StringBuilder: có thể thay đổi và
// xử lý các thao tác chuỗi hiệu quả hơn String khi cần thực hiện nhiều thay đổi (nối chuỗi ,lặp lại)
public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        sb.append(" World!"); // Thay đổi trực tiếp trên string builder, không tạo đối tượng mới
        System.out.println(sb);
    }
}

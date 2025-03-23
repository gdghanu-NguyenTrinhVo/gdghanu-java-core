//StringBuffer: giống StringBuffer nhưng nó là đồng bộ -> an toàn trong môi trường đa luồng
public class stringbuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb);
        sb.append(" World!"); // Thay đổi trực tiếp
        System.out.println(sb);
    }
}

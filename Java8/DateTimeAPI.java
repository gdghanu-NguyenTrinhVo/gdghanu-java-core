package Java8;
import java.text.DateFormat;
import java.time.*;

/*
-Date and time API: java.time
-LocalDate: năm - tháng - ngày
-LocalTime: giờ - phút - giây
-LocalDateTime: kết hợp ngày và giờ (năm - tháng - ngày - giờ - phút - giây)
-ZoneDateTime: ngày giờ + múi giờ
-Instant: thời điểm trên dòng thời gian
-Duration: hỗ trợ tính toán chi tiết đến seconds and nanoseconds giữa 2 Date Time
-Period: hỗ trợ tính toán năm/ tháng/ ngày giữa 2 Date Time
-ZoneId: biểu diễn múi giờ
-DateTimeFormatter: định dạng ngày giờ
-Các đối tượng từ java.time đều là bất biến -> tránh lỗi do chỉnh sửa ngoài ý muốn
 */
public class DateTimeAPI {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now(); // lấy giờ ở hiện tại
        System.out.println(time);

        ZoneId id = ZoneId.systemDefault(); // lấy time zone của hệ thống
        System.out.println(id);

        LocalTime specificTime = LocalTime.of(12, 35, 50); //tạo thời gian tùy chỉnh
        System.out.println(specificTime);

        Instant now = Instant.now(); //
        System.out.println(now);

        Period period = Period.between(LocalDate.now(), LocalDate.of(2025, 4, 9)); // khoảng thời gian từ 9/4/2025 đến hiện tại
        System.out.println(period);
    }
}

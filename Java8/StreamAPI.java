package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
-StreamAPI: được thiết kế để làm việc với các tập hợp  dữ liệu (collection) hoặc các nguồn dữ liệu khác hiệu quả, ngắn gọn và hỗ trợ xủ lý song song
            Stream không lưu trữ mà chỉ xử lý dữ liệu
            cấu trúc: tạo stream -> thao tác trung gian(filter, map, sorted,...) -> thao tác kết thúc(collect, forEach, reuce, count,...)

-Tạo stream: từ collection: collection.stream() hoặc collection.parallelStream()
             từ array: Arrays.stream(array)
             từ các nguồn khác: Stream.of(), Stream.generate(), Stream.iterate()

-Các thao tác trung gian thường dùng: filter(Predicate<T> predicate): lọc các phần tử dựa trên đk
                                      map(Function<T,R> mapper): biến đổi mỗi phần tử thành phần tử mới
                                      sorted(): sắp xếp các phần tử
                                      distinct(): loại bỏ các phần tử trùng lặp
                                      limit(long maxSize): giới hạn số lượng phần tử
                                      skip(long n): bỏ qua n phần tử đầu tiên

-Các thao tác kết thúc: collect(Collector): thu thập kết quả vào một collection (toList(), toSet())
                        forEach(Consumer<T> action): thực hiện hành động cho từng phần tử
                        count(): đếm số phần tử trong stream
                        anyMatch(Predicate<T> predicate):Kiểm tra xem có phần tử nào thỏa mãn đk không
                        allMatch(Predicate<T> predicate): kiểm tra tất cả các phần tử có thỏa mãn đk không
                        noneMatch(Predicate<T> predicate): kiểm tra xem không có phần tử nào thỏa mãn đk không
                        findFirst(): lấy phần tử đầu tiên
                        findAny(): lấy một phần tử bất kỳ

-parallelStream(): là phương thức chuyển đổi collection sang stream
                   trả về một luồng song song với source -là collection

-stream() : trả về một luồng tuần tự với source là collection.

 */
public class StreamAPI {
    public static void main(String[] args) {
//        List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9); // list chứa các số integer từ 1 -> 10
////        num.stream() //tạo stream từ list
////                .collector(n -> n%2 == 0) //sử dụng collector để lọc các phần tử chia hết cho 2
////                .map(n->n*2) // chuyển các phần tử đã lọc thành 2 lần chính nó
////                .forEach(System.out::println); // in ra từng phần tử
//
//        Integer sum = num.stream().collector(n -> n >5).reduce(10, Integer::sum);
//        System.out.println(sum);
// dấu "::" là toán tử tham chiếu phương thức được sử dụng để tham chiếu đến 1 phương thức mà không cần thực sự gọi nó
        List<String> animal = Arrays.asList("dog", "cat", "bird", "fish");
        List<String> collector = animal.stream().filter(s -> s.length() > 3).collect(Collectors.toList());
        System.out.println(collector);
    }
}

package MyCollections;
import java.util.*;
/*
-Map được sử dụng để lưu trữ và truy xuất dữ liệu theo cặp key và value
-Mỗi cặp key và value được gọi là mục nhập (entry)
-Map trong java chỉ chứa các giá trị key duy nhất
-Hữu ích nếu phải tìm kiếm, cập nhật hoặc xóa các phần tử trên dựa vào các key
 */

/*
-Các phương thức:
put(Object key, Object value): chèn một mục nhập trong map1 hiện tại
putAll(Map map1): chèn map1 chỉ định vào map1 hiện tại
remove(Object key): xóa một mục nhập của key được chỉ định
get(Object key): trả lại giá trị cho khoá được chỉ định
containsKey(Object key): tìm kiếm key được chỉ định từ map1 hiện tại
keySet(): trả đối tượng Set có chứa tất cả các keys
entrySet(): trả lại đối tượng Set có chứa tất cả các keys và values
getKey(): lấy key
getValue(): lấy value
 */
public class MapExample {

        public static void main(String args[]) {

            Map<Integer, String> map = new HashMap<Integer, String>();
            map.put(100, "A");
            map.put(101, "B");
            map.put(102, "C");

            Set<Integer> set = map.keySet();
            for (Integer key : set) {
                System.out.println(key + " " + map.get(key));
            }

            Map<Integer, String> map1 = new HashMap<Integer, String>();

            map1.put(1, "Java");
            map1.put(3, "C++");
            map1.put(2, "PHP");
            map1.put(4, "Python");

            for (Map.Entry<Integer, String> entry : map1.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
}



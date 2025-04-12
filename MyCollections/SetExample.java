package MyCollections;

import java.util.HashSet;
import java.util.Set;

/*
-Set: là một Collection không thể chứa các phần tử trùng lặp
-HashSet: lưu trữ các phần tử của nó trong bảng băm, là cách thực hiện tốt nhất, tuy nhiên nó không đảm bảo về thứ tự các phần tử được chèn vào
-TreeSet: lưu trữ các phần tử của nó trong một cây, sắp xếp các phần tử của nó dựa trên các giá trị của chúng, về cơ bản là chậm hơn HashSet
-LinkedHashSet: được triển khai dưới dạng bảng băm với có cấu trúc dữ liệu danh sách liên kết, sắp xếp các phần tử của nó dựa trên thứ tự chúng được chèn vào tập hợp (thứ tự chèn)
-EnumSet: là một cài đặt chuyên biệt để sử dụng với các kiểu enum

-Các phương thức: add(Object element): chèn phần tử vào set
                  addAll(Collection c): chèn tất cả các phần tử của c vào set
                  contains(Object element): trả về true nếu tập hợp này chứa phần tử đã chỉ định
                  containsAll(Collection c): trả về true nếu set chứa tất cả các phần tử của collection c đã chỉ định
                  equals(Object o): so sánh các đối tượng được chỉ định với set
                  isEmpty(): trả về true nếu set không chứa phần tử
                  iterator(): trả về một trình vòng lặp iterator để duyệt qua các phần tử của set
                  remove(Object o): Xóa phần tử đã chỉ định khỏi set
                  removeAll(Collection c): Xóa khỏi set tất cả các phần tử của nó được chứa trong collection c đã chỉ định
                  retainAll(Collection c): Chỉ giữ lại các phần tử trong set được chứa trong collection c đã chỉ định
                  size(): Trả về số lượng các phần tử của set
                  toArray(): Trả về một mảng chứa tất cả các phần tử trong set
                  hashCode(): Trả về giá trị mã băm
-Ứng dụng: lưu trữ một tập hợp các phần tử duy nhất
 */
public class SetExample {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(3);
        set.add(7);
        set.add(10);
        set.add(15);
        set.add(8);
        set.add(5);

        System.out.println("Size of set: " + set.size());
        System.out.println(set.contains(6));
        System.out.println(set.contains(10));

        Set<Integer> set1 = new HashSet<>();

        System.out.println(set.isEmpty());

        set1.addAll(set);

        System.out.println("Number of elements in set1: "+ set1.size());

        set1.forEach(n -> {
            System.out.println(n);
        });

    }
}

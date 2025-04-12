package MyCollections;

import java.util.*;
/*
-List: là một interface trong java. Nó chứa các phương thức để chèn và xóa các phần tử dựa trên chỉ số index
-Các phương thức: add(int index,Object element): chèn phần tử vào list tại vị trí index
                  addAll(int index,Collection c): chèn tất cả các phần tử của c vào danh sách bắt đầu tại chỉ số index
                  get(int index): trả về đối tượng được lưu trữ tại chỉ số index trong list
                  set(int index,Object element): gán phần tử cho vị trí được chỉ định index trong list
                  remove(int index): xóa các phần tử tại vị trí có chỉ số index và trả về phần tử đã xóa
                  listIterator(): trả về một Iterator mà bắt đầu từ phần tử đầu tiên của list
                  listIterator(int index): trả về một Iterator mà phần tử bắt đầu từ chỉ số index chỉ định

-ListIterator: là một interface được sử dụng để duyệt các phần tử của List trong java
-Các phương thức: hasNext(): trả về true nếu list interator có tồn tại phần tử kế tiếp phần tử hiện tại
                  next(): trả về phần tử kế tiếp trong danh sách và vị trí con trỏ tăng lên 1
                  hasPrevious(): trả về true nếu list interator có tồn tại phần tử kế sau phần tử hiện tại
                  previous(): trả về phần tử kế sau trong danh sách và vị trí con trỏ giảm đi 1
 */

/*
-ArrayList: được sử dụng như một mảng động để lưu trữ các phần tử
            có thể chứa các phần tử trùng lặp
            duy trì thứ tự của phần tử được thêm vào
            không đồng bộ
            cho phép truy cập ngẫu nhiên vì nó lưu dữ liệu theo chỉ mục
            thao tác chậm vì cần nhiều sự dịch chuyển nếu bất kỳ phần tử nào bị xoá khỏi danh sách

-Constructor: ArrayList() -> tạo một ArrayList trống
              ArrayList(Collection c) -> xây dựng một ArrayList được khởi tạo với các phần tử của collection c
              ArrayList(int capacity) -> xây dựng một ArrayList mà có dung lượng ban đầu được chỉ định
-Các phương thức: bao gồm các phương thức của list và một số phương thức riêng
                  add(Object o): nối thêm phần tử được chỉ định vào cuối một danh sách
                  retainAll(Collection c): xóa những phần tử không thuộc collection c ra khỏi danh sách
                  removeAll(Collection c): xóa những phần tử thuộc collection c ra khỏi danh sách
                  indexOf(Object o): trả về index đầu tiên của phần tử được chỉ định, hoặc -1 nếu danh sách không chứa phần tử này
                  lastIndexOf(Object o):  trả về index cuối cùng của phần tử được chỉ định, hoặc -1 nếu danh sách không chứa phần tử này
                  Object[] toArray(): trả về một mảng chứa tất cả các phần tử trong danh sách này theo đúng thứ tự
                  Object[] toArray(Object[] a): để trả về một mảng chứa tất cả các phần tử trong danh sách này theo đúng thứ tự
                  clone(): trả về một bản sao của ArrayList
                  clear(): xóa tất cả phần tử trong danh sách
                  contains(element): trả về là true nếu tìm thấy element trong danh sách, ngược lại trả về false
 */

/*
-LinkedList: sử dụng cấu trúc danh sách liên kết kép Doubly để lưu trữ các phần tử
             có thể chứa các phần tử trùng lặp
             duy trì thứ tự của phần tử được thêm vào
             là không đồng bộ
             thao tác nhanh vì không cần phải dịch chuyển nếu bất kỳ phần tử nào bị xoá khỏi danh sách
             có thể được sử dụng như list (danh sách), stack (ngăn xếp) hoặc queue (hàng đợi)
-Constructor: LinkedList() : xây dựng một danh sách trống
              LinkedList(Collection c): xây dựng một danh sách chứa các phần tử của collection được chỉ định, theo thứ tự chúng được trả về bởi iterator của collection
-Phương thức: add(Object o): nối thêm phần tử được chỉ định vào cuối một danh sách
              add(int index, Object element): chèn các phần tử được chỉ định tại các chỉ số vị trí quy định trong một danh sách
              addFirst(Object o): chèn phần tử được chỉ định vào đầu danh sách
              addLast(Object o): chèn phần tử được chỉ định vào cuối danh sách
              size(): trả về số lượng các phần tử trong một danh sách
              contains(Object o): trả về true nếu danh sách có chứa một phần tử được chỉ định
              remove(Object o): xóa phần tử được chỉ định đầu tiên trong một danh sách
              getFirst(): trả về phần tử đầu tiên trong một danh sách
              getLast(): trả về phần tử cuoisoo cùng trong một danh sách
              indexOf(Object o): trả về index trong một danh sách với sự xuất hiện đầu tiên của phần tử được chỉ định, hoặc -1 nếu danh sách không chứa bất kỳ phần tử nào
              lastIndexOf(Object o): trả về index trong một danh sách với sự xuất hiện cuối cùng của phần tử được chỉ định, hoặc -1 nếu danh sách không chứa bất kỳ phần tử nào
              contains(element): trả về là true nếu tìm thấy element trong danh sách, ngược lại trả về false
 */
public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("dog");
        list.add("cat");
        list.add("fish");
        list.add("bird");
        list.add("cat");

        System.out.println("Element at index 2 is: "+list.get(2));

        list.set(0, "duck");
        list.remove("cat");
        ListIterator<String> itr = list.listIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        List<String> subList = Arrays.asList("A","B","C");
        list.addAll(2,subList);
        System.out.println(list);

        Object[] arr = list.toArray();
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        System.out.println(list.contains("A"));

        Stack<String> stack = new Stack<>();

        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.addAll(list);
        System.out.println("Linked list: " + linkedList);
        linkedList.addFirst("X");
        System.out.println("After add: "+ linkedList);

        for (String s : linkedList){
            System.out.println(s);
        }
    }
}
/*
=> sử dụng ArrayList khi cần truy xuất phần tử nhiều hơn cập nhật và xóa phần tử
   sử dụng LinkedList khi cần cập nhật và xóa phần tử nhiều hơn là truy cập phần tử
 */
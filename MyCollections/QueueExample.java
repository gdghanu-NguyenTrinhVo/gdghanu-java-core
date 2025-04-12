package MyCollections;
import java.util.PriorityQueue;
import java.util.Queue;
/*
-Queue: được sử dụng để lưu trữ các phần tử theo nguyên tắc First-In-First-Out (vào trước ra trước)
-Các triển khai:ArrayQueue, LinkedList, PriorityQueue
-Phương thức: add(): Chèn phần tử đã chỉ định vào hàng đợi.Nếu thành công, trả về true, nếu không sẽ ném ra một ngoại lệ
              offer(): Chèn phần tử đã chỉ định vào hàng đợi. Nếu thành công, trả về true, nếu không sẽ trả về false
              element(): Trả về phần đầu của hàng đợi. Ném một ngoại lệ nếu hàng đợi trống
              peek(): Trả về phần tử đầu của hàng đợi. Trả về null nếu hàng đợi trống
              remove(): Trả về và xóa phần đầu của hàng đợi. Ném một ngoại lệ nếu hàng đợi trống
              poll(): rả về và loại bỏ phần đầu của hàng đợi. Trả về null nếu hàng đợi trống
 */
public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(5);
        priorityQueue.add(8);
        priorityQueue.add(10);
        priorityQueue.offer(15);
        System.out.println("Queue: "+ priorityQueue);
        Queue<Integer> newQueue = new PriorityQueue<>();
        System.out.println("First element: "+ priorityQueue.element());
        System.out.println("First element: "+ newQueue.peek());
        System.out.println("Remove: "+ priorityQueue.remove());
    }
}

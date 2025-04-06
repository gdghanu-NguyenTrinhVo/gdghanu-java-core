package Thread;
/*
Các trạng thái của thread:
-NEW: khi ở trạng thái NEW, thread chưa bắt đầu chạy
-RUNNABLE: thread đang chạy trong JVM ở trạng thái này
-BLOCKED: thread đang chờ một monitor lock để vào một synchronized block hoặc method
-SLEEP: tạm dừng thread trong 1 khoảng thời gian
-WAITING: 1 thread đang chờ vô thời hạn để 1 thread khác thực hiện 1 hành động cụ thể
-TIME_WAITING: 1 thread đang chờ 1 thread khác thực hiện 1 hành động cụ thể trong 1 khoảng thời gian xác định
-TERMINATED: thread đã kết thúc
 */
public class ThreadState {
    public static void main(String[] args) throws InterruptedException {
        ExtendThread t1 = new ExtendThread();
        ImplementThread im = new ImplementThread();
        Thread t2 = new Thread(im);

        t1.setName("Thread 1");
        t2.setName("Thread 2");

        System.out.println(t1.getName() + " initial state: " + t1.getState());
        System.out.println(t2.getName() + " initial state: " + t2.getState());

        t1.start();

        t1.interrupt(); // không dừng thread nhưng đánh dấu trạng thái ngắt
        System.out.println(t1.isInterrupted());  // kiểm tra xem thread có bị ngắt không

        t1.join(); // Chờ t1 kết thúc
        t2.start();

        t1.sleep(1000); // tạm dừng t1
        System.out.println(t1.getName() + " state after a short delay: " + t1.getState());

        t1.interrupted(); // kiểm tra xem thread có bị ngắt không và xóa trạng thái ngắt
        System.out.println(t1.isInterrupted());

        System.out.println(t2.getName() + " state: " + t2.getState());

    }
}

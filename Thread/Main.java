package Thread;
/*Thread(Luồng):
-Để chạy 1 ứng dụng(application) cần 1 hoặc nhiều Process
-1 process cần ít nhất 1 thread (main thread)
=> thread giúp thực hiện các nhiệm vụ của ứng dụng (thực thi code)
-Multi-thread là cách thực thi nhiều thread song song
-Thread được quản lý bởi Java Virtual Machine(JVM)
 */

/*
Lợi ích:
-Tận dụng tối đa khả năng đa nhân của  vẫn chạy ngầm dưới nền
-Đa luồng giúp tối ưu hóa việc chia sẻ tài nguyên giữa các tác vụ, giảm thời gian chờ đợi và bộ xử lý -> cải thiện hiệu năng của ứng dụng
-Cho phép người dùng tiếp tục sử dụng tính năng khác của ứng dụng trong khi một số tính năng khác tận dụng tối đa tài nguyên hệ thống
-Giúp mã nguồn dễ hiểu, dễ bảo trì hơn
 */

//Tạo thread trong Java:
//Cách 1: extends class Thread từ java.lang
//Cách 2: implements interface Runnable từ java.lang

class ExtendThread extends Thread {
    @Override
    public void run() { // method mà thread sẽ thực thi khi chạy
        for (int i = 1; i<=10; i++){
            System.out.println(i);
        }
    }
}

class ImplementThread implements Runnable {
    @Override
    public void run() {
        for (int i = 11; i<=20; i++){
            System.out.println(i);
        }
    }
}

public class Main extends Thread {
    public static void main(String[] args) {
        ExtendThread t1 = new ExtendThread(); // tạo thread từ class được extends Thread
        //tạo thread từ class được implements Runnable
        ImplementThread imThread = new ImplementThread();
        Thread t2 = new Thread(imThread);
        t1.start(); //khởi động thread
        t2.start();
    }
}

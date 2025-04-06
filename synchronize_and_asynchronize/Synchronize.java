package synchronize_and_asynchronize;
/*
Synchronize(Đồng bộ):
-Đảm bảo tính toàn vẹn của dữ liệu
-Chỉ có một luồng được phép thực thi phương thức hoặc khối mã synchronized tại một thời điểm
-Các luồng khác sẽ phải chờ cho đến khi luồng đang sở hữu quyền giải phóng quyền sở hữu trước khi được phép truy cập vào phương thức hoặc khối mã synchronized
->Giảm thiểu xung đột và đảm bảo tính ổn định của ứng dụng
-Synchronized có thể được sử dụng để bảo vệ cấp độ phương thức hoặc khối mã
-Giúp đơn giản hóa việc đồng bộ hóa các luồng trong ứng dụng đa luồng
-Từ khóa: synchronized
 */

/*
Các kiểu synchronized:
-synchronized method(phương thức đồng bộ): được dùng để khóa đối tượng cho bất kỳ tài nguyên được chia sẻ
-synchronized blocks(khối đồng bộ): có thể được sử dụng để thực hiện đồng bộ hóa trên bất kỳ tài nguyên cụ thể nào của phương thức
                                    Khối đồng bộ được sử dụng để khóa một đối tượng cho bất kỳ tài nguyên dùng chung nào
                                    Phạm vi của khối < phương thức
-static synchronized method(phương thức đồng bộ static):khóa toàn bộ class thay vì chỉ khóa 1 instance của class
 */
public class Synchronize {
    public static void main(String[] args) {
        SynchronizedMethod obj = new SynchronizedMethod();
        SynchronizedBlock obj1 = new SynchronizedBlock();
        StaticSynchronizedMethod obj2 = new StaticSynchronizedMethod();
    /*
        Thread t1 = new Thread() {
            public void run(){
                obj.printTable(5);
                }
            };

        Thread t2 = new Thread(){
            public void run(){
                obj.printTable(100);
            }
        };

        t1.start();
        t2.start();

        Thread t3 = new Thread(){
          public void run(){
              obj1.printTable(10);
          }
        };

        Thread t4 = new Thread(){
            public void run(){
                obj1.printTable(1000);
            }
        };

        t3.start();
        t4.start();

     */
        Thread t5 = new Thread(){
            public void run(){
                obj2.printTable(25);
            }
        };

        Thread t6 = new Thread(){
            public void run(){
                obj2.printTable(50);
            }
        };

        t5.start();
        t6.start();

        }
}


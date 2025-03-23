/*Static: được dùng để chỉ định rằng một thành phần (biến, phương thức, hoặc khối mã) thuộc về lớp thay
    vì thuộc về từng đối tượng và được chia sẻ giữa tất cả các đối tượng của lớp*/

    /*static với biến:
    -Biến static thuộc về lớp, không phải đối tượng.
    -Tất cả các đối tượng chia sẻ cùng một bản sao của biến static
    -Thường dùng để lưu trữ dữ liệu chung hoặc đếm số lượng đối tượng.
    */
    class StaticVariableExample {
        // Biến static đếm số lượng đối tượng
        static int count = 0;

        public StaticVariableExample() {
            count++; // Tăng count mỗi khi tạo đối tượng mới
        }

        public static void main(String[] args) {
            StaticVariableExample obj1 = new StaticVariableExample();
            StaticVariableExample obj2 = new StaticVariableExample();
            System.out.println("Number of objects created: " + count); // Truy cập trực tiếp qua lớp
        }
    }
/*
static với phương thức:
-Phương thức static thuộc về lớp
-Có thể gọi mà không cần tạo đối tượng
-Dùng cho các thao tác không phụ thuộc vào trạng thái đối tượng
 */
class StaticMethodExample {
    // Phương thức static tính tổng
    static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Gọi trực tiếp qua lớp, không cần đối tượng
        int result = StaticMethodExample.sum(5, 3);
        System.out.println("Sum: " + result);
    }
}
    /*
    static với lớp:
    -Một lớp lồng được khai báo static thuộc về lớp ngoài
    -Không cần đối tượng của lớp ngoài để tồn tại
    -Dùng khi lớp lồng có liên quan logic với lớp ngoài nhưng không cần truy cập instance của lớp ngoài
     */
    class StaticNestedClassExample {
        static class NestedClass {
            void display() {
                System.out.println("This is a static nested class.");
            }
        }

        public static void main(String[] args) {
            // Tạo đối tượng của lớp lồng static mà không cần đối tượng lớp ngoài
            StaticNestedClassExample.NestedClass nested = new StaticNestedClassExample.NestedClass();
            nested.display();
        }
    }

        /*
        Từ khóa final được dùng để đánh dấu một thành phần là không thể thay đổi hoặc không thể ghi đè sau khi được định nghĩa.
         */

        /*
        final với biến:
        -Biến final là hằng số, chỉ có thể gán giá trị một lần
        -Dùng để định nghĩa hằng số hoặc ngăn giá trị thay đổi.
         */
        class FinalVariableExample {
            // Biến final phải được khởi tạo khi khai báo hoặc trong constructor
            final int MAX_AGE = 100;

            public static void main(String[] args) {
                FinalVariableExample obj = new FinalVariableExample();
                System.out.println("Max age: " + obj.MAX_AGE);
                // obj.MAX_AGE = 150; // Lỗi: không thể thay đổi biến final
            }
        }
/*
final với phương thức:
-Phương thức final không thể bị ghi đè (override) bởi lớp con.
-Bảo vệ logic của phương thức khỏi sự thay đổi trong lớp con.
 */
class FinalMethodExample {
    // Phương thức final không thể ghi đè
    final void display() {
        System.out.println("This is a final method.");
    }

    public static void main(String[] args) {
        SubClass sc = new SubClass();
        sc.display();

    }
}
class SubClass extends FinalMethodExample {
    // void display() { } // Lỗi: không thể ghi đè phương thức final
}

         /*
final với lớp:
-Lớp final không thể được kế thừa
-Ngăn chặn việc mở rộng lớp khi thiết kế đã hoàn thiện
          */
         class FinalClassExample {
             void show() {
                 System.out.println("This is a final class.");
             }

             public static void main(String[] args) {
                 FinalClassExample fce = new FinalClassExample();
                 fce.show();
             }
         }

      /*
      static final: Tạo hằng số toàn cục thuộc về lớp
       */
      class StaticFinalExample {
          // Hằng số toàn cục
          static final double PI = 3.14159;

          public static void main(String[] args) {
              System.out.println("Value of PI: " + PI);
          }
      }




//Override(ghi đè): xảy ra khi cả lớp con và lớp cha đều có phương thức có cùng cú pháp
//lớp con ghi đè phương thức của lớp cha sẽ làm ẩn phương thức của lớp cha
//mục đích của việc ghi đè là sửa đổi phương thức của lớp cha trong lớp con
//sử dụng từ khóa 'super' để truy cập phương thức được ghi đè của lớp cha

class Animal {
    void makeSound() { // phương thức của lớp cha
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() { // Ghi đè phương thức của lớp cha
        System.out.println("Woof Woof");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog(); // tạo đối tượng animal namg kiểu animal và được tham chiếu từ lớp Dog

        animal.makeSound(); // gọi phương thức của Dog
    }
}

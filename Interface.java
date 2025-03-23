//Interface: một tập hợp các phương thức trừu tượng
//Interface không phải là lớp, mà là một giao diện chứa các hành vi mà lớp con phải thực hiện

interface Action {

    void swim(); //phương thức trừu tượng mà lớp con phải có

    void eat(); //phương thức trừu tượng mà lớp con phải có
}

class Duck implements Action {

    public void swim() {
        System.out.println("Duck swimming!"); // cài đặt phương thức trừu tượng trong lớp con
    }

    public void eat() {
        System.out.println("Duck is eating!"); // cài đặt phương thức trừu tượng trong lớp con
    }
}

public class Interface {
    public static void main(String[] args) {

        Duck duck = new Duck(); //tạo đối tượng duck

        duck.swim(); // gọi phương thức fly()

        duck.eat(); // gọi phương thức eat()
    }
}
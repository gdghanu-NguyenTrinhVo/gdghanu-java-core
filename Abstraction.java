/*Abstraction(tính trừu tượng): ẩn các chi tiết phức tạp và chỉ hiển thị những phần cần thiết
 được thực hiện qua lớp trừu tượng (abstract class) hoặc giao diện (interface)*/

abstract class Animals{    //abstract class: không thể tạo đối tượng trực tiếp

    abstract void animalSound(); // phương thức trừu tượng

    public void animalEat(){ //phương thức cụ thể
        System.out.println("Eating!");
    }
}

class Dogs extends Animals{ // lớp con Dogs kế thừa từ lớp Animals
    public void animalSound() {  // cài đặt phương thức trừu tượng trong lớp con
        System.out.println("Woof woof!");
    }
}

class Abstraction{
    public static void main(String[] args) {
        Dogs myDog = new Dogs(); // tạo đối tượng myDog mang kiểu Dogs
        myDog.animalSound(); // gọi phương thức animalSound() trên đối tượng myDog
        myDog.animalEat(); //gọi phương thức animalEat() dựa vào tính kế thừa
    }

}

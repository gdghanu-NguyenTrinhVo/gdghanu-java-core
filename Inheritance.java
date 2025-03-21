//Inheritance(kế thừa): Cho phép một class mới sử dụng các hàm, phương thức từ một class đã có sẵn.

//Superclass(lớp cha): chứa các thuộc tính và phương thức chung mà các lớp con có thể sử dụng hoặc mở rộng.

class Vehicle {
    protected String brand = "Ford"; //thuộc tính của lớp cha

    public void honk() { //phương thức của lớp cha
        System.out.println("Tuut, tuut!");
    }
}

//Childclass(lớp con): có thể sử dụng các thành phần của lớp cha và bổ sung thêm các thuộc tính, phương thức riêng của nó.

class Car extends Vehicle { //sử dụng từ khóa extends để thiết lập quan hệ kế thừa
    private String modelName = "Everest"; // thuộc tính riêng của lớp Car
    public static void main(String[] args) {

        Car myCar = new Car(); //tạo object của lớp car

        myCar.honk(); // gọi phương thức được kế thừa từ lớp cha

        System.out.println(myCar.brand + " " + myCar.modelName); // truy cập thuộc tính từ cả lớp cha và lớp con
    }
}






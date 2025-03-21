//ví dụ cho tính đóng gói
class Person {
    private String name;
    private int age;

    // Constructor(hàm khởi tạo): khởi tạo đối tượng (object)
    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    //trả về giá trị của name
    public String getName() {
        return name;
    }

    //gán giá trị cho name
    public void setName(String name) {
        this.name = name;
    }

    //trả về giá tr của age
    public int getAge() {
        return age;
    }

    //gán giá trị cho age
    public void setAge(int age) {
        this.age = age;
    }
}

public class Main{
    public static void main(String[] args) {
        //age = 5: biến age là private trong class Person nên không thể gán giá trị cho biến age
        //để sử dụng biến age cần khởi tạo biến
        int age = 20;

        // tạo object person để sử dụng các hàm get, set
        Person person = new Person("Võ", age);
        System.out.println("Name: " + person.getName()); // sử dụng hàm getName để lấy giá trị và in thông tin trên terminal
        System.out.println("Age: " + person.getAge());  // sử dụng hàm getAge để lấy giá trị và in thông tin trên terminal
    }
}
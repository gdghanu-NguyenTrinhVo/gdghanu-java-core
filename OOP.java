//encapsulation(tính đóng gói): đảm bảo về tính bảo mật và giảm sự phụ thuộc giữa các phần của mã nguồn.

public class OOP {

    //biến private chỉ có thể truy cập bên trong class
    private String name;

    //biến public có thể truy cập từ bất cứ đâu
    public int age;

    //biến protected có thể truy cập trong cùng package và package khác qua tính kế thừa
    protected int heigh;

    //biến default chỉ có thể truy cập trong cùng package
    //biến không khai báo từ khóa nào(public, protected, private) là biến default
    String address;

    //hàm get: trả về giá trị của biến
    public String getName(){
        return name;
    }

    //hàm set: gán giá trị cho biến
    public void setAge(int age){
        this.age = age;
    }
}

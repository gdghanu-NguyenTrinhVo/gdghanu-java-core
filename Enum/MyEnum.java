package Enum;
/*
-Enum: là một kiểu dữ liệu đặc biệt của Java được sử dụng để định nghĩa các tập hợp các hằng số
       một enum có thể chứa các trường, phương thức và Constructor
-Enum trong java có thể được định nghĩa bên trong hoặc bên ngoài một lớp, vì nó tương tự như lớp trong java
-Phương thức values() trả về một mảng chứa tất cả các giá trị của enum
-Các hằng số enum có giá trị ban đầu bắt đầu từ 0, 1, 2, 3, ... Nhưng có thể khởi tạo giá trị cụ thể cho các hằng số enum bằng cách định nghĩa các trường và các Constructor
 */

//Enum được định nghĩa trong 1 lớp
public class MyEnum {
    //enum với 2 biến
    enum Season{
        SPRING(5, "SP"), SUMMER(10, "SU"), FALL(15, "F"), WINTER(20, "W");
        private int value;
        private String id;
        private Season(int value, String id){
            this.value = value;
            this.id = id;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }

    public static void main(String[] args) {
        Season season = Season.SPRING;
        System.out.println(season);
        Days days = Days.TODAY;
        System.out.println(days);

        //duyệt các phần tử trong enum
        for (Season s : Season.values()){
            System.out.println(s);
        }
        System.out.println("Spring ID: " + Season.SPRING.getId());
        System.out.println("Spring value: "+ Season.SPRING.getValue());

    }
}

//Enum được định nghĩa bên ngoài 1 lớp
enum Days{
    YESTERDAY, TODAY, TOMORROW;
}

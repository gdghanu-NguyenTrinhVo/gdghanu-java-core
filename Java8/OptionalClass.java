package Java8;
import java.util.NoSuchElementException;
import java.util.Optional;
/*
Optional class:
-Cung cấp một cách tiếp cận tốt ho để xử lý giá trị có thể là null
-Giảm rủi ro của các lồi NullPointerException
-Để sử dụng Optional cần sử dụng java.util.Optional
 */

public class OptionalClass {
    public static void main(String[] args) {
        Optional<String> emptyOptional = Optional.empty(); //khởi tạo Optional

        Optional<Integer> integerOptional = Optional.of(12); // tạo 1 đối tượng Optional chứa 1 gi trị không null
                                                                   //nếu truyền null vào Optional.of thì sẽ xảy ra NullPointerException

        Optional<String> stringOptional = Optional.ofNullable("Hello");// tạo 1 Optional chứa giá trị nếu giá trị truyền vào không phải null
                                                                             //nếu giá trị truyền vào là null thì sẽ tạo ra 1 Optional rỗng

        //ofNullable(): truyền tham số null mà không ném ra exception
        String randString = null;
        Optional<String> emptyString = Optional.ofNullable(randString);

        //sử dụng isPresent() để kiểm tra giá trị có tồn tại không (return true or false)
        System.out.println(emptyOptional.isPresent());
        System.out.println(integerOptional.isPresent());

        //get(): sử dụng để truy cập dữ liệu bên trong Optional. Nếu Optional là null sẽ throw NoSuchElementException
        //System.out.println(emptyOptional.get()); //-> throw NoSuchElementException
        System.out.println(integerOptional.get());

        //orElse(): tiếp tục chạy nếu kết quả là false
         String name = Optional.ofNullable(randString).orElse("Nguyen Trinh Vo");//
        System.out.println(name);

        //ifPresent:check null thay thế cho if(name != null)
        Optional<String> newString = Optional.of("ABCD");
        newString.ifPresent(str -> System.out.println(str));

        //orElseGet(): giống orElse nhưng tham số truyền vào là functional interface
        String newName = Optional.ofNullable(randString).orElseGet(() -> "Ho va ten");
        System.out.println(newName);

        //orElseThrow(): sử dụng custom exception khi bắt được lỗi
        String rand = Optional.ofNullable(randString).orElseThrow(IllegalArgumentException:: new);
    }
}

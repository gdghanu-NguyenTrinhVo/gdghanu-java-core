package Java8;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
/*
-Functional interface: lớp interface chỉ có 1 abstract method

-Một số funtional interface thường dùng:
   +)Function<T, R>: chuyển kiểu đối tượng từ kiểu dữ liệu này sang kiểu dữ liệu khác bằng phương thức apply()
                     phương thức andThen() trả về 1 Function thực hiện hành động theo thứ tự: Function mà phương thức gọi -> Function được truyền đối số
                     phương thức compose() trả về 1 Function thực hiện hành dộng theo thứ tự: Function được truyền đối số -> Function gọi phương thức
                     BiFunction<T, U, R>: giống Function nhưng chấp nhận 2 đối số đầu vào

   +)Predicate<T>: trả về giá trị true hoặc false của tham số kiểu T bằng phương thức test()
                   phương thức and(Predicate<T> t): thực hiện logic AND của predicate được gọi và một predicate khác
                   phương thức or(Predicate<T> t): thực hiện logic OR của predicate được gọi và một predicate khác
                   phương thức negate(): thực hiện phủ định của predicate được gọi
                   BiPredicate<T, U>: predicate với 2 đối số đầu vào
                   isEqual(): kiểm tra 2 đối số có bằng nhau

   +)Consumer<T>: chấp nhận 1 tham số đầu vào và không trả về gì mà thực hiện 1 hành động cụ thể trên đối số đã cho bằng phương thức accept()
                  andThen(): thực hiện lần lượt các consumer
                  BiConsumer<T, U>: consumer với 2 đối số đầu vào


   +)Supplier<T>: không nhận tham số truyền vào và trả về một đối tượng kiểu dữ liệu T bằng phương thức get()

 */

import java.util.function.*;

public class FunctionalInterface {
    public static void main(String[] args) {
        Function<String, Integer> convertToInt = str -> str.length(); //tạo 1 function
        int i = convertToInt.apply("NguyenTrinhVo");// phương thức apply thực hiện chuyển đổi
        System.out.println(i);// kết quả

        Function<Integer, Integer> function1 = integer -> (integer*2);
        Function<String, Integer> andFunction = convertToInt.andThen(function1);// thực hiện Function convertToInt rồi tiếp tục thực hiện function1
        System.out.println(andFunction.apply("ABCD"));

        Function<Integer, Integer> function2 = integer -> (integer*integer);
        Function<Integer, Integer> composeFunction = function1.compose(function2);// thực hiện function 2 rồi tiếp tục thực hiện function1
        System.out.println(composeFunction.apply(5));

        BiFunction<String, String, Integer> biFunction = (str1, str2) -> (str1.length()+str2.length()); //BiFunction với 2 đối số đầu vào là String
        System.out.println(biFunction.apply("ABC", "XYZ"));
        //IntFunction<T> : Function với đối số đầu vào là kiểu int và kết quả đầu ra là kiểu dữ liệu T
        //LongFunction<T> : Function với đối số đầu vào là kiểu long và kết quả đầu ra là kiểu dữ liệu T
        //DoubleFunction<T> : Function với đối số đầu vào là kiểu double và kết quả đầu ra là kiểu dữ liệu T
/*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
        Predicate<Integer> predicate1 = integer -> integer > 2;// tạo 1 predicate
        Predicate<Integer> predicate2 = integer -> integer < 8;
        Predicate<Integer> predicate3 = integer -> integer > 10;
        int j = 9;
        System.out.println(predicate1.test(j)); // phương thức test trả về kiểu boolean

        System.out.println(predicate1.and(predicate2).test(j));// kiểm tra đối số đầu vào có thỏa mãn đk của predicate1 và predicate2 không (2<j && j<8)

        System.out.println(predicate2.or(predicate3).test(j)); // kiểm tra đối số đầu vào có thỏa mãn đk của predicate2 hoặc predicate3 không (j<8 || j>10)

        System.out.println(predicate1.negate().test(1)); //thực hiện phủ định của predicate1 (t < 2)

/*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
        Consumer<Integer> consumer1 = (k) -> System.out.println(k); // tạo consumer in ra 1 số int
        Consumer<Integer> consumer2 = (k) -> System.out.println(k*2);
        consumer1.accept(5);
        Consumer<Integer> combine = consumer1.andThen(consumer2);//thực hiện consumer1 rồi thực hiện consumer2
        combine.accept(10);

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(6);
        list.add(9);
        Consumer<Integer> printInt = integer -> System.out.println(integer);
        list.forEach(printInt); // consumer với forEach()

        BiConsumer<String, Integer> biConsumer = (key, value) -> System.out.println(key + ":" + value);
        biConsumer.accept("Vo", 20);

/*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
        Supplier<String> supplier1 = () -> "Nguyen Trinh Vo"; //tạo supplier
        String print  = supplier1.get(); // phương thức get() gán giá trị cho print
        System.out.println(print);
        Supplier<Integer> supplier2 = () -> 9;
        System.out.println(supplier2.get());

    }
}

package Generic;

import com.sun.org.apache.xml.internal.utils.ListingErrorHandler;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public static void drawShape(List<? extends Shape> list){
        for (Shape s : list){
            s.draw();
        }
    }

    public static void main(String[] args) {
        List<Shape> list = new ArrayList<>();
        list.add(new Rectangle());
        list.add(new Circle());
        drawShape(list);

        GenericClass<String,Integer, Integer,Integer> stringGenericClass = new GenericClass<>();
        stringGenericClass.print("Nguyen Trinh Vo", 1,2,3);

        List<Integer> intList = new ArrayList<>();
        for(int i =0 ; i<10; i++){
            intList.add(i);
        }
        System.out.println(intList);
    }
}

package FileReader;

import java.io.*;

/*
Buffered Streams được sử dụng để tăng tốc độ hoạt động I/O, bằng cách đơn giản là tạo ra một khoảng nhớ đệm với kích thước cụ thể nào đó
 */
public class Buffered {
    public static void main(String[] args) throws IOException {
        BufferedInputStream input = null;
        BufferedOutputStream output = null;
        try{
           FileInputStream inputStream = new FileInputStream("input.txt");
           FileOutputStream outputStream = new FileOutputStream("output.txt");

           input = new BufferedInputStream(inputStream);
           output = new BufferedOutputStream(outputStream);

            int c;
            while ((c = input.read()) != -1){
                    output.write(c);
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }
}

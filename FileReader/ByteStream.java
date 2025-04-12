package FileReader;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
Các chương trình sử dụng Byte Stream để đọc ghi dữ liệu theo từng byte(8bit). Tất cả các class Byte Stream có nguồn gốc từ InputStream và OutputStream.
 */
public class ByteStream {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        try{
           inputStream = new FileInputStream("inputStream.txt");
            outputStream = new FileOutputStream("outputStream.txt");
            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }
}

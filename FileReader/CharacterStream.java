package FileReader;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
Character Stream trong Java được sử dụng để thực hiện input và output cho Unicode 16 bit. Tất cả các class Character Stream có nguồn gốc từ Reader và Writer
 */
public class CharacterStream {
    public static void main(String[] args) throws IOException {
        FileReader in =null;
        FileWriter out = null;

        try{
            in = new FileReader("input.txt");
            out = new FileWriter("output.txt");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }
}

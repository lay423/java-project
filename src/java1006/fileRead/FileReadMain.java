package java1006.fileRead;

import java.io.IOException;

public class FileReadMain {
    public static void main(String[] args) {
        FileRead readFile = new FileRead();
        try {
            System.out.println(readFile.readOneByte("a_file.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

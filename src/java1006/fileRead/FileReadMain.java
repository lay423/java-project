package java1006.fileRead;

import java.io.IOException;

public class FileReadMain {
    public static void main(String[] args) throws IOException {
        FileRead fileRead = new FileRead();
        System.out.println(fileRead.readLine("textfile.txt"));
    }
}

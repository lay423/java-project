package java1006.fileRead;

import java.io.IOException;

public class FileReadMain {
    public static void main(String[] args) throws IOException {
        ReadFilePath readFilePath = new ReadFilePath("./");
        readFilePath.fileList();
        char c = readFilePath.readAChar("textfile.txt");
        System.out.println(c);
    }
}

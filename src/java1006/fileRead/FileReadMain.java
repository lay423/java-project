package java1006.fileRead;

import java.io.IOException;

public class FileReadMain {
    public static void main(String[] args) {
//        FileRead readFile = new FileRead();
//        try {
//            System.out.println(readFile.readOneByte("textfile.txt"));
//            System.out.println(readFile.readTwoByte("textfile.txt"));
//            System.out.println(readFile.readNByte("textfile.txt", 4));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        ReadFilePath readFilePath = new ReadFilePath();
        readFilePath.fileList();
    }
}

package java1006.fileRead;

import java.io.IOException;

public class FileReadMain {
    public static void main(String[] args) throws IOException {
        FileRead fileRead = new FileRead();

        //라인 하나 읽어오는 메소드 테스트
        System.out.println(fileRead.readLine("textfile.txt"));
        //모든 라인 읽는 메소드 테스트
        System.out.println(fileRead.readAllLine("textfile.txt"));
    }
}

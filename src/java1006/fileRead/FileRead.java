package java1006.fileRead;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

    char readOneByte(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename), 16 * 2024);

        return (char)br.read();
    }
}

package java1006.fileRead;

import java.io.File;

public class ReadFilePath {
    void fileList(){
        File dir = new File("./");
        File files[] = dir.listFiles();

        for (File file : files) {
            System.out.println(file);
        }
    }
}

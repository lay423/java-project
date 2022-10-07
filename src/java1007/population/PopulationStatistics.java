package java1007.population;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class PopulationStatistics {

    public void readByChar(String filename) throws IOException{
        FileReader fileReader = new FileReader(filename);

        String fileContents = "";
        while (fileContents.length() < 1_000_000) {
            char c = (char) fileReader.read();
            fileContents += c;
            System.out.println(fileContents);
        }
        System.out.println(fileContents);
    }
    public void readFileByLine(String filename) throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader(filename));
        String s = "";
        String s2;
        while ((s2 = br.readLine()) != null) {
            s += s2;
            System.out.println(s2);
        }
        br.close();
        System.out.println(s);
    }

    public void readByLine2(String filename) {
        try(BufferedReader br = Files.newBufferedReader(Paths.get(filename), StandardCharsets.UTF_8)){
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public PopulationMove parse(String data) {

        String[] arr = data.split(",");
        return new PopulationMove(arr[0], arr[6]);
    }

    //data에서 시도를 찾아 Map에 저장하는 메소드
    public void setMapsByLine(String filename, PopultaionMoveMap popultaionMoveMap) {
        try(BufferedReader br = Files.newBufferedReader(Paths.get(filename), StandardCharsets.UTF_8)){
            String line;
            for (int i = 0; i < 1000; i++) {
                line = br.readLine();
                popultaionMoveMap.save(parse(line));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws IOException {
        String address = "2021_인구관련연간자료_20221006_11746.csv";
        PopulationStatistics populationStatistics = new PopulationStatistics();
        PopultaionMoveMap popultaionMoveMap = new PopultaionMoveMap();

        //data에서 시도를 찾아 Map에 저장하는 메소드
        populationStatistics.setMapsByLine(address, popultaionMoveMap);

        for (int i = 1; i < 1000; i++) {
            System.out.println(popultaionMoveMap.findById(i));
        }
    /*결과
        1 ,11 ,11
        2 ,11 ,11
        3 ,11 ,11
        4 ,11 ,11
        5 ,11 ,11
        6 ,11 ,11
        7 ,11 ,41
        8 ,11 ,44
        9 ,11 ,48
     */

    }

}

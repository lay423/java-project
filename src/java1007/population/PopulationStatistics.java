package java1007.population;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

    //while문 안에서 String을 PopulationMove로 parsing하여 pml에 add합니다.
    //루프가 끝나면 return 합니다.
    public List<PopulationMove> readFileByLineV2(String filename) throws IOException {

        List<PopulationMove> pml = new ArrayList<>();
        BufferedReader br = new BufferedReader(
                new FileReader(filename));
        String s = "";

        while ((s = br.readLine()) != null) {
            PopulationMove pm = parse(s);
        }
        br.close();
        return pml;
    }


    public PopulationMove parse(String data) {

        String[] arr = data.split(",");
        return new PopulationMove(arr[0], arr[6]);
    }

    //data에서 시도를 찾아 Map에 저장하는 메소드
    public void setMapsByLine(String filename, PopultaionMoveMap popultaionMoveMap) {
        try (BufferedReader br = Files.newBufferedReader(Paths.get(filename), StandardCharsets.UTF_8)) {
            String line;
            for (int i = 0; i < 10; i++) {
                line = br.readLine();
                popultaionMoveMap.save(parse(line));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void createAFile(String filename) throws IOException {
        File file = new File(filename);
        file.createNewFile();
    }

    public static void main(String[] args) throws IOException {
        String address = "2021_인구관련연간자료_20221006_11746.csv";
        PopulationStatistics populationStatistics = new PopulationStatistics();


    /*  PopulationMoveMap 테스트
        PopultaionMoveMap popultaionMoveMap = new PopultaionMoveMap();

        //data에서 시도를 찾아 Map에 저장하는 메소드
        populationStatistics.setMapsByLine(address, popultaionMoveMap);

        for (int i = 1; i < 10; i++) {
            System.out.println(popultaionMoveMap.findById(i));
        }
    */
    /*  List테스트
        List<PopulationMove> pml = populationStatistics.readFileByLineV2(address);
        for (PopulationMove populationMove : pml) {
            System.out.println(pml);
        }
    */
        populationStatistics.createAFile("from_to.txt");

    }

}

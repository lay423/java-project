package java1007.population;

import java.io.*;
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
            pml.add(parse(s));
        }
        br.close();
        return pml;
    }


    public PopulationMove parse(String data) {

        String[] arr = data.split(",");
        return new PopulationMove(arr[0], arr[1]);
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

    //List<String>을 지정한 파일에 write
    public void write(List<String> strs, String filename) {
        File file = new File(filename);

        try {
            BufferedWriter writer= new BufferedWriter(new FileWriter(file));
            for (String str : strs) {
                writer.write(str);
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String fromTOString(PopulationMove populationMove) {
        return populationMove.getFromSido() + "," + populationMove.getToSido()+"\n";
    }
    public static void main(String[] args) throws IOException {
        String address = "from_to.txt";
        PopulationStatistics populationStatistics = new PopulationStatistics();


    /*  Map형식으로 받기 테스트
        PopultaionMoveMap popultaionMoveMap = new PopultaionMoveMap();

        //data에서 시도를 찾아 Map에 저장하는 메소드
        populationStatistics.setMapsByLine(address, popultaionMoveMap);

        for (int i = 1; i < 10; i++) {
            System.out.println(popultaionMoveMap.findById(i));
        }
        //출력
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
    /*  List형식으로 받기 테스트
        List<PopulationMove> pml = populationStatistics.readFileByLineV2(address);
        System.out.println(pml.size());

        //출력결과
        6209323
    */
        //populationStatistics.createAFile("from_to.txt");
        List<PopulationMove> pml = populationStatistics.readFileByLineV2(address);
        List<String> strings = new ArrayList<>();
        for (PopulationMove pm : pml) {
            //파일저장
//            String fromTO = populationStatistics.fromTOString(pm);
//            strings.add(fromTO);
            System.out.printf("전입:%s 전출:%s\n", pm.getFromSido(), pm.getToSido());
        }
        System.out.println(pml.size());

//        파일저장
//        populationStatistics.write(strings, "from_to.txt");
    }

}

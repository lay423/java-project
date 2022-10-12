package java1012.line;

import java1012.line.domain.Hospital;
import java1012.line.parser.HospitalParser;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        LineReader<Hospital> hospitalLineReader = new LineReader<>(new HospitalParser());
        String filename = "D:\\문서\\멋사\\서울시 병의원 위치 정보.csv";
        List<Hospital> hospitals = hospitalLineReader.readLines(filename);

        System.out.println(hospitals.size());
        for (Hospital hospital : hospitals) {
            System.out.println(hospital.getId());
        }
    }
}

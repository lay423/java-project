package java1012.line.parser;

import java1012.line.domain.Hospital;

public class HospitalParser implements Parser<Hospital> {

    @Override
    public Hospital parse(String str) {
        String[] splitted = str.split(",");

        return new Hospital(splitted[0]);
    }
}

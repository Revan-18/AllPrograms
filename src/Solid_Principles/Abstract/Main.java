package Solid_Principles.Abstract;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws Exception {
        NumberExtracorReport numberExtracorReport = new NumberExtracorReport();
        numberExtracorReport.sendreport("src/Solid_Principles/data.txt");
    }
}

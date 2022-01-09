package hw18;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    private static final String FILE_NAME_INPUT = "I:\\textIn\\textIn.txt";
    private static final String FILE_NAME_OUTPUT1 = "I:\\textOutput\\str1.txt";
    private static final String FILE_NAME_OUTPUT2 = "I:\\textOutput\\str2.txt";
    private static final String FILE_NAME_OUTPUT3 = "I:\\textOutput\\str3.txt";
    private static final String FILE_NAME_OUTPUT4 = "I:\\textOutput\\str4.txt";
    private static final String FILE_NAME_OUTPUT5 = "I:\\textOutput\\str5.txt";
    private static final String FILE_NAME_OUTPUT6 = "I:\\textOutput\\str6.txt";

    public static void main(String[] args) throws Exception {
        // читаем
           System.out.println(readFromFile(FILE_NAME_INPUT));

        // пишем
        String str1 = "Александровское районное отделение-354,05%;";
        writeStringToFile(FILE_NAME_OUTPUT1, str1);

        // пишем
        String str2 = "Минераловодское районное отделение-234,76%";
        writeStringToFile(FILE_NAME_OUTPUT2, str2);

        // пишем
        String str3 = "Ипатовское районное отделение-210,67%";
        writeStringToFile(FILE_NAME_OUTPUT3, str3);

        // пишем
        String str4 = "Кировское районное отделение-202,35%";
        writeStringToFile(FILE_NAME_OUTPUT4, str4);

        // пишем
        String str5 = "Андроповское районное отделение-167,49%";
        writeStringToFile(FILE_NAME_OUTPUT5, str5);

        // пишем
        String str6 = "Шпаковское районное отделение - 165,25%";
        writeStringToFile(FILE_NAME_OUTPUT6, str6);
    }

    public static String readFromFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
        String str = null;
        StringBuilder sb = new StringBuilder();
        while ((str = br.readLine()) != null) {
            String[] arrayWords = str.split("s+");
            for (String s : arrayWords) {
                sb.append(s + "\n");
            }
        }

        return sb.toString();
    }

    public static void writeStringToFile(String fileName, String str) throws IOException {
        FileWriter fw = new FileWriter(new File(fileName));
        String[] arrayWords = str.split("s+");
        for (String s : arrayWords) {
            fw.write(s + "\n");
        }
        fw.close();
    }
}
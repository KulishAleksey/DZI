package hw18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOClass {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        IOClass io = new IOClass();
        //Читать из файла
        //Писать в файл
        io.processingFiles();
    }

    private void processingFiles() throws FileNotFoundException, IOException {
        FileReader fr = new FileReader("I:\\textIn\\textIn.txt");
        BufferedReader br = new BufferedReader(fr);
        String str = br.readLine();
        String result = "";
        while (str != null) {
            result += "\r\n"+ str;
            str = br.readLine();
            System.out.println();
        }
        FileWriter fw = new FileWriter("I:\\textIn\\textIn2.txt");
        fw.write(result);
        fw.close();
        fr.close();
        br.close();

    }

}
//package hw18;
//
//import javax.swing.*;
//import javax.xml.xpath.XPath;
//import java.io.*;
//import java.nio.file.Path;
//import java.util.ArrayList;
//
//public class SaveFile {
//    public void SaveFile(String name, ArrayList<String> message) {
//
//        path = "C:\\Users\\Paulo Brito\\Desktop\\" + name + ".txt";
//
//        File file1 = new File(path);
//
//        try {
//
//            if (!file1.exists()) {
//
//                file1.createNewFile();
//            }
//
//
//            File[] files = file1.listFiles();
//
//
//            FileWriter fw = new FileWriter(file1, true);
//
//            BufferedWriter bw = new BufferedWriter(fw);
//
//            for (int i = 0; i < message.size(); i++) {
//
//                bw.write(message.get(i));
//                bw.newLine();
//            }
//
//            bw.close();
//            fw.close();
//
//            FileReader fr = new FileReader(file1);
//
//            BufferedReader br = new BufferedReader(fr);
//
//            fw = new FileWriter(file1, true);
//
//            bw = new BufferedWriter(fw);
//
//            while (br.ready()) {
//
//                String line = br.readLine();
//
//                System.out.println(line);
//
//                bw.write(line);
//                bw.newLine();
//
//            }
//            br.close();
//            fr.close();
//
//        } catch (IOException ex) {
//            ex.printStackTrace();
//            JOptionPane.showMessageDialog(null, "Error in" + ex);
//        }
//    }
//}
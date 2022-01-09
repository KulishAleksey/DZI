package hw18;

import java.io.File;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileReader implements Runnable {
    static int count = 0;
    static int count1 = 0;

    public void run()
    {
        try
        {
            Scanner file1 = new Scanner(new File("filetest1.txt"));
            Scanner file2 = new Scanner(new File("filetest2.txt"));

            while (file1.hasNextLine())
            {
                count++;
                file1.nextLine();
            }

            while (file2.hasNextLine())
            {
                count1++;
                file2.nextLine();
            }
        }
        catch(Exception e)
        {
            count = -1;
            count1 = -1;
        }
    }

    public static void main(String args[]) {
        try {
            Thread thr = new Thread(new FileReader());

            thr.start();
            thr.join();

            System.out.println("File one has " + count + " lines");
            System.out.println("File two has " + count1 + " lines");
        } catch (InterruptedException ex) {
            Logger.getLogger(FileReader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
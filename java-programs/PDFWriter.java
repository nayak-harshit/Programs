// not working properly...

import javax.swing.text.Document;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PDFWriter {
    public static void main(String[] args) {
        File file = new File(  "java-pdf.txt");

        try {
            file.createNewFile();
            FileWriter fileWriter = new FileWriter("java-pdf.txt");
            // writing a file
            fileWriter.write("this is a new file and this is the first line \n this is second line");
            // reading a file
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            sc.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

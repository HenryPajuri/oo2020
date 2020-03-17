import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Test
 */
public class FileReadWrite {
    public static void main(String[] args) throws IOException {
        File file = new File("datainput.txt"); // oli test.txt
        File fileW = new File("dataoutput.txt"); // oli test2.txt
        /* System.out.println(
            file.getName() + "\n" +
            file.isFile() + "\n" +
            file.isDirectory() + "\n" +
            file.isHidden() + "\n" +
            file.lastModified()
        ); */

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        BufferedReader br2 = new BufferedReader(new FileReader(new File("test.txt")));

        String line = br.readLine();
        while (line != null){
            System.out.println(line);
            line = br.readLine();
        }

        br.close();
        fr.close();

        if (!fileW.exists()){
            fileW.createNewFile();
        }

        PrintWriter pw = new PrintWriter(fileW);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()){
            String line2 = scanner.nextLine();
            String[] lineData = line2.split(",");
            pw.println(
                "Number is " + Integer.parseInt(lineData[0]) + 
                " and name is " + lineData[1] + 
                " and favourite animal is " + lineData[2] + 
                " and graduation year is " + Integer.valueOf(lineData[3])
            );
            //pw.println(scanner.nextLine().length());
        }

        scanner.close();
        pw.close();
        
    }
}
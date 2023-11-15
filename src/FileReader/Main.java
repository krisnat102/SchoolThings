package FileReader;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\test.txt");
        File file1 = new File("sample.txt");
        if(file1.createNewFile()){
            System.out.println("File created");
        }
        else{
            System.out.println("file not created");
        }
            Scanner fileReader = new Scanner(file);
            int lineNum = 0;

            while(fileReader.hasNextLine()){
                lineNum++;
                System.out.printf("Line %d: %s%n", lineNum, fileReader.nextLine());
            }
            fileReader.close();
    }
}

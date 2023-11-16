package FileReader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static File file = new File("C:\\test.txt");
    static File file1 = new File("sample.txt");
    File file2 = new File("C:\\Users\\XI_B\\IdeaProjects\\ScoolThings\\src\\FileReader\\file");

    private static void PrintFile(File printFile) {
        try{
            Scanner fileReader = new Scanner(printFile);
            int lineNum = 0;

            while(fileReader.hasNextLine()){
                lineNum++;
                System.out.printf("Line %d: %s%n", lineNum, fileReader.nextLine());
            }
            fileReader.close();
        } catch(IOException e){
            e.printStackTrace();
            System.out.println("error");
        }

    }
    private static void CreateFile(float[][] toPrint){
        File file3 = new File("example.txt");
        int lineNum = 0;

        try {
            FileWriter fileWriter = new FileWriter(file3,true);
            Scanner fileReader = new Scanner(file3);
            fileWriter.write(Arrays.toString(toPrint));
            while(fileReader.hasNextLine()){
                lineNum++;
                System.out.printf("Line %d: %s%n", lineNum, fileReader.nextLine());
            }
            fileWriter.close();
            fileReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws IOException {
        float [][] toPrint = new float [4][4];
        for (int i = 0; i < toPrint.length; i++) {
            toPrint[i][i] = i;
        }
        CreateFile(toPrint);
    }
}

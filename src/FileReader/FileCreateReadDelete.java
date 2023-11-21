package FileReader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCreateReadDelete {
    static Scanner sc = new Scanner(System.in);

    public static String fileString(){
        String i = sc.nextLine();
        return i;
    }
    public static void main(String[] args) {
        try{
            File file1 = new File("C:\\Chris\\filename.txt");

            if (file1.createNewFile()) {
                System.out.println("File created: " + file1.getName());
            }
            else  System.out.println("File already exists.");

            FileWriter fileWriter = new FileWriter("filename.txt");
            fileWriter.write(fileString());
            fileWriter.close();

            Scanner myReader = new Scanner(file1);
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();

            /*if(file1.delete()){
                System.out.println("deleted " + file1.getName());
            }
            else System.out.println("failed to delete " + file1.getName());
            */
            if (file1.exists()) {
                System.out.println("File name: " + file1.getName());
                System.out.println("Absolute path: " + file1.getAbsolutePath());
                System.out.println("Writeable: " + file1.canWrite());
                System.out.println("Readable " + file1.canRead());
                System.out.println("File size in bytes " + file1.length());
            } else {
                System.out.println("The file does not exist.");
            }

        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();    
        }
    }
}


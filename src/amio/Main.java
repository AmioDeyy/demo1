package amio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        File myFile = new File("course.txt");
        try {
            myFile.createNewFile();

        } catch (IOException e) {
            System.out.println("cannot create a new file!!!!!");
            e.printStackTrace();
        }


        File m = new File("course.txt");


        try {
            Scanner s = new Scanner(m);
            while(s.hasNextLine()){
                String line = s.nextLine();
                System.out.println(line);
            }
            s.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}




//credit given to JavaOracle and W3 School
//Thank you Daniel for the assistance
import java.util.*;

import java.io.*; //import needed for files
import java.io.BufferedReader;
import java.io.IOException;

public class Functions { // apologies for the bad class name
    public static void main(String[] args) {

        Functions.stringToFile();
        System.out.println(Functions.fileToString());

    }

    public Functions() {

    }

    public static void stringToFile() {

        try {

            Scanner keyboard = new Scanner(System.in);

            String fileName;
            System.out.print("Enter a file name: ");
            fileName = keyboard.next();

            PrintWriter pw = new PrintWriter(fileName); // found out online from Java Oracle and Danny and I disc
            // makes a file under fileName

            String words;

            System.out.print("What would you like to have printed in the file? ");
            words = keyboard.next();

            System.out.println("OK! ITS MADE!");
            pw.print(words);

            pw.close(); // releases the info

        } catch (Exception e) {

            System.out.println(e);

        }

    }

    public static String fileToString() {

        Scanner keyboard = new Scanner(System.in);

        try {
            String name;
            System.out.print("Enter the file name: ");
            name = keyboard.next();

            FileReader fileReader = new FileReader(name); // learnt from Oracle Java and Daniel
            BufferedReader br = new BufferedReader(fileReader); // learnt from Oracle Java and Daniel

            String totalOutput = "";

            totalOutput += br.readLine(); // learnt from oracle java and W3

            return totalOutput;

        } catch (Exception e) {

            System.out.println(e);
            System.out.println("You may have entered the file's name incorrectly!");
            return "";
        }

    }

    public int countCharacters(String fileName) throws IOException {
        int count = 0;
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        while (br.ready()) {
            br.read();
            count++;
        }
        br.close();
        return count;
    }

}
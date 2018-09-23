import java.io.*;
import java.util.Scanner;

public class wordCount {
    public static void main(String[] args) throws Exception {

        FileReader files = new FileReader("C:\\Users\\Benny\\IdeaProjects\\wordCount\\src\\testfile01");
        BufferedReader reader = new BufferedReader(files);

        howToUse();

        int lineNum = 0;

        String file = "";
        String line = reader.readLine();
        while (line != null) {
            file += " " + line;
            line = reader.readLine();
            lineNum++;
        }

        fileReader test = new fileReader(file, lineNum);
        //System.out.println(test.toString());

        System.out.println(test.getLine());
        System.out.println(test.getWordCount(file));
        System.out.println(test.splitChar(file));
    }

    public static void howToUse(){
        System.out.println("wc -l <filename> will print the line count of a file");
        System.out.println("wc -c <filename> will print the line count of a file");
        System.out.println("wc -w <filename> will print the line count of a file");
        System.out.println("wc <filename> will print all of the above");

    }
}

import java.io.*;
import java.util.Scanner;

public class wordCount {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        howToUse();
        int fileCount = 0;
        System.out.println("Please enter wc, wc-l, wc-c, wc-w");
        String answer = sc.nextLine();
        while (!answer.equals("wc") && !answer.equals("wc-l") && !answer.equals("wc-c") && !answer.equals("wc-w")) {
            System.out.println("Please enter a valid response: wc, wc-1, wc-c or wc-w");
            answer = sc.nextLine();
        }
        System.out.println("Please enter a directory");
        String nameInput = sc.nextLine();
        String directory = nameInput;
        File dir = new File(directory);
        File[] fileArray = dir.listFiles();
        for (File read : fileArray) {
            FileReader files = new FileReader(read);
            BufferedReader reader = new BufferedReader(files);
            System.out.println(fileArray[fileCount].getName());
            fileCount++;
            /*int lineNum = 0;
            String file = "";
            String line = reader.readLine();
            while (line != null) {
                file += " " + line;
                line = reader.readLine();
                lineNum++;
            }*/
                int lineNum = 0;
                String file = "";
                String line = reader.readLine();
                while (line != null) {
                    file += " " + line;
                    line = reader.readLine();
                    lineNum++;
                }
                fileReader test = new fileReader(file, lineNum);
                if (answer.equals("wc")) {
                    System.out.println(test.toString());
                } else if (answer.equals("wc-l")) {
                    System.out.println(test.getLine() + " lines");
                } else if (answer.equals("wc-w")) {
                    System.out.println(test.getWordCount(file) + " words");
                } else if (answer.equals("wc-c")) {
                    System.out.println(test.splitChar(file) + " chars");
                }
                }
            }
    public static void howToUse(){
        System.out.println("wc-l follow by <filename> will print the line count of a file");
        System.out.println("wc-c follow by <filename> will print the character count of a file");
        System.out.println("wc-w follow by <filename> will print the word count of a file");
        System.out.println("wc follow by <filename> will all of the above");
    }
}

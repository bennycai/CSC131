import java.io.*;
import java.util.Scanner;

public class wordCount {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        howToUse();
        int fileCount = 0;
        System.out.println("Please enter path of directory/file: ");
        String nameInput = sc.nextLine();
        File dir = new File(nameInput);
        File[] fileArray = dir.listFiles();
        for (File read : fileArray) {
            FileReader files = new FileReader(read);
            BufferedReader reader = new BufferedReader(files);
            System.out.println(fileArray[fileCount].getName());
            fileCount++;
            int lineNum = 0;
            String file = "";
            String line = reader.readLine();
            while (line != null) {
                file += " " + line;
                line = reader.readLine();
                lineNum++;
            }
            fileReader test = new fileReader(file, lineNum);
            System.out.println("Please enter wc, wc-l, wc-c, or wc-w.");
            Scanner sc1 = new Scanner(System.in);
            String answer = sc1.next();
            while (!answer.equals("wc") && !answer.equals("wc=l") && !answer.equals("wc-c") && !answer.equals("wc-w")) {
            /*    int lineNum = 0;
                String file = "";
                String line = reader.readLine();
                while (line != null) {
                    file += " " + line;
                    line = reader.readLine();
                    lineNum++;
                }*/
                //System.out.println(file);
                //System.out.println(lineNum);
                //fileReader test = new fileReader(file, lineNum);
                if (answer.equals("wc")) {
                    System.out.println(test.toString());
                } else if (answer.equals("wc-l")) {
                    System.out.println(test.getLine());
                    break;
                } else if (answer.equals("wc-w")) {
                    System.out.println(test.getWordCount(file));
                } else if (answer.equals("wc-c")) {
                    System.out.println(test.splitChar(file));
                } else {
                    howToUse();
                    answer = sc.next();
                }
            }
        }
    }
    public static void howToUse(){
        System.out.println("wc-l will print the line count of a file");
        System.out.println("wc-c will print the character count of a file");
        System.out.println("wc-w will print the word count of a file");
        System.out.println("wc will print all of the above");

    }
}

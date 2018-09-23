
public class fileReader {
    private String file;
    private int line;
    private int wordCount;
    private int splitChar;

    public fileReader (String file, int line){
        this.file = file;
        this.line = line;
    }

    public int getLine(){
        return line;
    }

    public int getWordCount(String file) {
        String[] splitWord = file.split(" ");
        int wordCount = splitWord.length;
        return wordCount - 1;
    }
    public int splitChar(String file){
        file = file.replace(" ","");
        return file.length();
    }
    public String toString (){
        //System.out.println(file);
        return file;
    }
}

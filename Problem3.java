import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by PC-PC on 3/27/2016.
 */
public class Problem3 {
    public static void main(String[] args) throws IOException {
        String vowelSymbols = "aeiou";
        String punctualSymbols = "!.,?";
        Integer consonants = 0;
        Integer vowels = 0;
        Integer punctuation = 0;

        FileInputStream fileInputStream = new FileInputStream(new File("C:\\Users\\PC-PC\\IdeaProjects\\HomeWorkStreamsAndFiles\\src\\words.txt"));
        FileWriter fileWriter = new FileWriter(new File("C:\\Users\\PC-PC\\IdeaProjects\\HomeWorkStreamsAndFiles\\src\\count-chars.txt"));

                int symbol;

        while ((symbol = fileInputStream.read()) != -1){
            char ch = (char)symbol;
            if (vowelSymbols.contains(ch+"")){
                vowels++;
            }else if (punctualSymbols.contains((ch+""))){
                punctuation++;
            }else if (Character.isLetter(ch)){
                consonants++;
            }
        }
        fileWriter.write(String.format("Vowels: %d%n", vowels));
        fileWriter.write(String.format("Consonants: %d%n", consonants));
        fileWriter.write(String.format("Punctuation: %d%n", punctuation));
        fileInputStream.close();
        fileWriter.close();
    }
}

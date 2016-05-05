import java.io.*;

/**
 * Created by PC-PC on 3/27/2016.
 */
public class Problem2 {
    public static void main(String[] args) throws IOException {

        BufferedReader buffReader = new BufferedReader(new FileReader("C:\\Users\\PC-PC\\IdeaProjects\\HomeWorkStreamsAndFiles\\src\\lines.txt"));

        String fullText = "";
        String tempStr = "";

        while ((tempStr = buffReader.readLine()) != null){
            fullText += tempStr.toUpperCase() + "\n";

        }

        PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\PC-PC\\IdeaProjects\\HomeWorkStreamsAndFiles\\src\\lines.txt")));

        printWriter.write(fullText);
        printWriter.flush();
        buffReader.close();
        printWriter.close();
    }
}

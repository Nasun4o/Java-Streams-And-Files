import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by PC-PC on 3/27/2016.
 */
public class Problem1 {
        public static void main(String[] args)throws FileNotFoundException, IOException {
            // write your code here

            ArrayList<Integer> result = new ArrayList<>();

            try(BufferedReader buffer = new BufferedReader(new FileReader("C:\\Users\\PC-PC\\IdeaProjects\\HomeWorkStreamsAndFiles\\src\\lines.txt"))) {


                String inputLine;
                while ((inputLine = buffer.readLine()) != null){
                    int currentSum = 0;
                    for (int i = 0; i < inputLine.length(); i++) {
                        currentSum+= inputLine.charAt(i);
                    }
                    result.add(currentSum);
                }
            }
            for (int i = 0; i < result.size(); i++) {
                System.out.println(result.get(i));
            }
        }
}


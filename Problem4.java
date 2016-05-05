import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by PC-PC on 3/27/2016.
 */
public class Problem4 {
    public static void main(String[] args)throws IOException {

        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\PC-PC\\IdeaProjects\\HomeWorkStreamsAndFiles\\src\\Pic.jpg");
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\PC-PC\\IdeaProjects\\HomeWorkStreamsAndFiles\\src\\PicCopy.jpg");

        int bytes;
        while ((bytes = fileInputStream.read()) != -1){
            fileOutputStream.write(bytes);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}

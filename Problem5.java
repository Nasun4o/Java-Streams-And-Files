import java.io.*;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;

/**
 * Created by PC-PC on 3/27/2016.
 */
public class Problem5 {
    public static void main(String[] args)throws IOException, ClassNotFoundException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\PC-PC\\IdeaProjects\\HomeWorkStreamsAndFiles\\src\\doubles.list"));
        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(5.6);
        doubles.add(45.6);
        doubles.add(3.46);

        objectOutputStream.writeObject(doubles);
        objectOutputStream.flush();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\PC-PC\\IdeaProjects\\HomeWorkStreamsAndFiles\\src\\doubles.list"));
        System.out.println(objectInputStream.readObject());
        objectInputStream.close();

    }
}

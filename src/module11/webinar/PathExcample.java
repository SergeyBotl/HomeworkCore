package module11.webinar;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExcample {


    public static void main(String[] args) {
        Path path = Paths.get("C:/Users/Sergey/Desktop/file11222.txt");

        File file = new File("C:/Users/Sergey/Desktop/file121.txt");


       try (InputStream in = Files.newInputStream(path);BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {
            String line;

            while((line =reader.readLine())!=null)

            {
                System.out.println(line);
            }
        } catch(IOException x) {
            System.err.println(x);
        }
    }
}

package module11.webinar;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReaderJava7Example {
    public static void main(String[] args) {
        //Path path= Paths.get("C:/Users/Sergey/Desktop/file11.txt");

       try {
            //this is try with resourses, and readed will be cloed automatically
            try (BufferedReader br = new BufferedReader(new FileReader("C:/Users/Sergey/Desktop/file11.txt")))
            {
                StringBuilder sb = new StringBuilder();
                String line = br.readLine();

                while (line != null) {
                    sb.append(line);
                    sb.append(System.lineSeparator());
                    line = br.readLine();
               }

                System.out.println(sb.toString());
          }
        } catch (IOException e) {

        }
    }
}

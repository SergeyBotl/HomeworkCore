package module11.webinar.file;

import java.io.*;

public class FileReaderExcample {
    public static void main(String[] args) throws IOException {
        BufferedReader br;
        FileReader fileReader;
        String everything = null;

        try {
            fileReader = new FileReader("C:/Users/Sergey/Desktop/file.txt");//"/Users/Sergey/Desktop/file.txt"
            br = new BufferedReader(fileReader);

        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            return;
        }

        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                if (line.equals("pop")) {
                    sb.append("mom");
                } else {
                    sb.append(line);
                }
                sb.append(System.lineSeparator());
                line = br.readLine();
            }

            everything = sb.toString();
            System.out.println(everything);


        } catch (IOException e) {

        }

        try {

            BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Users/Sergey/Desktop/file.txt"));


            bw.write("BufferedWriter works");
            bw.append(System.lineSeparator());

            bw.write("BufferedWriter works");
            bw.append(System.lineSeparator());
            bw.write(" BufferedWriter works", 5, 9);
            bw.close();
        } catch (IOException e) {

        }

        try {
            br.close();
            fileReader.close();
        } catch (IOException e) {

        }


    }

}

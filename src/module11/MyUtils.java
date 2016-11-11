package module11;

import java.io.*;
import java.util.*;

public class MyUtils implements Serializable {


    //static




    private static boolean createFile(File file) {
        try {
            if (file.createNewFile()) {
                BufferedWriter bw = new BufferedWriter(new FileWriter(file));
                bw.write(TextFile.text);
                bw.close();
                System.out.println("Create file by link: " + file + "\n");
            }
            return true;
        } catch (IOException e) {
            System.out.println("Wrong create file");
            return false;
        }

    }

    static String fileToString(File file) {
        StringTokenizer st;
        String line;
        StringBuilder sb = new StringBuilder();
        BufferedReader br;
        if (!file.exists()) {
            createFile(file);
        }

        try {
            br = new BufferedReader(new FileReader(file));
            line = br.readLine();
            while (line != null) {
                st = new StringTokenizer(line, " ");
                while (st.hasMoreTokens()) {
                    line = st.nextToken();
                    sb.append(line);
                    sb.append(" ");
                }
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Wrong read file");
        }
        return sb.toString();
    }

    static void writeToFile(File file, String s) {
        if (!file.exists()) {
            createFile(file);
        }

        try {

            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write(s);
            bw.close();
        } catch (IOException e) {
            System.out.println("Wrong write file");
        }

    }
}

package module11;

import java.io.*;
import java.util.*;

public class MyUtils implements Serializable {

    static File linkFile;
    static StringTokenizer st;
    private static String line;
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br;

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
            System.out.println(sb);

        } catch (IOException e) {
            System.out.println("Wrong read file");
        }
        return sb.toString();
    }

//=========================================================================
    static String convert(Map<String, String> map) {

        StringBuilder sb = new StringBuilder();

        for (Map.Entry entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append(" ");
            sb.append(entry.getValue());
            sb.append(System.lineSeparator());

        }
        return sb.toString();
    }

    static void write(String file) throws IOException {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(linkFile))) {
            bw.append(file);
            bw.close();
        }
    }



    public static Map<String, String> readFileMap() {
        Map<String, String> map = new HashMap<>();
        String key, value;
        try {
            try (BufferedReader br = new BufferedReader(new FileReader(linkFile))) {

                String line = br.readLine();
                while (line != null) {
                    st = new StringTokenizer(line, " ");
                    key = null;
                    while (st.hasMoreTokens()) {
                        if (key == null) {
                            key = st.nextToken();
                        } else {
                            value = st.nextToken();
                            map.put(key, value);
                        }
                    }
                    line = br.readLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }

    public static String readFileString() {

        StringBuilder sb = new StringBuilder();
        try {
            try (BufferedReader br = new BufferedReader(new FileReader(linkFile))) {
                String line = br.readLine();
                while (line != null) {
                    st = new StringTokenizer(line, " ");
                    while (st.hasMoreTokens()) {
                        String string = st.nextToken();
                        sb.append(string);
                        sb.append(" ");
                    }
                    sb.append(System.lineSeparator());
                    line = br.readLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    static int check(String string, String check) {
        StringTokenizer st = new StringTokenizer(string, " ");
        String s;
        int i = 0;
        while (st.hasMoreTokens()) {
            s = st.nextToken();
            if (s.equals(check)) i++;
        }
        return i;
    }


}

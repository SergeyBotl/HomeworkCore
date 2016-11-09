package module11;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class MyUtils implements Serializable {

    static String link;
    static StringTokenizer st;

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

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(link))) {
            bw.append(file);
            bw.close();
        }
    }


    public static String replacer(Map<String, String> map, String replace, String toReplace) {
        String key, value;
        StringBuilder sb = new StringBuilder();

        for (Map.Entry entry : map.entrySet()) {
            key = (String) entry.getKey();
            if (key != null && key.equals(replace)) {
                sb.append(toReplace);
            } else {
                sb.append(key);
            }
            sb.append(" ");
            value = (String) entry.getValue();
            if (value != null && value.equals(replace)) {
                sb.append(toReplace);
            } else {
                sb.append(value);
            }
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }

    public static Map<String, String> readFileMap() {
        Map<String, String> map = new HashMap<>();
        String key, value;
        try {
            try (BufferedReader br = new BufferedReader(new FileReader(link))) {

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
            try (BufferedReader br = new BufferedReader(new FileReader(link))) {
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

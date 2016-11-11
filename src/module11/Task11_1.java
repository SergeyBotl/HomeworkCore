package module11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Task11_1 {
 private static   File file = new File("src/module11/file.txt");

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("to", "totoo");

        replacer(map);


   }

    private static String replacer(Map<String, String> map) {
        String contentFile = MyUtils.fileToString(file);
        String line;
        StringBuilder sb = new StringBuilder();
        StringTokenizer st =new StringTokenizer(contentFile," ");
        for (Map.Entry entry:map.entrySet()){
            while (st.hasMoreTokens()){
                line= st.nextToken();
                if (line.equals(entry.getKey())){
                    sb.append(entry.getValue());
                    sb.append(" ");
                }else {
                    sb.append(line);
                    sb.append(" ");
                }
            }
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

}

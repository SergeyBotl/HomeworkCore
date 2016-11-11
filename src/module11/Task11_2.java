package module11;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Task11_2 {
    private static File file = new File("src/module11/file2.txt");

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("totoo", "to");

        File file1 = fileContentReplacer(map);
        String result = MyUtils.fileToString(file1);
        System.out.println(result);


    }

    private static File fileContentReplacer(Map<String, String> map) {
        String contentFile = MyUtils.fileToString(file);
        String line;
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(contentFile, " ");
        for (Map.Entry entry : map.entrySet()) {
            while (st.hasMoreTokens()) {
                line = st.nextToken();
                if (line.equals(entry.getKey())) {
                    sb.append(entry.getValue());
                    sb.append(" ");
                } else {
                    sb.append(line);
                    sb.append(" ");

                    //System.out.println(line);
                }
            }
        }
       // System.out.println(sb.toString());

        MyUtils.writeToFile(file, sb.toString());
        return file;
    }

   /* File fileContentReplacer(Map<String, String> map){
      return null;
    }
*/

}

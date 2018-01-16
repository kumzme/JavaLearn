import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;

public class Test_02 {
    private static Logger log = Logger.getLogger(Test_02.class);

    public static void main(String[] argv) {
        String S1 = "Hello" + "," + "World";
        log.info(S1);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Hello");
        sb2.append(",");
        sb2.append("");
        sb2.append("world");
        String s2 = sb2.toString();
        log.info(s2);
        sb2.deleteCharAt(1);
        String s3 = sb2.toString();
        log.info(s3);
        sb2.insert(5, "ooooo");
        String s4 = sb2.toString();
        log.info(s4);
        sb2.replace(1, 5, "Deepa");
        String s5 = sb2.toString();
        log.info(s5);
        sb2.reverse();
        String s6 = sb2.toString();
        log.info(s6);
        String s = "Java Learing";
        for (char ch : s.toCharArray()) {
         log.info("__________");
         log.info(ch);
        }
        String s1 = "Java Learing math";
        for (int i = 0; i < s1.length(); i++) {
        log.info("char" + i + "is "+ s1.charAt(i) );
            }
        }

/*
    public static int process(BufferedReader is) {
     int sum = 0;
     try {
         String inputline;
         while ((inputline = is.readLine()) != null)
         {
           int i;
           for(i=0;i<inputline.length();i++){
              sum + = inputline.charAt(i);
              }
         }

     } catch (IOException e);
       throw new RuntimeException("IOException: " + e);
    }

*/
}

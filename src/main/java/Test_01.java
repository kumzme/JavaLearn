import org.apache.log4j.Logger;

import java.util.StringTokenizer;

public class Test_01 {
    //Learn oops concept //overloading,overridding //supoer,this
    private static Logger log = Logger.getLogger(Test_02.class);
    public final static int MaxFields = 5;
    public final static String Delim = "|";

    public static void main(String[] av) {

        aaaa();
        StringTokenizer();
        printResults("A|B|C|D", process("A|B|C|D"));
        printResults("A||C|D", process("A||C|D"));
        printResults("A|||D|E", process("A|||D|E"));
    }

    public static void aaaa() {
        String a = "Java is great.";
        log.info(a);
        String b = a.substring(5); // b is the String "is great."
        log.info(b);
        String c = a.substring(5, 7);// c is the String "is"
        log.info(c);
        String d = a.substring(5, a.length());// d is "is great."
        log.info(d);

        for (String word : a.split(" ")) {
            log.info(word);
        }

    }

    public static void StringTokenizer() {
        StringTokenizer st = new StringTokenizer("Hello, World|of|Java", ", |", true);
        while (st.hasMoreElements()) log.info("Token: " + st.nextElement());
    }

    public static void printResults(String input, String[] outputs) {
        log.info("Input: " + input);
        for (String s : outputs) log.info("Output " + s + " was: " + s);
    }


    public static String[] process(String line) {
        String[] results = new String[MaxFields];
        StringTokenizer st = new StringTokenizer(line, Delim, true);
        int i = 0;
        while (st.hasMoreElements()) {
            String s = st.nextToken();
            if (s.equals(Delim)) {
                if (i++ >= MaxFields) {
                    log.info("too many fields");
                    continue;
                }
                results[i] = s;
            }
        }
        return results;
    }
}

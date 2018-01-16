import org.apache.log4j.Logger;

public class Test_03 {
    private static Logger log = Logger.getLogger(Test_02.class);

    public static void main(String[] args) {
        String S = "java Cookbook";
        log.info(S.toLowerCase());
        log.info(S.toUpperCase());
        if (S.equals("java Cookboo")) {
            log.info("pass");
        }
        else{
            log.info("fail");
        }

    }
}

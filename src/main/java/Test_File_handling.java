import org.apache.log4j.Logger;
//import Test_04_Input_File;
import java.io.*;
public class Test_File_handling {
    private static Logger log = Logger.getLogger(Test_File_handling.class);

    public static void main(String[] filename) throws Exception{
        String current_Directory = System.getProperty("user.dir");
        String file_Path = current_Directory + "/" + "src" + "/" + "main" + "/" + "resources" + "/"  + filename;
        log.info(file_Path);
        Test_04_Input_File.check_If_The_File_Exists(file_Path);

    }
}


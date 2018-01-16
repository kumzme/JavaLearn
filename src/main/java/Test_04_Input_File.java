import org.apache.log4j.Logger;
import sun.jvm.hotspot.debugger.posix.elf.ELFSectionHeader;

import java.io.*;
import java.util.StringTokenizer;

public class Test_04_Input_File {
    private static Logger log = Logger.getLogger(Test_02.class);
    private static BufferedReader br;

    public static void main(String[] args) {

    }

    public static boolean check_If_The_File_Exists(String file_Path) throws Exception {

        File newfile = new File(file_Path);
        Boolean some_Flag = null;
        if (newfile.isDirectory()) {
            log.info("'filename' exists and it is a directory");
            some_Flag =    false;
        }

        if (newfile.isFile()) {
            log.info("'filename' exists and it is a file");
            some_Flag = true;
        }
        return  some_Flag;

    }

    public static void open_File(String filename) throws Exception {
        if (check_If_The_File_Exists(filename)) {
            FileReader fr = new FileReader(filename);
            br = new BufferedReader(fr);
        }
    }
    public static void read_File(String filename) throws  Exception{
        //File new_File = new File(filename);

        String name = "aaaa";
        open_File(filename);
            //reads file until there are no more lines, using a null check

            while(name == br.readLine().toString()) {
                log.info("Name: " + name);
            }
            br.close();

    }
    public static void write_File(String filename){

    }


}



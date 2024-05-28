package icx.util;

/**
 *
 * @author ksoff
 */
import java.io.File;

public class CheckFile {

//    public CheckFile(String path) {
//        check(path);
//    }

    public boolean check(String path) {
        try {
            File myObj = new File(path);
            if (myObj.exists()) {
                System.out.println("File name: " + myObj.getName());
                System.out.println("Absolute path: " + myObj.getAbsolutePath());
                System.out.println("Writeable: " + myObj.canWrite());
                System.out.println("Readable " + myObj.canRead());
                System.out.println("File size in bytes " + myObj.length());
            } else {
                System.out.println("The file does not exist.");
            }
            return myObj.exists();
        } catch (Exception e) {
            return false;
        }
    }
}

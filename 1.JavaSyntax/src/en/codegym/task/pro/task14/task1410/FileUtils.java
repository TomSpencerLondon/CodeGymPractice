package en.codegym.task.pro.task14.task1410;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

public class FileUtils {

    public static void readFile(String filePath) throws FileNotFoundException {
        System.out.println("Reading the file contents: " + filePath);
    }

    public static void writeFile(String filePath) throws FileSystemException {
        System.out.println("Writing data to the file: " + filePath);
    }
}

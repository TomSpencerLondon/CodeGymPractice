package en.codegym.task.pro.task14.task1411;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

public class FileManager {

    private void readFile(String filePath) throws FileNotFoundException {
        System.out.println("Reading the file contents: " + filePath);
    }

    private void writeFile(String filePath) throws FileSystemException {
        System.out.println("Writing data to the file: " + filePath);
    }

    public void copyFile(String sourceFile, String destinationFile) {
        try {
            readFile(sourceFile);
            writeFile(destinationFile);
        } catch (FileNotFoundException | FileSystemException e) {
            throw new RuntimeException(e);
        }
    }
}

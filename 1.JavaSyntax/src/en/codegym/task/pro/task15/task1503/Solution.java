package en.codegym.task.pro.task15.task1503;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
There are a lot of resources
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (Scanner sc = new Scanner(System.in);
            BufferedReader br = Files.newBufferedReader(Path.of(sc.nextLine())) ) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}


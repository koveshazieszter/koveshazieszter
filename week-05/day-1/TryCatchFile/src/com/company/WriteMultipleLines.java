package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WriteMultipleLines {
    public static void main(String[] args) {

       writeLineCount(5,"line.txt","alma");

    }

    static String writeLineCount(int number, String pathPlace, String word) {
        Path file = Path.of(pathPlace);
        List<String> line = new ArrayList<String>();
        try {
            for (int i = 0; i < number; i++) {
                line.add(word);
            }
            Files.write(file, line);
            System.out.println(Arrays.toString(line.toArray()));

        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }
        return String.valueOf(line);
    }
}

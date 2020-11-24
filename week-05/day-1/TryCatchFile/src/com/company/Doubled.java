package com.company;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Doubled {
    public static void main(String[] args) {
        try {
            System.out.println(doubled("double.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static String doubled(String pathPlace) throws IOException {
        Path path = Paths.get(pathPlace);
        ArrayList<String> checkDouble = new ArrayList(Files.readAllLines(path));
        StringBuilder newfile = new StringBuilder();

        String check=checkDouble.toString();
        for (int i = 0; i < check.length() - 1; i++) {
            if (Objects.equals(check.charAt(i), check.charAt(i + 1))) {
               newfile.append(check.charAt(i));
            }
        }
        System.out.println(newfile);
        return String.valueOf(newfile);
    }

}

package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReversedLines<reverseStr> {
    public static void main(String[] args)  {
        try {
            reversed("reversed.txt");
        }
        catch (IOException e) {
            throw new IllegalStateException("No such file!",e);
        }
    }

    static String reversed(String pathPlace) throws IOException  {
        Path path = Paths.get(pathPlace);
        ArrayList<String> lineReversed = new ArrayList(Files.readAllLines(path));
        StringBuilder revers = new StringBuilder();
        for (String Lline : lineReversed) {
            revers.append(Lline + "\n");
        }
        StringBuilder reverseStr = revers.reverse();
        System.out.println(reverseStr);
        return String.valueOf(reverseStr);
    }
}

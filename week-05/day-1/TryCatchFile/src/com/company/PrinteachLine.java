package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.ScatteringByteChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;


class PrintEachLine {


    public static void main(String[] args) {

        Path file = Path.of("my-file.txt");

        try {
            List<String> myFile = Files.readAllLines(file);
            for (String employee: myFile) {
                System.out.println(myFile);
            }

        } catch (IOException e) {
            throw new IllegalStateException("Unable to read file: my-file.txt", e);
        }
    }

}



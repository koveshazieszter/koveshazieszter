package com.company;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class CopyFile {
// Írj egy függvényt, ami átmásolja egy fájl tartalmát egy másikba
// A két fájl nevét paraméterként kapja meg
// És visszaad egy boolean értéket, attól függően,
// hogy sikeres volt-e a másolás
    public static void main(String[] args) throws IOException {

        System.out.println(fileCopyUsingGuava("my-file.txt", "red.txt"));

    }
    static Boolean fileCopyUsingGuava(String path, String pathCopy) throws IOException {
        Path file = Paths.get(path);
        Path fileCopy = Path.of(pathCopy);
        boolean copy = false;
        try {
            copy = false;
            if (copy = true) {
                Files.copy(file, fileCopy);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return copy;
    }
}




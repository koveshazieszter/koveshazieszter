package com.company;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.Collections;


// Hozz létre egy függvényt, ami képes fájlokat mainpulálni:
        // a fájlba beleírja a nevedet, egy sorba.
        // A fájlnak a neve "my-file.txt" legyen.
        // Ha a program nem tudja megnyitni a fájlt,
        // akkor a következő üzenetet kell kiírnia: "Unable to write file: my-file.txt"




public class WriteSingleLine {
    public static void main(String[] args) throws IOException {
        fileMamanipulating("Eszter");

    }
    static String fileMamanipulating(String yourName) throws IOException {
        Path file = Path.of("my-file.txt");
        try {

            Files.writeString(file, yourName);
        }
        catch(IOException ioe){
            throw new IllegalStateException("Can not write file", ioe);

        }
        return yourName;
    }
}

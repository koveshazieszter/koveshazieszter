package com.company;

import com.sun.jdi.Value;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class EncodecLines {



        public static void main(String[] args)  {
            try {
                encoding("encoded-lines.txt");
            }
            catch (IOException e) {
                throw new IllegalStateException("No such file!",e);
            }
        }
        static String encoding(String pathPlace) throws IOException  {
            Path path = Paths.get(pathPlace);
            ArrayList<String> lineEncoding= new ArrayList(Files.readAllLines(path, Charset.forName("UTF-8")));
            StringBuilder encode = new StringBuilder();
            char[] myCharArray = new char[lineEncoding.size()];
            for (String line:lineEncoding) {
                line.toCharArray();
            }
            String textEncoded=" ";
            int char_code;
            for (char c: myCharArray){
                if(c== ' ' || c== '\n'){
                    textEncoded+=c;
                }else{
                    char_code =c;
                    int prev_char_code = char_code -1;
                    char prev_char = (char) prev_char_code;
                    textEncoded += prev_char;
                }
            }
            System.out.println( textEncoded);
            return String.valueOf(textEncoded);
        }
    }



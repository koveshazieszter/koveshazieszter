package com.company;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Lottery {
    // Hozz létre egy metódust, ami megtalálja az 5 legsűrűbben
    // előforduló lottószámot a lottery.csv-ben
    public static void main(String[] args) {
        try {
            readInputAndFindTopNumbers("lottery.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readInputAndFindTopNumbers(String inputFile) throws IOException {
        ArrayList<Integer> numbers = readNumbers(inputFile);
        HashMap<Integer, Integer> counts = countNumbers(numbers);
        Integer[] top5Numbers = findTopNumbers(counts, 5);

        // kiiratas
        for (int i = 0; i < top5Numbers.length; ++i) {
            System.out.print(top5Numbers[i] + " ");
        }
    }

    public static Integer[] findTopNumbers(HashMap<Integer, Integer> counts, Integer n) {
        Integer[] topNumbers = new Integer[n];
        for (int i = 0; i < n; ++i) {
            Integer maxLocation = findTop1Number(counts);
            topNumbers[i] = maxLocation;
            counts.remove(maxLocation);
        }

        return topNumbers;

    }

    public static Integer findTop1Number(HashMap<Integer, Integer> counts) {
        Integer max = 0;
        Integer maxLocation = -1;
        for (Integer key : counts.keySet()) {
            if (max < counts.get(key)) {
                max = counts.get(key);
                maxLocation = key;
            }
        }

        return maxLocation;
    }

    public static HashMap<Integer, Integer> countNumbers(ArrayList<Integer> numbers) {
        HashMap<Integer, Integer> counts = new HashMap<Integer, Integer>();
        // insert logic
        for (int line : numbers) {
            if (counts.containsKey(line)) {
                counts.put(line, counts.get(line) + 1);
            } else {
                counts.put(line, 1);
            }
        }

        return counts;
    }

    public static ArrayList<Integer> readNumbers(String inputFile) throws IOException {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Path path = Paths.get(inputFile);
        ArrayList<String> lines = new ArrayList<String>(Files.readAllLines(path));
        for (String line : lines) {
            String[] records = line.split(";");
            for (int i = 11; i < 16; ++i) {
                numbers.add(Integer.valueOf(records[i]));
            }
        }

        return numbers;
    }
}

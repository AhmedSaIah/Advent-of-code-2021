//--- Day 1 " Sonar Sweep " ---
// https://adventofcode.com/2021/day/1

import java.util.*;
import java.util.ArrayList;

import java.io.*;

public class day1 {
    public static void main(String[] args) throws Exception {
        System.out.println(increasmentValue(readFile("src/main/resources/input.txt")));
    }

    public static ArrayList<Integer> readFile(String filePath) throws Exception {
        File file = new File(filePath);
        Scanner sc = new Scanner(file);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (sc.hasNextLine()) {
            numbers.add(Integer.parseInt(sc.nextLine()));

        }
        return numbers;

/*
        Checking the record of each line in the file by using this loop
       for (int i : numbers) {
       System.out.println(i);
       }

*/
    }

    public static int increasmentValue(ArrayList<Integer> arr) {

        int previousValue = arr.get(0);
        int increaseTimes = 0;

        for (int i = 1; i <= arr.size() - 1; i++) {
            if (arr.get(i) > previousValue) {
                increaseTimes++;
                previousValue = arr.get(i);
            } else
                previousValue = arr.get(i);

        }

        return increaseTimes;
    }
}

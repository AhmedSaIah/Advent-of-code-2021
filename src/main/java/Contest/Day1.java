package Contest;//--- Day 1 " Sonar Sweep " ---
// https://adventofcode.com/2021/day/1

import java.util.*;
import java.util.ArrayList;

import java.io.*;

public class Day1 {
    public static void main(String[] args) throws Exception {
        System.out.println(increasmentValue(readFile("src/main/resources/input.txt")));
        System.out.println(partTwo(readFile("src/main/resources/input.txt")));
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

    public static int partTwo(ArrayList<Integer> arr){
        int i=0;
        int increasment = 0;
        int sumOfPreviousThreeValues = arr.get(i)+arr.get(i+1)+arr.get(i+2);
        int sumOfNewThreeValues= arr.get(i+3)+arr.get(i+4)+arr.get(i+5);
        for(i=0; i<arr.size()-2; i++){
            if(sumOfPreviousThreeValues < sumOfNewThreeValues){
                increasment++;
                i++;
            }

        }
        return increasment;
    }
}

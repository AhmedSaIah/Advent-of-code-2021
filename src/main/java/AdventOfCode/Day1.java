package AdventOfCode;
//--- Day 1 " Sonar Sweep " ---
// https://adventofcode.com/2021/day/1
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) throws Exception {
        File file = new File("src/main/resources/input.txt");
        Scanner myReader = new Scanner(file);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (myReader.hasNextLine()) {
            numbers.add(Integer.parseInt(myReader.nextLine()));
        }

        int part1 = day1Solve(numbers, 1);
        int part2 = day1Solve(numbers, 3);
        //part 1
        System.out.println(part1);
        //part 2
        System.out.println(part2);
    }
/*
        Checking the record of each line in the file by using this loop
       for (int i : numbers) {
       System.out.println(i);
       }
*/

    public static int day1Solve(ArrayList<Integer> input, int count) {

        //int previousValue = input.get(0);
        int increaseTimes = 0;
        for (int index = 0; index < input.size() - count; index++) {
            increaseTimes = increaseTimes + (input.get(index + count) > input.get(index) ? 1 : 0);
        }
        return increaseTimes;
    }

}

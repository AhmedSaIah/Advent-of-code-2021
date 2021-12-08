package Day2;
//--- Day 2 " Dive! " ---
// https://adventofcode.com/2021/day/2

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) throws FileNotFoundException {
        List<Movement> data = new ArrayList<>();
        File file = new File("src/main/resources/Day2_Input.txt");
        Scanner myReader = new Scanner(file);
        while (myReader.hasNextLine()) {
            String[] line = myReader.nextLine().split(" ");
            data.add(new Movement(line[0], line[1]));

        }
        System.out.println(partOne(data));

    }

    public static int partOne(List<Movement> input) {
        int horizontalDegree = 0;
        int depthDegree = 0;
        for (Movement cmd : input) {
            if (cmd.direction == 1) {
                horizontalDegree = horizontalDegree + cmd.value;
            } else if (cmd.direction == 2) depthDegree += cmd.value;
            else {
                depthDegree = depthDegree - cmd.value;
            }
        }
        return horizontalDegree * depthDegree;
    }

}

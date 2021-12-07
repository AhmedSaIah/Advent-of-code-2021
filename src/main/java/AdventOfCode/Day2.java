package AdventOfCode;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> str = new ArrayList<>();
        File file = new File("src/main/resources/inputDay2.txt");
        Scanner myReader = new Scanner(file);
        while (myReader.hasNextLine()) {
            String[] line = myReader.nextLine().split("\\s+");
            str.add(line[0]);
            numbers.add(Integer.parseInt(line[1]));

            // str.add(myReader.nextLine());
        }
        System.out.println(partOne(str, numbers));

//        for(int i =0; i<directionValueMap.size(); i++){
//            System.out.println(directionValueMap);
//        }


        //System.out.println(partOne());
    }

    public static int partOne(ArrayList<String> direction, ArrayList<Integer> value) {
        int horizontal = 0;
        int depth = 0;
        for (int i = 0; i <= direction.size() - 1; i++) {
            if (direction.get(i).length()  == 4) {
                depth = depth + value.get(i);
            } else if (direction.get(i).length() == 2) {
                depth = depth - value.get(i);
            } else {
                horizontal = horizontal + value.get(i);
            }

            // System.out.println(direction.get(i));
            //System.out.println(value.get(i));
            System.out.println(direction.get(i));
            System.out.println(direction.get(i).length());
            //System.out.println(horizontal);
            //System.out.println(depth);
        }
        return horizontal * depth;
    }


}

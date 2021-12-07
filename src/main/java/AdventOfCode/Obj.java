package AdventOfCode;

public class Obj {
        public int key;
        public int value;

        Obj(String direction, String value) {
            this.value = Integer.parseInt(value);
            switch (direction) {
                case "forward":
                    key = 0;
                    break;
                case "up":
                    key = 1;
                    this.value = -this.value;
                    break;
                case "down":
                    key = 2;
            }
        }
    }


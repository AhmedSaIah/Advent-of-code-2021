package Day2;

public class Movement {
     int direction;
     int value;

    Movement(String direction, String directionValue) {
        this.value = Integer.parseInt(directionValue);
        switch (direction) {
            case "forward" -> this.direction = 1;
            case "down" -> this.direction = 2;
            case "up" -> this.direction = 3;
        }
    }

}

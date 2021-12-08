package Day2;

public class Movement {
     int direction;
     int value;
     int aim;

    Movement(String direction, String directionValue) {
        this.value = Integer.parseInt(directionValue);
        switch (direction) {
            case "forward" :
                this.direction = 1;
            break;
            case "down" : this.direction = 2;
            break;
            case "up" : this.direction = 3;
        }
    }

}

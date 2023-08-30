public class Chandrayaan3 {
    private int x;
    private int y;
    private int z;
    private char direction;

    public Chandrayaan3() {
        x = 3;
        y = 0;
        z = 65;
        direction = 'N';
    }

    public void executeCommands(String[] commands) {
        for (String command : commands) {
            executeCommand(command);
        }
    }

    private void executeCommand(String command) {
        switch (command) {
            case "f":
                moveForward();
                break;
            case "b":
                moveBackward();
                break;
            case "r":
                turnRight();
                break;
            case "l":
                turnLeft();
                break;
            case "u":
                moveUp();
                break;
            default:
                System.out.println("Invalid command: " + command);
        }
    }

    private void moveForward() {
        if (direction == 'N') {
            y++;
        } else if (direction == 'E') {
            x++;
        } else if (direction == 'S') {
            y--;
        } else if (direction == 'W') {
            x--;
        }
    }

    private void moveBackward() {
        if (direction == 'N') {
            y--;
        } else if (direction == 'E') {
            x--;
        } else if (direction == 'S') {
            y++;
        } else if (direction == 'W') {
            x++;
        }
    }

    private void turnRight() {
        if (direction == 'N') {
            direction = 'E';
        } else if (direction == 'E') {
            direction = 'S';
        } else if (direction == 'S') {
            direction = 'W';
        } else if (direction == 'W') {
            direction = 'N';
        }
    }

    private void turnLeft() {
        if (direction == 'N') {
            direction = 'W';
        } else if (direction == 'E') {
            direction = 'N';
        } else if (direction == 'S') {
            direction = 'E';
        } else if (direction == 'W') {
            direction = 'S';
        }
    }

    private void moveUp() {
        z++;
    }

    public void printFinalPositionAndDirection() {
        System.out.println("Final Position: (" + x + ", " + y + ", " + z + ")");
        System.out.println("Final Direction: " + direction);
    }

    public static void main(String[] args) {
        String[] commands = { "f", "r", "u", "b", "l" };
        Chandrayaan3 rover = new Chandrayaan3();
        rover.executeCommands(commands);
        rover.printFinalPositionAndDirection();
    }
}

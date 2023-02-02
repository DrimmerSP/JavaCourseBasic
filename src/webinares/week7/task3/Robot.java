package webinares.week7.task3;

/*
Робот. Команды повернуть влево, повернуть вправо, идти.
Несколько конструкторов, хранение координат, вывод потом координат на экран.
 */

public class Robot {
    private int x;
    private int y;
    private int direction; //0 top, 1 right, 2 bottom, 3 left

    public Robot() {
        this.x = 0;
        this.y = 0;
        this.direction = 0;
    }

    public Robot(int x, int y) {
        this.x = x;
        this.y = y;
        this.direction = 0;
    }

    public Robot(int x, int y, int direction) {
        this(x, y);
        this.direction = direction;
    }

    public void go() {
        System.out.println("Initial X: " + x);
        System.out.println("Initial Y: " + y);
        System.out.println("Initial direction: " + direction);
        System.out.println("-----------------------------");
        System.out.println("!!!! GO GO GO !!!!");
        System.out.println("-----------------------------");
        switch (direction) {
            //top
            case 0:
                y++;
                break;
            //right
            case 1:
                x++;
                break;
            //bottom
            case 2:
                y--;
                break;
            //left
            case 3:
                x--;
                break;
            default:
                break;
        }
        System.out.println("!!!! STOP WALKING !!!!");
        System.out.println("-----------------------------");
        System.out.println("After walk X: " + x);
        System.out.println("After walk Y: " + y);
        System.out.println("After walk direction: " + direction);
        System.out.println("-----------------------------");
    }

    public void turnLeft() {
        System.out.println("!!!! TURNING LEFT !!!!");
        System.out.println("-----------------------------");
        direction = (direction - 1) % 4;
    }

    public void turnRight() {
        System.out.println("!!!! TURNING RIGHT !!!!");
        System.out.println("-----------------------------");
        direction = (direction + 1 ) % 4;
    }

    public void printCoordinates() {
        System.out.println("(x, y) = [" + x + ", " + y + " ]");
    }
}

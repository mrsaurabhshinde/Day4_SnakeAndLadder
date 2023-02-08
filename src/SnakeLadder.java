import java.util.Random;

public class SnakeLadder {
    int startposition = 0;
    static Random ch = new Random();
    static int getrandomvalue (){
        int randomvalue = ch.nextInt(6) +1;
        return randomvalue;
    }
    public static void main(String[] args) {

        System.out.println("Here start the snake Ladder Program");
        int randomvalue = getrandomvalue();
        System.out.println(randomvalue);

    }
}
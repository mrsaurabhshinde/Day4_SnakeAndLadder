import java.util.Random;

public class SnakeLadder {
    static int startgame = 0;
    static  int dice = 0;
    static Random rand = new Random();
    static int getRandomvalue() {
        Random ch = new Random();

        int randomvalue = ch.nextInt(6) +1;
        System.out.println("player roll the die");
        randomvalue = randomvalue + 1;
        System.out.println("dice ; " +randomvalue);
        return randomvalue;
    }
    static int getRandomoption(int startposition,int dice) {
        int randomoption =rand.nextInt(3);
        randomoption = randomoption + 1;
        System.out.println("checkoption: " +randomoption);


        switch (randomoption){
            case 0:
                System.out.println("no play then  player stays in same position");
                break;
            case 1:
                startgame = startgame + dice;
                System.out.println("ladder the player moves ahead : "+startgame);
                break;
            case 2:
                startgame = startgame - dice;
                System.out.println("snake the player moves behind : " +startgame);
                break;
        }
        return randomoption;
    }
    public static void main(String[] args) {
        System.out.println("Here start the snake Ladder Program");

        dice = getRandomvalue();
        getRandomoption( dice , startgame);



    }
}
import java.util.Random;

public class SnakeLadder {
    static Random random = new Random();
    static int getRandomValue(){
        int randomValue = random.nextInt(6);
        System.out.println("Player Roll the die");
        randomValue = randomValue + 1;
        System.out.println("dice : " +randomValue);
        return randomValue;
    }

    static int getRandomOption(int startgame, int dice) {
        int randomOption = random.nextInt(3);
        randomOption = randomOption + 1;
        System.out.println("Choose option : " +randomOption);

        switch(randomOption) {
            case 0 :
                System.out.println("no play then player stay same position");
                break;
            case 1 :
                startgame = startgame + dice;
                System.out.println("Ladder the Player moves ahead :" + startgame);
                break;
            case 2 :
                if(startgame >= 0)
                    startgame = startgame - dice;
                System.out.println("Snake the player moves behind : " + startgame);
                break;
            default :
        }
        System.out.println();
        return startgame;
    }

    public static void main(String[] args) {

        int startgame = 0;
        int dice ;
        int countDice = 0;
        int countPosition = 0;

        System.out.println("Welcome to Snake And Ladder Game \n");
        System.out.println("Single Player at start position " +startgame);
        while (startgame <= 100)	{
            dice = getRandomValue();
            countDice ++;
            int t = startgame;
            startgame=getRandomOption(startgame , dice);
            if(startgame > t)
                countPosition ++;
        }
        if (startgame > 100) {
            int temp = startgame - 100;
            startgame = startgame - temp;
            System.out.println("win the game position is : "+startgame);
            System.out.println("Number of count dice : "+countDice);
            System.out.println("number of count position : "+countPosition);
        }
        else {
            System.out.println("Win the game postion : " +startgame);
            System.out.println("number of count dice : "+countDice);
            System.out.println("number of count position : "+countPosition);
        }
    }

}
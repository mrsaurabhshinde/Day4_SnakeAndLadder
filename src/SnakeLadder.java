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

    static int getRandomOption(int startPosition, int dice) {
        int randomOption = random.nextInt(3);
        randomOption = randomOption + 1;
        System.out.println("Choose option : " +randomOption);

        switch(randomOption) {
            case 0 :
                System.out.println("no play");
                break;
            case 1 :
                startPosition =startPosition + dice;
                System.out.println("Ladder the Player moves ahead :" + startPosition);
                break;
            case 2 :
                if(startPosition >= 0)
                    startPosition = startPosition - dice;
                System.out.println("Snake the player moves behind : " + startPosition);
                break;
            default :
        }
        System.out.println();
        return startPosition;
    }

    public static void main(String[] args) {

        int startPosition1 = 0;
        int startPosition2 = 0;
        int dice ;
        int countDice1 = 0;
        int countPos1 = 0;
        int countDice2 = 0;
        int countPos2 = 0;

        System.out.println("Welcome to Snake And Ladder Game \n");
        System.out.println("Player-1 at start position " +startPosition1);
        System.out.println("Player-2 at start position " +startPosition2);

        while (startPosition1 <= 100 || startPosition2 <= 100)	{
            Random random = new Random();
            int play = random.nextInt(2);
            play = play +1;
            if (play == 1) {
                dice = getRandomValue();
                countDice1 ++;
                int t = startPosition1;
                startPosition1=getRandomOption(startPosition1 , dice);
                if(startPosition1 > t)
                    countPos1 ++;
                if(startPosition1 > 100)
                    break;
            }
            else {
                dice = getRandomValue();
                countDice2 ++;
                int t = startPosition2;
                startPosition2=getRandomOption(startPosition2 , dice);
                if(startPosition2 > t)
                    countPos2 ++;
                if(startPosition2 > 100)
                    break;
            }
        }
        if (startPosition1 > 100 || startPosition2 > 100) {
            int temp1 = startPosition1 - 100;
            startPosition1 = startPosition1 - temp1;
            int temp2 = startPosition2 - 100;
            startPosition2 = startPosition2 - temp2;

            if (startPosition1 == 100 ) {
                System.out.println("Player-1 win the game position : "+startPosition1);
                System.out.println("Player-1 No of count dice : "+countDice1);
                System.out.println("Player-1 no of count position : "+countPos1);
            }
            else if (startPosition2 == 100 ) {
                System.out.println("Player-2 win the game position : "+startPosition2);
                System.out.println("Player-2 No of count dice : "+countDice2);
                System.out.println("Player-2 no of count position : "+countPos2);
            }
        }
        else {
            if (startPosition1 == 100) {
                System.out.println("Player-1 Win the game postion : " +startPosition1);
                System.out.println("Player-1 no of count dice : "+countDice1);
                System.out.println("Player-1 no of count position : "+countPos1);
            }
            else {
                System.out.println("Player-2 Win the game postion : " +startPosition2);
                System.out.println("Player-2 no of count dice : "+countDice2);
                System.out.println("Player-2 no of count position : "+countPos2);
            }
        }
    }
}
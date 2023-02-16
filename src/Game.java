import java.sql.Statement;

public class Game {
    static int position1;
    static int position2;

    static int roll;


    public static void main(String[] args) {
        System.out.println("There are 2 players\nPlayer 1 will play 1st");
       while(position1 < 100 && position2 < 100 ) {
           Player1();
           Player2();
       }
        if(position1 == 100){
            System.out.println("\nresult :Player 1 Won");
        } else if (position2 == 100) {
            System.out.println("\nresult :Player 2 Won");

        }
        System.out.println("\nTotal Dice roll : " + roll);


    }

    public static int UC2() {
        roll++;
        int Dice = (int) ((Math.random() * 10) % 6 + 1);
        return Dice;

    }

    public static int UC3() {
        int Move = (int) ((Math.random() * 10) % 3);
        return Move;
    }

    public static void Player1() {
        System.out.println("\nPlayer 1 Playing");
        int Move = UC3();
        if (Move == 0) {
            System.out.println("No PLay");
            System.out.println("Player 1 Position : " + position1);
        } else if (Move == 1) {
            System.out.println("Ladder");
            int dice = UC2();
            System.out.println("Dice : " + dice);
            int check = 100 - position1;
            position1 = position1 + dice;
            if (position1 > 100) {
                System.out.println("Player 1 position is going above 100\nyou need exact " + check + " on dice");
                position1 = position1 - dice;
            }
            System.out.println("Player 1  Position : " + position1);
            Player1();
        } else {
            System.out.println("Snake");
            int dice = UC2();
            position1 = position1 - dice;
            System.out.println("Dice : " + dice);
            if (position1 < 0) {
                position1 = 0;
            }
            System.out.println("Player 1 Position : " + position1);
        }
    }

    public static void Player2() {
        System.out.println("\nPlayer 2 Playing");
        int Move = UC3();
        if (Move == 0) {
            System.out.println("No PLay");
            System.out.println("Player 2 Position : " + position2);
        } else if (Move == 1) {
            System.out.println("Ladder");
            int dice = UC2();
            System.out.println("Dice : " + dice);
            int check = 100 - position2;
            position2 = position2 + dice;
            if (position2 > 100) {
                System.out.println("Player 2 position is going above 100\nyou need exact " + check + " on dice");
                position2 = position2 - dice;
            }
            System.out.println("Player 2 Position : " + position2);
            Player2();
        }else{
            System.out.println("Snake");
            int dice = UC2();
            position2 = position2 - dice;
            System.out.println("Dice : " + dice);
            if (position2 < 0) {
                position2 = 0;
            }
            System.out.println("Player 2 Position : " + position2);
            }

            }


        }



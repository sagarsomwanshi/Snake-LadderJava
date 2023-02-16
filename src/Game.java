import java.sql.Statement;

public class Game {
    static int position;
    int check;
    static int roll;


    public static void main(String[] args) {
       while(position <100) {
           UC3();
           UC6();
       }

    }
    public static void UC1(){
        position = 0;
    }

    public static int UC2(){
        roll++;
        int Dice = (int) ((Math.random() * 10) % 6 + 1);
        return Dice;

    }
    public static void UC3(){

        int Move = (int) ((Math.random() * 10) % 3);
        if(Move == 0){
            System.out.println("\nNo PLay");
        } else if (Move == 1) {
            System.out.println("\nLadder");
            int dice = UC2();
            System.out.println("Dice : " +dice);
            int check = 100 - position;
                position = position + dice;
                UC5(dice,check);
            System.out.println("Your Position : " +position);
        }else {
            System.out.println("\nSnake");
            int dice = UC2();
            position = position - dice;
            System.out.println("Dice : " +dice);
            if(position < 0){
                UC1();
            }
            System.out.println("Your Position : " +position);
        }
    }
    public static void UC5(int dice, int check){

        if(position > 100){
            System.out.println("position is going above 100\nyou need exact " +check+ " on dice");
            position = position - dice;
        }
    }
    public static void UC6(){
        if(position == 100) {
            System.out.println("\nTotal Dice rolls : " + roll);
            System.out.println("You won the game ");
        }
    }

}


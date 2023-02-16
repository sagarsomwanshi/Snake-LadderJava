public class Game {
    static int position;
    int Dice;
    public static void main(String[] args) {
        UC3();

    }
    public static void UC1(){
        position = 0;
    }

    public static int UC2(){
        Game G = new Game();
            G.Dice = (int) ((Math.random() * 10) % 6 + 1);
            return G.Dice;
    }
    public static void UC3(){
        int Move = (int) ((Math.random() * 10) % 3);
        if(Move == 0){
            System.out.println("No PLay");
        } else if (Move == 1) {
            System.out.println("Ladder");
            int dice = UC2();
            System.out.println("Dice : " +dice);
            position = position + dice;;
            System.out.println("Your Position : " +position);
        }else {
            System.out.println("Snake");
            int dice = UC2();
            position = position - dice;
            System.out.println("Dice : " +dice);

            System.out.println("Your Position : " +position);
        }
    }
}


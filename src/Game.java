public class Game {
    static int position;
    int Dice;
    public static void main(String[] args) {
        UC1();
        UC2();

    }
    public static void UC1(){
        position = 0;
    }

    public static void UC2(){
        Game G = new Game();
            G.Dice = (int) ((Math.random() * 10) % 6 + 1);
            System.out.println(G.Dice);
    }
}


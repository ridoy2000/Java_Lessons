public class Methods_Ex1 {
    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Asad", highScorePosition);

        highScorePosition = calculateHighScorePosition(600);
        displayHighScorePosition("Usama", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("zubair", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Daniel", highScorePosition);

    }

    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get into position " + position);
    }

    public static int calculateHighScorePosition(int score){

        if (score >= 1000){
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        }
            return 4;
    }
}

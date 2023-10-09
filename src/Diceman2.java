import java.util.Random;

public class Diceman2 {
    public static void main(String[] args) {
        Random gen = new Random();
        int dice = gen.nextInt(6) + 1;
        String diceString;
        switch (dice) {
            case 1:
                diceString = "1";
                break;
            case 2:
                diceString = "2";
                break;
            case 3:
                ;
                diceString = "3";
                break;
            case 4:
                ;
                diceString = "4";
                break;
            case 5:
                ;
                diceString = "5";
                break;
            case 6:
                ;
                diceString = "6";
                break;

            default:
                diceString = "Invalid number";
                break;
        }
        System.out.println("Du har ramt en"); System.out.println(diceString);


    }
}

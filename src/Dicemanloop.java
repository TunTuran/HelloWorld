
import javax.swing.*;
import java.util.Random;

public class Dicemanloop {
    public static void main(String[] args) {
        Random gen = new Random();
        int dice;
        String activity = "";
        int answer;
        boolean keepGoing =true;
        System.out.println("Dicemanloop");

        while (keepGoing) {
            dice =gen.nextInt(6)+ 1;


            while (dice != 6) {
                if (dice == 1) {
                    activity = "Breakfast";
                } else
                    if (dice == 2) {
                    activity = "Study";
                }
                if (dice == 3) {
                    activity = "Swim";
                } else
                    if (dice == 4) {
                    activity = "Go fishing";
                } else
                    if (dice == 5) {
                    activity = "Call mom";
                } else
                    if (dice == 6) {
                    activity = "Go to bed";
                }
                System.out.println(activity);

 //               if (dice==6) keepGoing=false;

                answer= JOptionPane.showConfirmDialog(null,activity+"\n Try again ?", "Diceman Loop", JOptionPane.YES_NO_CANCEL_OPTION);
                if (answer==JOptionPane.NO_OPTION) keepGoing=false;

            }

            System.out.println("Goodbye");
        }
    }
}


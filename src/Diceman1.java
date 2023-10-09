
import java.util.Random;

public class Diceman1 {
    public static void main(String[] args) {
        Random gen=new Random();
        int dice=gen.nextInt(6)+1;
        String activity="";

        System.out.println("Diceman 1");
        if (dice==1)   {
            activity="Breakfast";
        } else
         if (dice==2)   {
             activity="Study";

    }
        if (dice==3)   {
            activity="Swim";
        }  else
         if (dice==4)   {
             activity="Go fishing";
         }  else
           if (dice==5)   {
               activity="Call mom";
    }   else 
        if (dice==6)   {
            activity="Go to bed";
        }

        System.out.println(activity);
        System.out.println("Goodbye");
    }
}

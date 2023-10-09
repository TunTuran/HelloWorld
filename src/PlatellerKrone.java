import java.sql.SQLOutput;
import java.util.Random;

public class PlatellerKrone {
    public static void main(String[] args){
        Random gen=new Random();
        int tal=gen.nextInt(2);
        System.out.println("tal= " +tal);

        if (tal==0) {
            System.out.println("Plat");
            System.out.println("Tillykke du vandt g");
        }
        else {

            System.out.println("Krone");
            System.out.println("HAHAHAH du tabte ");
        }
            System.out.println("Tak for i dag DU!");
    }
}

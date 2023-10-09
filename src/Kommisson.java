import java.util.Scanner;

public class Kommisson {
    public static void main(String[] args) {
        java.util.Scanner tastatur= new java.util.Scanner(System.in);
        int dollar;
        double euro,kommission,omregning,beloeb;
        System.out.println("Indtast det ønskede beloeb der ønskes at veksle");
        dollar = tastatur.nextInt();
        euro= 0.92;
        omregning= dollar*euro;
                kommission= omregning *0.2;
        beloeb=omregning-kommission;
        if (kommission>=0.5)
            System.out.println(dollar+ "Dollars er " +beloeb+  " med kommission");
        else
            System.out.println(dollar+ "dollars med kommission hvor der er under 0.5 er" +omregning);

    }
}

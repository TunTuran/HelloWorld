public class porto {
    public static void main(String[] args) {
        java.util.Scanner tastatur = new java.util.Scanner(System.in);

        System.out.println("Det koster 20 kr, at sende brevet uden porto");


        System.out.println("Indtast hvor meget dit brev vejer:");

double gram = tastatur.nextInt();
double belob,prisudenporto,belob1,prisalt,prisalt1;
belob = 20;
belob1 = 12;
prisudenporto = 20;
prisalt = belob + prisudenporto;
prisalt1 = belob1 + prisudenporto;



        if (gram>= 500)
            System.out.println("dit porto koster "  +belob+ "kr. fordi dit brev vejer mere end 500g");
        else
            System.out.println("dit porto koster "  +belob1+ "kr. fordi dit brev vejer mindre end 500g");

        if (gram>= 500)
            System.out.println("dit brev koster  i alt " +prisalt+ "kr.");
        else
            System.out.println("dit porto koster i alt "  +prisalt1+ "kr.");








    }
}

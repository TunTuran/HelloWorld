public class Copenhagen {
    public static void main(String[] args) {
printRegistering("Carl Emil", "D", 1556);
printRegistering("Mustafa", "D ", 1459);
printRegistering("Johan", "B", 1345);

    }
    static void printRegistering(String name, String bogstav, int nr){
        System.out.println("Kære " +name);
        System.out.println("Vi er glade for din registering");
        System.out.println("Dit løbenummer er " +nr);
        System.out.println("Du løber med gruppen " +bogstav);
        System.out.println("Du bedes være klar 10 minutter før vi løber");
        System.out.println();
    }
}

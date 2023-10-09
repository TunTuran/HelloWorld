public class invitation {
    public static void main(String[] args) {
        printInvitation("Ole", "Slik");
        printInvitation("Pia", "is");
        printInvitation("Ulla", "PS 5");

    }
    static void printInvitation(String name,String gave){
        System.out.println("Kære " +name);
        System.out.println("Det ville glæde mig meget, at se dig til min fødselsdag");
        System.out.println("Onsdag 4/6 kl 14.00");
        System.out.println("PS: medbring " +gave);
        System.out.println("Venlig hilsen ");
        System.out.println("Tun");

        System.out.println();

    }
}

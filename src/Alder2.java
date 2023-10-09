public class Alder2
{
    public static void main(String[] arg)
    {
        int alder,alder16,alder22;
        alder = 15;
        alder16 = 16;
        alder22 = 22;


        if (alder >= 18)
            System.out.println("Du er myndig.");
        else
            System.out.println("Du er ikke myndig.");

        System.out.println("Du er " + alder + " år.");

        if (alder >= 16)
            System.out.println("Du er myndig.");
        else
            System.out.println("Du er ikke myndig.");

        System.out.println("Du er " + alder16 + " år.");

        if (alder <= 22)
            System.out.println("Du er myndig.");
        else
            System.out.println("Du er ikke myndig.");

        System.out.println("Du er " + alder22 + " år.");
    }
}

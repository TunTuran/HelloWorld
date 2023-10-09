package BankApp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import java.util.random.RandomGenerator;

public class BankApp3 {
    public static void main(String[] args) {

        Account a1=new Indlaan("Mauro Icardi",5);
        Account a2=new Hojrente("Hakim Ziyech", 10, 10000, LocalDate.of(2023, 12,24));
        Kredit a3=new Kredit("Enes Grunda",0.5,100);
        Millionær a4= new Millionær("Fernando Muslera", 0, 0);
        BorneOps a5= new BorneOps("Victor Nelsson",10, 10000, LocalDate.of(2038, 12,24));


        ArrayList<Account> list=new ArrayList<Account>();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        list.add(a5);


        for (Account a: list) a.printTransactions();

a2.withdraw(578);

a2.printTransactions();

a5.withdraw(3400);
a5.printTransactions();


    }
}
class Indlaan extends Account{
Indlaan(String ow, double ir){
    super(ow,ir);
    balance=5000;

}
    void withdraw(double amount){
    if (balance>=amount){
        super.withdraw(amount);
    }
    else {
        System.out.println("FEJL!!  Du kan højst hæve "+balance+ "kr.");
    }
    }
}
class Hojrente extends Account{
    LocalDate releaseDate;

    Hojrente(String ow, double ir, double startBalance, LocalDate rd){
        super (ow, ir);
        super.deposit(startBalance);
        releaseDate=rd;
    }
    void deposit(double amount){
        System.out.println("Du kan ikke sætte penge ind på denne konto");
    }
    void withdraw(double amount){
        if (releaseDate.isAfter(LocalDate.now()))
            System.out.println("FEJL! FEJL! FEJL! Du kan ikke hæve endnu");
else
    super.withdraw(amount);
        }
    }

    class Kredit extends Account {
        double creditlimit;


        Kredit(String ow, double ir, double balance) {
            super(ow, ir);
            super.deposit(balance);
            creditlimit=-10000;

        }

        void deposit(double amount) {
            super.deposit(amount);
        }

        void withdraw(double amount) {
            super.withdraw(amount);
        }

        @Override
        public String toString() {
            return super.toString() + " Kreditmax " + creditlimit;
        }
    }
 class Millionær extends Account {

    public Millionær(String ow, double ir, double balance){
        super(ow,ir);
        super.deposit(balance);

}

     @Override
     void deposit(double amount) {
         super.deposit(amount);

     }
 }
class BorneOps extends Account {
    LocalDate releaseDate;

    BorneOps(String ow, double ir, double startBalance, LocalDate rd) {
        super(ow, ir);
        super.deposit(startBalance);
        releaseDate = rd;
    }

    void deposit(double amount) {
        super.deposit(amount);
    }

    void withdraw(double amount) {
        if (releaseDate.isAfter(LocalDate.now()))
            System.out.println("FEJL! FEJL! FEJL! Du kan ikke hæve endnu, da du stadig er under 18");
        else
            super.withdraw(amount);
    }
}


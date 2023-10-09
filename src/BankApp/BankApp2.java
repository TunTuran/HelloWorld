package BankApp;

import java.time.LocalDate;
import java.util.ArrayList;

public class BankApp2 {
    public static void main(String[] args) {
        Account a1=new Account("Mauro Icardi", 5);
        Account a2=new Account("Hakim Ziyech", 7);
        Account a3=new Kredit("Enes Grunda",0.5,1000000);

a1.deposit(100);
a1.withdraw(50);
a2.deposit(5000);
a2.withdraw(230);

a1.annualInterest();
a2.annualInterest();

a1.printTransactions();
a2.printTransactions();
a3.printTransactions();


    }
}

class Account{                    // Diss variabler kaldes indstans variabler
  protected    int accountNo;
  protected String owner;
     protected double balance;                //Indestående
   protected double interestRate;           // Årlig rente i %
    protected static int noOfAccoutns=0;
    protected ArrayList<Transaction> transactions=new ArrayList<Transaction>();

    Account( String ow, double ir){
         noOfAccoutns++;
   accountNo=noOfAccoutns;
        owner=ow;
        interestRate=ir;
         balance=0;

    }
    void setOwner(String newName){
        owner=newName;
    }
void deposit(double amount){
        balance=balance+amount;
        transactions.add(new Transaction("Indsat", amount,balance));
    }
    void withdraw(double amount){
        balance=balance-amount;
        transactions.add(new Transaction("Hævet", amount,balance));
    }

    void annualInterest(){
        double amount=balance*interestRate/100;
        balance=balance+amount;
        transactions.add(new Transaction("Renter", amount,balance));
    }


    public String toString(){
        return "Kontonr: "+accountNo+"\t"+owner+"\t"+balance;
    }
void printTransactions(){
    System.out.println(this);
    System.out.println("Tekst\tDato\t\tBelob\tSaldo");
        for (Transaction t: transactions)
            System.out.println(t);
    System.out.println();
    }
}

class Transaction{
    String text;
    LocalDate date;
    double amount;
    double newBalance;

    Transaction(String text, double amount, double newBalance){
    this.text=text;
    this.amount=amount;
    this.newBalance=newBalance;
    date=LocalDate.now();
    }

    @Override
    public String toString() {
        return text+"\t"+date+"\t"+amount+"\t"+newBalance;
    }
}
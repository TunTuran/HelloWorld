import java.util.ArrayList;

public class Polynomium {
    public static void main(String[] args) {
Polynomiumer f1=new ForstegradsPolynommium(3,2);
        Polynomiumer f2=new Andengradspolynomier(2,2,3);

        ArrayList<Polynomiumer>list= new ArrayList<Polynomiumer>();
        list.add(f1);
        list.add(f2);

        for (Polynomiumer fl: list){
            System.out.println("Løsningen er: "+fl.f(2));
        }



    }
}
abstract class Polynomiumer{
    abstract double f(double x);
}
class ForstegradsPolynommium extends Polynomiumer{
    int a;
    int b;
    ForstegradsPolynommium(int aa, int bb){
         a=aa;
         b=bb;
    }
    double f(double x){
        return a*x+b;
    }

    @Override
    public String toString() {
        return "Førstegradspolynomi med værdierne a= "+a+" , b="+b+" f(x)= ";
    }
}
class Andengradspolynomier extends Polynomiumer {
    int a, b, c;

    Andengradspolynomier(int aa, int bb, int cc) {
        a = aa;
        b = bb;
        c = cc;
    }

    double f(double x) {
        return a * Math.pow(x, 2) + b * x + c;
    }

    @Override
    public String toString() {
        return "Andengradspolynomier er";
    }
}
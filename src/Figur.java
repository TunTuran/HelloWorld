import java.util.ArrayList;

public class Figur {
    public static void main(String[] args) {
        Figurs f1=new Rektangel(4,3);
        Figurs f2=new Punkt();

        ArrayList<Figurs>list=new ArrayList<Figurs>();
        list.add(f1);
        list.add(f2);
        list.add(new Rektangel(2,5));
        for (Figurs f: list){
            System.out.println(f+" om= "+f.beregnOmkreds()+ " a= "+f.beregnAreal());
        }
    }
}
abstract class Figurs {
    abstract double beregnOmkreds();
    abstract double beregnAreal();
}

class Rektangel extends Figurs{
    double hojde;
    double bredde;
    Rektangel(double h, double b){
        hojde=h;
        bredde=b;
    }
    double beregnOmkreds(){
        return 2*(hojde+bredde);
    }
    double beregnAreal(){
        return hojde*bredde;
    }

    @Override
    public String toString() {
        return "Rektangel h="+hojde+" b="+bredde;
    }
}
class Punkt extends Figurs{
     double beregnOmkreds(){return 0;}
     double beregnAreal(){return  0;}
    public String toString() {return "Punkt";}
}
package Pyramider;

public class Pyramide {
    public static void main(String[] args) {
        Pyramid a1= new Pyramid(10,35);
        Pyramid a2= new Pyramid(14,30);
        Pyramid a3= new Pyramid(8,40);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

    }


}

class Pyramid{
    double side;
    double height;
    double volume;


    Pyramid(double s,double h){
        side=s;
        height=h;
        volume= s*s*h/4;
    }

    @Override
    public String toString() {
        return "Pyramid " + "side= " + side + ", height= " + height + ", volume= " + volume;
    }
}

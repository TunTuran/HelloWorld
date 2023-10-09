public class Max3 {
    public static void main(String[] args) {
        int a=500;
        int b=17;
        int c=89;
        int d=max(a,max(b,c));
        System.out.println("Det største tal er :"+d);
    }
    static int max(int x,int y){
    if (x>y)
        return x;
    else
        return y;
    }
}
